package com.chatbot.api.domain.scenario.dto;

import com.chatbot.api.domain.scenario.model.Keyboard;
import com.chatbot.api.domain.scenario.model.Message;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MessageResponse {

	private Message message;
	private Keyboard keyboard;
	
	@Builder
	public MessageResponse(Message message, Keyboard keyboard) {
		this.message = message;
		this.keyboard = keyboard;
	}
}
