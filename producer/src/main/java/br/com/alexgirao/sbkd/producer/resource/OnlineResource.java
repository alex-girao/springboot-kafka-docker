package br.com.alexgirao.sbkd.producer.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineResource {
	@GetMapping("/online")
	public String getMessage() {
        return "Hello from Docker Producer App";
    }
}