package com.renu.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
private static final Logger LOGGER=LoggerFactory.getLogger(HelloController.class);

@RequestMapping(value="/hello/server")
public String hello() {
	LOGGER.info("From class HelloController,method : hello()");
   return "From server ";
}
}
