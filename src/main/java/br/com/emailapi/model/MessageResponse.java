package br.com.emailapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageResponse {

	@JsonProperty(value = "message")
	private String message;

	public MessageResponse() {
	}

	public MessageResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageResponse [message=" + message + "]";
	}

}