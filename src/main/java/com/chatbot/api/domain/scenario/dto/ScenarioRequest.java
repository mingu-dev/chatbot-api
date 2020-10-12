package com.chatbot.api.domain.scenario.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ScenarioRequest {
	
	private Utterance utterance;
	
	private Response response;
	
	@Builder
	public ScenarioRequest(Utterance utterance, Response response) {
		this.utterance = utterance;
		this.response = response;
	}
}