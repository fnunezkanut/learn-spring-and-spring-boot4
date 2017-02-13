package com.oreilly.config;

import com.oreilly.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {

	@Bean
	@Profile("prod")
	public Message myMessage(  ){

		Message message = new Message();

		message.setMessageValue( 1 );

		return message;
	}

	@Bean
	@Profile("dev")
	public Message myMessageDev( ){

		Message message = new Message();

		message.setMessageValue( 0 );

		return message;
	}
}
