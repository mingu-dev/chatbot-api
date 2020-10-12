package com.chatbot.api.domain.scenario.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ScenarioRequest {
	
	private List<ScenarioBlock> blocks;
	
	@Builder
	public ScenarioRequest(List<ScenarioBlock> blocks) {
		this.blocks = blocks;
	}
}