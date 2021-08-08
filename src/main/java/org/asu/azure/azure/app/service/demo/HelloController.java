package org.asu.azure.azure.app.service.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloApi/")
public class HelloController {

	@GetMapping("hello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hi from java appService",HttpStatus.OK);
	}
}
