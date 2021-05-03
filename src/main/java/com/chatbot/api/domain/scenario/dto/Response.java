package com.chatbot.api.domain.scenario.dto;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Embeddable
public class Response {
	
    private String responseType;
    private String responseContent;
    
    @Builder
    public Response(String responseType, String responseContent) {
    	this.responseType = responseType;
    	this.responseContent = responseContent;
    }
}