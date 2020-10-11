package com.chatbot.api.domain.scenario.controller;

import static org.assertj.core.api.Assertions.assertThat;

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

import com.chatbot.api.domain.scenario.dto.ScenarioRequest;
import com.chatbot.api.domain.scenario.model.ScenarioEntity;
import com.chatbot.api.domain.scenario.repository.ScenarioRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ScenarioControllerTest {
	
    @LocalServerPort
    private int port;
    
    @Autowired
    private TestRestTemplate restTemplate;
	
	@Autowired
	private ScenarioRepository scenarioRepository;
	
	@Test
	public void 시나리오_등록한다() {
        // given
        String content = "test";
        ScenarioRequest scenarioRequest = ScenarioRequest.builder()
                .content(content)
                .build();
        String url = "http://localhost:" + port + "/api/v1/scenario";

        // when
        ResponseEntity<Long> responseEntity = restTemplate.postForEntity(url, scenarioRequest, Long.class);

        // then
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(1L);
        
        List<ScenarioEntity> scenarios = scenarioRepository.findAll();
        assertThat(scenarios.get(0).getId()).isEqualTo(1L);
        assertThat(scenarios.get(0).getContent()).isEqualTo("test");
	}

}
