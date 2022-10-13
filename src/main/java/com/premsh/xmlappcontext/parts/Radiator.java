package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Radiator {
	private int id;
	private String model;
	public Radiator(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
