package ru.parfen.spring.example.tacos;

import lombok.Data;

@Data
public class Ingredient {
	
	private final String id;
	private final String name;
	private final Type type;
	
	public enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE;
		
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	}

}
