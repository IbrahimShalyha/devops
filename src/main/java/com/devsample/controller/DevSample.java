package com.devsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevSample {

	@GetMapping(value = "/getThis")
	public String getThis() {
		return "IBRAHIMSHALYHA";
	}
}
