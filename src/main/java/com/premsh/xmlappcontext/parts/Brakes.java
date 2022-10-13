package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Brakes {
	private int id;
	private String model;
	public Brakes(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
