package com.oreilly.controller;

import com.oreilly.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@Autowired
	private Message message;


	@RequestMapping("/")
	public String welcome(){

		return "Welcome: " + message.getMessageValue();
	}
}
