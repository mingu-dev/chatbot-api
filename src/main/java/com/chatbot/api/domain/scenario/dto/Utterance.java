package com.chatbot.api.domain.scenario.dto;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class Utterance {
	
    private String utteranceType;
    private String utteranceContent;
    
    @Builder
    public Utterance(String utteranceType, String utteranceContent) {
    	this.utteranceType = utteranceType;
    	this.utteranceContent = utteranceContent;
    }
}