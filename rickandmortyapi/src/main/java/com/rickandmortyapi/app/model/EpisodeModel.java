package com.rickandmortyapi.app.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "episode")
public class EpisodeModel extends AuditModel {
    @Id
    @GeneratedValue(generator = "episode_generator")
    @SequenceGenerator(
            name = "episode_generator",
            sequenceName = "episode_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String name;
    
    @Column(columnDefinition = "text")
    private String airDate;
    
    @ManyToMany()
    private Set<CharacterModel> characters;
    
    @OneToMany()
    private Set<EpisodeModel> episode;
    
    @Column(columnDefinition = "text")
    private String url;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAirDate() {
		return airDate;
	}

	public void setAirDate(String airDate) {
		this.airDate = airDate;
	}

	public Set<CharacterModel> getCharacters() {
		return characters;
	}

	public void setCharacters(Set<CharacterModel> characters) {
		this.characters = characters;
	}

	public Set<EpisodeModel> getEpisode() {
		return episode;
	}

	public void setEpisode(Set<EpisodeModel> episode) {
		this.episode = episode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
