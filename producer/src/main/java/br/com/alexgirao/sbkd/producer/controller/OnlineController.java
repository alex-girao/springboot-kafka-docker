package br.com.alexgirao.sbkd.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineController {
	@GetMapping("/online")
	public String getMessage() {
        return "Hello from Docker Producer App";
    }
}