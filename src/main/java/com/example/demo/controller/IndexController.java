package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@PostMapping("/welcome")
	public String welcome(@RequestParam(required = false, name = "param") String[] paramArray) {
		String msg = "";
		if (paramArray == null) {
			msg = "El array esta vacio";
		} else {
			int i = 0;
			for (String param : paramArray) {
				msg += "param[" + i + "]=" + param + "\n";
				i++;
			}
		}
		return msg;
	}

}
