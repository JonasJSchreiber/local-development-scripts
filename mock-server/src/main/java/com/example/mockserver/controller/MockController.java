package com.example.mockserver.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockController {

	@RequestMapping(method = RequestMethod.GET, value = "/sendSms/to/{toPhoneNumber}/body/{body}")
	public ResponseEntity<String> voxoxEndpoint(@PathVariable String toPhoneNumber,
			@PathVariable String body) {
		return new ResponseEntity<String>(UUID.randomUUID().toString(), HttpStatus.OK);
	}

}
