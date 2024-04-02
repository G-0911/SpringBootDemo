package com.ktga.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class student {
	
	@Autowired
	Attenence at;
	void call() {
		System.out.println("Student Class Called");
		at.attenence();
	}
}
