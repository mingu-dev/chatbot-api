package com.chatbot.api.domain.scenario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	private String content;
	
	@Builder
	public ScenarioEntity(Long id, String content) {
		this.id = id;
		this.content = content;
	}
}
