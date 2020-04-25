package com.banyan.moduleB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleBController {

	@GetMapping
	public String getModuleA() {

		return "Hello from ModuleB";

	}
}
