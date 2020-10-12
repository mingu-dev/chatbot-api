package com.chatbot.api.domain.scenario.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.chatbot.api.domain.scenario.dto.Response;
import com.chatbot.api.domain.scenario.dto.ScenarioBlock;
import com.chatbot.api.domain.scenario.dto.ScenarioRequest;
import com.chatbot.api.domain.scenario.dto.Utterance;
import com.chatbot.api.domain.scenario.model.MessageType;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ScenarioControllerTest {
	
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;
	
	@Test
	public void 시나리오_등록한다() {
        // given
        String url = "http://localhost:" + port + "/api/v1/scenario";

		Utterance utterance = Utterance.builder()
				.utteranceType(MessageType.TEXT)
				.utteranceContent("utterance content test")
				.build();
		Response response = Response.builder()
				.responseType(MessageType.TEXT)
				.responseContent("response content test")
				.build();
		ScenarioBlock block = ScenarioBlock.builder()
				.num(1L)
				.utterance(utterance)
				.response(response)
				.build();
		
		List<ScenarioBlock> blocks = new ArrayList<>();
		blocks.add(block);
		
        ScenarioRequest scenarioRequest = ScenarioRequest.builder()
        		.blocks(blocks)
                .build();

        // when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, scenarioRequest, Long.class);

        // then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
	}

}
