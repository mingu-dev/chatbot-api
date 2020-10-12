package com.chatbot.api.domain.scenario.dto;

import javax.persistence.Embeddable;

import com.chatbot.api.domain.scenario.model.MessageType;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class Utterance {
	
    private MessageType utteranceType;
    private String utteranceContent;
    
    @Builder
    public Utterance(MessageType utteranceType, String utteranceContent) {
    	this.utteranceType = utteranceType;
    	this.utteranceContent = utteranceContent;
    }
}