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
	public Long save(ScenarioRequest scenarioRequest) {
		return scenarioRepository.save(convertDtoToEntity(scenarioRequest)).getId();
	}
	
	public ScenarioEntity convertDtoToEntity(ScenarioRequest scenarioRequest) {
		return ScenarioEntity.builder()
				.content(scenarioRequest.getContent())
				.build();
	}
}
