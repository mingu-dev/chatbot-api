package com.chatbot.api.domain.scenario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.chatbot.api.domain.scenario.dto.Response;
import com.chatbot.api.domain.scenario.dto.Utterance;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "scenario")
public class ScenarioEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Utterance utterance;
	
	private Response response;
	
	@Builder
	public ScenarioEntity(Utterance utterance, Response response) {
		this.utterance = utterance;
		this.response = response;
	}
}