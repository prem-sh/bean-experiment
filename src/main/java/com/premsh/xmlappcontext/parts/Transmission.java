package com.premsh.xmlappcontext.parts;

import com.premsh.xmlappcontext.IdGenerator;

public class Transmission {
	private int id;
	private String model;
	public Transmission(String model, IdGenerator generator) {
		this.id = generator.generate();
		this.model = model;
	}
}
