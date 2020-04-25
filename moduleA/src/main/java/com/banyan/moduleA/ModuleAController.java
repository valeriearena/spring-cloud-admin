package com.banyan.moduleA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleAController {

	@GetMapping
	public String getModuleA() {

		return "Hello from ModuleA";

	}
}
