package com.chatbot.api.domain.scenario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatbot.api.domain.scenario.dto.MessageRequest;
import com.chatbot.api.domain.scenario.dto.MessageResponse;
import com.chatbot.api.domain.scenario.service.MessageService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/message")
@RestController
public class MessageController {

	private final MessageService messageService;
	
	@GetMapping
	public MessageResponse retrieve(@RequestBody MessageRequest messageRequest) {
		return messageService.retrieve(messageRequest);
	}
}
