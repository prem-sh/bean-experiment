package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Battery {
	private int id;
	private String model;
	public Battery(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
