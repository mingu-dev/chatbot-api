package com.chatbot.api.domain.scenario.dto;

import javax.persistence.Embeddable;

import com.chatbot.api.domain.scenario.model.MessageType;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class Response {
	
    private MessageType responseType;
    private String responseContent;
    
    @Builder
    public Response(MessageType responseType, String responseContent) {
    	this.responseType = responseType;
    	this.responseContent = responseContent;
    }
}