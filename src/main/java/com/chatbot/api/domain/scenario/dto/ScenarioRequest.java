package com.chatbot.api.domain.scenario.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ScenarioRequest {
	
	private String content;
	
	@Builder
	public ScenarioRequest(String content) {
		this.content = content;
	}
}
