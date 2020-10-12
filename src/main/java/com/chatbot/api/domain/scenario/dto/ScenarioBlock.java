package com.chatbot.api.domain.scenario.dto;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Data
@Embeddable
public class ScenarioBlock {
	
	private Long num;
	
	@Embedded
	private Utterance utterance;
	
	@Embedded
	private Response response;
	
	@Builder
	public ScenarioBlock(Long num, Utterance utterance, Response response) {
		this.num = num;
		this.utterance = utterance;
		this.response = response;
	}
}