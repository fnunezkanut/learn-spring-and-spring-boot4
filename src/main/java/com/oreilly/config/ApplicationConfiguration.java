package com.oreilly.config;

import com.oreilly.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ApplicationConfiguration {

//	@Bean
	public Message myMessage( @Value("${my.message}") String str ){

		Message message = new Message();

		message.setMessageValue( str );

		return message;
	}
}
