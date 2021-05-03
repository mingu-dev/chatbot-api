package com.chatbot.api.domain.scenario.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class MessageEntity {

	@Id
	private Long id;
	private String utterance_type;
	private String utterance_content;
	private String response_type;
	private String response_content;
	
	@Builder
	public MessageEntity(Long id, String utterance_type, String utterance_content, String response_type,
			String response_content) {
		this.id = id;
		this.utterance_type = utterance_type;
		this.utterance_content = utterance_content;
		this.response_type = response_type;
		this.response_content = response_content;
	}
}
