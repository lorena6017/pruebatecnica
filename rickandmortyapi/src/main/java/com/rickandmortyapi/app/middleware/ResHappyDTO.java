package com.rickandmortyapi.app.middleware;

import java.util.List;

public class ResHappyDTO {

	private final List<EvaDTO> numbers;

	public ResHappyDTO(List<EvaDTO> numbers) {
		super();
		this.numbers = numbers;
	}

	public List<EvaDTO> getNumbers() {
		return numbers;
	}
	
}
