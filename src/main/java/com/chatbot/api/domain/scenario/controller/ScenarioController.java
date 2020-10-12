package com.chatbot.api.domain.scenario.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.api.domain.scenario.dto.ScenarioRequest;
import com.chatbot.api.domain.scenario.service.ScenarioService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/scenario")
@RestController
public class ScenarioController {
	
	private final ScenarioService scenarioService;
	
	@PostMapping
	public void save(@RequestBody ScenarioRequest scenarioRequest) {
		scenarioService.save(scenarioRequest);
	}
}
