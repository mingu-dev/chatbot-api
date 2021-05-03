package com.chatbot.api.domain.scenario.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MessageRequest {

	private Long id;
	private String type;
	private String content;
}
