package com.rickandmortyapi.app.middleware;

public class CharacterDTO {

    private final String name;
    private final String species;
    private final String gender;
    private final String image;
    private final LocationDTO location;
    
	public CharacterDTO(String name, String species, String gender, String image, LocationDTO location) {
		super();
		this.name = name;
		this.species = species;
		this.gender = gender;
		this.image = image;
		this.location = location;
	}
    
	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public String getGender() {
		return gender;
	}

	public String getImage() {
		return image;
	}

	public LocationDTO getLocation() {
		return location;
	}
    
}
