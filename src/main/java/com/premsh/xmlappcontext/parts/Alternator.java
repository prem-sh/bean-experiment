package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Alternator {
	private int id;
	private String model;
	public Alternator(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
