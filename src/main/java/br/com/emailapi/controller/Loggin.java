package br.com.emailapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.emailapi.model.Email;
import br.com.emailapi.model.MessageResponse;
import br.com.emailapi.service.EmailService;

@RestController
@RequestMapping("/")
public class Loggin {
	
	@Autowired
	private EmailService emailService;

	@PostMapping("recuperarsenha")
	public ResponseEntity<MessageResponse> recuperaSenha(@RequestBody Email email) throws Exception {

		emailService.sendEmail(email.getEmail());
		
		System.out.println(email.getEmail());
		
		return new ResponseEntity<MessageResponse>(new MessageResponse("Ok"), HttpStatus.CREATED);
	}

}
