package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * instalar plugin spring tools en eclipse
 */
@RestController
public class DemoController {
	
	@RequestMapping("/")
	public String holaMundo() {
		return "Ey que tal estas chaval?";
	}
}
