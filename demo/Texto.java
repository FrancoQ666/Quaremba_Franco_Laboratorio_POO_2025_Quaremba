package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;



@RestController
public class Texto {
	@GetMapping("/hola")
	public Map <String, String> holaApi() {
	        	
	return Collections.singletonMap("Mensaje", "a ve como funciona esta vaina");
    }
}
