package com.dharshinicodes.springbootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringbootEmailApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {

		SpringApplication.run(SpringbootEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmailWithAttachment() throws MessagingException {
		senderService.sendEmailWithAttachment("gr.dharshiniraja96@gmail.com",
				"This is the subject",
				"This is the body of the email",
				"C:\\Users\\kirupa gr\\Desktop\\test.jpg");

	}

}
