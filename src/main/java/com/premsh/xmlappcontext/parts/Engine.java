package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Engine {
	private int id;
	private String model;
	public Engine(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
