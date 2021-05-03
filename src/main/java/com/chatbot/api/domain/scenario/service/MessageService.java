package com.chatbot.api.domain.scenario.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chatbot.api.domain.scenario.dto.MessageRequest;
import com.chatbot.api.domain.scenario.dto.MessageResponse;
import com.chatbot.api.domain.scenario.model.Message;
import com.chatbot.api.domain.scenario.model.MessageEntity;
import com.chatbot.api.domain.scenario.repository.MessageRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MessageService {

	private final MessageRepository messageRepository;
	
	public MessageResponse retrieve(MessageRequest messageRequest) {
		Optional<MessageEntity> optional = messageRepository.findById(messageRequest.getId());
		MessageEntity entity = optional.get();
		MessageResponse messageResponse = new MessageResponse();
		
		if (entity.getUtterance_content().equals(messageRequest.getContent())) {
			messageResponse = MessageResponse.builder()
					.message(new Message(entity.getResponse_content(), null, null))
					.build();
		}
		return messageResponse;
	}
	
	/*
	public MessageEntity convertDtoToEntity(MessageRequest messageRequest) {
		return MessageEntity.builder()
				.scenario_id(messageRequest.getId())
				.type(messageRequest.getType())
				.content(messageRequest.getContent())
				.build();
	}
	*/
}
