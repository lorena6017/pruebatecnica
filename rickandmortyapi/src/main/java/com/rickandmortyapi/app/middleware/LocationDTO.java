package com.rickandmortyapi.app.middleware;

public class LocationDTO {
	
    private final String name;
    private final String type;
    private final String dimension;
    
	public LocationDTO(String name, String type, String dimension) {
		super();
		this.name = name;
		this.type = type;
		this.dimension = dimension;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getDimension() {
		return dimension;
	}
    
}
