package com.chatbot.api.domain.scenario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chatbot.api.domain.scenario.model.MessageEntity;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

}
