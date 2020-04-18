package org.test.MySpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTestController {
	
	@GetMapping(path="/hello")
	public String sayHello() {
		return "Hello";
	}
}
