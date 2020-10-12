package com.chatbot.api.domain.scenario.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.chatbot.api.domain.scenario.dto.ScenarioBlock;

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
	
    @ElementCollection
    @CollectionTable(name = "block")
    private List<ScenarioBlock> blocks;
	
	@Builder
	public ScenarioEntity(Long id, List<ScenarioBlock> blocks) {
		this.id = id;
		this.blocks = blocks;
	}
}