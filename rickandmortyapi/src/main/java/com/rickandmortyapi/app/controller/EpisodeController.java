package com.rickandmortyapi.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rickandmortyapi.app.middleware.CharacterDTO;
import com.rickandmortyapi.app.middleware.EpisodeDTO;
import com.rickandmortyapi.app.middleware.LocationDTO;
import com.rickandmortyapi.app.model.CharacterModel;
import com.rickandmortyapi.app.model.EpisodeModel;
import com.rickandmortyapi.app.model.LocationModel;
import com.rickandmortyapi.app.repository.EpisodeRepository;

@RestController
public class EpisodeController {

	@Autowired
    private EpisodeRepository episodeRepository;
	
	@GetMapping("/episode/{id}")
	public EpisodeDTO episode(@PathVariable Long id) {
		EpisodeDTO episodeDTO = null;
		EpisodeModel episode = episodeRepository.getOne(id);
		if (episode != null) {
			List<CharacterDTO> characters = new ArrayList<CharacterDTO>(); 
			for (CharacterModel characterModel: episode.getCharacters()) {
				LocationModel locationModel = characterModel.getLocation();
				LocationDTO LocationDTO = new LocationDTO(
						locationModel.getName(), 
						locationModel.getType(),
						locationModel.getDimension()
				);
				CharacterDTO character = new CharacterDTO(
						characterModel.getName(),
						characterModel.getSpecies(),
						characterModel.getGender(),
						characterModel.getImage(),
						LocationDTO
				);
				characters.add(character);
			}
			episodeDTO = new EpisodeDTO(
					episode.getId(),
					episode.getName(),
					characters
			);
		}
		return episodeDTO;
	}
}
