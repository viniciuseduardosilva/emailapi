package br.com.emailapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Email {

	@JsonProperty("email")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
