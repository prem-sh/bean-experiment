package com.premsh.xmlappcontext;

import java.util.ArrayList;
import java.util.List;

public class IdGenerator {
	
	public IdGenerator() {
		System.out.println("Id generator initiated");
	}
	private List<Integer> index = new ArrayList<Integer>(); 
	public int generate() {
		Integer idx = null;
		while(idx == null){
			idx = (int)(Math.random()*100000);
			if(index.contains(idx)) idx = null;
		}
		return idx;
	}
}

