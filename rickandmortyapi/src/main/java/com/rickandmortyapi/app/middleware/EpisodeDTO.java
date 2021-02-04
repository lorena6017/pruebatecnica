package com.rickandmortyapi.app.middleware;

import java.util.List;

public class EpisodeDTO {

	private final long episode;
	private final String episodeName;
	private final List<CharacterDTO> characters;

	public EpisodeDTO(long episode, String episodeName, List<CharacterDTO> characters) {
		this.episode = episode;
		this.episodeName = episodeName;
		this.characters = characters;
	}

	public long getEpisode() {
		return episode;
	}

	public String getEpisodeName() {
		return episodeName;
	}

	public List<CharacterDTO> getCharacters() {
		return characters;
	}
	
}
