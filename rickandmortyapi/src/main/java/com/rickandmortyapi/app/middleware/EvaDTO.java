package com.rickandmortyapi.app.middleware;

public class EvaDTO {
	
	private final int number;
	private final boolean isHappy;
	
	public EvaDTO(int number, boolean isHappy) {
		super();
		this.number = number;
		this.isHappy = isHappy;
	}

	public int getMunber() {
		return number;
	}

	public boolean isHappy() {
		return isHappy;
	}
	
}
