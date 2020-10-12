package com.chatbot.api.domain.scenario.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chatbot.api.domain.scenario.dto.ScenarioRequest;
import com.chatbot.api.domain.scenario.model.ScenarioEntity;
import com.chatbot.api.domain.scenario.repository.ScenarioRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ScenarioService {
	
	private final ScenarioRepository scenarioRepository;
	
	@Transactional
	public void save(ScenarioRequest scenarioRequest) {
		scenarioRepository.save(convertDtoToEntity(scenarioRequest));
	}
	
	public ScenarioEntity convertDtoToEntity(ScenarioRequest scenarioRequest) {
		return ScenarioEntity.builder()
				.blocks(scenarioRequest.getBlocks())
				.build();
	}
}