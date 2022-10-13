package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Suspension {
	private int id;
	private String model;
	public Suspension(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
