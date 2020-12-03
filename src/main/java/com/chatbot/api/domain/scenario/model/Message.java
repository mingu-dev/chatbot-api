package com.chatbot.api.domain.scenario.model;

import lombok.Builder;

public class Message {

	private String text;
	private Photo photo;
	private MessageButton message_button;
	
	@Builder
	public Message(String text, Photo photo, MessageButton message_button) {
		super();
		this.text = text;
		this.photo = photo;
		this.message_button = message_button;
	}
}
