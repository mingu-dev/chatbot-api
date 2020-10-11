package com.chatbot.api.domain.scenario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.api.domain.scenario.model.ScenarioEntity;

public interface ScenarioRepository extends JpaRepository<ScenarioEntity, Long> {

}
