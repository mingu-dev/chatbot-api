package com.chatbot.api.domain.scenario.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.chatbot.api.domain.scenario.dto.MessageResponse;
import com.chatbot.api.domain.scenario.dto.Response;
import com.chatbot.api.domain.scenario.dto.ScenarioRequest;
import com.chatbot.api.domain.scenario.dto.Utterance;
import com.google.gson.JsonObject;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MessageControllerTest {
	
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;
    
    @Test
    public void 메세징_읽어온다() {
    	// given
    	JsonObject json = new JsonObject();
    	json.addProperty("id", 1L);
    	json.addProperty("type", "text");
    	json.addProperty("content", "안녕!");
    	
        String url = "http://localhost:" + port + "/api/v1/scenario";

		Utterance utterance = Utterance.builder()
				.utteranceType("text")
				.utteranceContent("utterance content test")
				.build();
		Response response = Response.builder()
				.responseType("text")
				.responseContent("response content test")
				.build();
		
        ScenarioRequest scenarioRequest = ScenarioRequest.builder()
        		.utterance(utterance)
        		.response(response)
                .build();

        // when
        restTemplate.postForEntity(url, scenarioRequest, Long.class);
        
        url = "http://localhost:" + port + "/api/v1/message";
        ResponseEntity<MessageResponse> responseEntity = restTemplate.getForEntity(url, MessageResponse.class);
        
        // then
        assertThat(responseEntity.getStatusCode()).isEqualTo(1L);
    }
}
