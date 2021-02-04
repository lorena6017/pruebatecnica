package com.rickandmortyapi.app.model;

import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "character")
public class CharacterModel extends AuditModel {
    @Id
    @GeneratedValue(generator = "character_generator")
    @SequenceGenerator(
            name = "character_generator",
            sequenceName = "character_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String name;

    @Column(columnDefinition = "text")
    private String status;
    
    @Column(columnDefinition = "text")
    private String species;
    
    @Column(columnDefinition = "text")
    private String type;
    
    @Column(columnDefinition = "text")
    private String gender;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "location_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private LocationModel origin;
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "location_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private LocationModel location;
    
    @Column(columnDefinition = "text")
    private String image;
    
    @ManyToMany()
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocationModel getOrigin() {
		return origin;
	}

	public void setOrigin(LocationModel origin) {
		this.origin = origin;
	}

	public LocationModel getLocation() {
		return location;
	}

	public void setLocation(LocationModel location) {
		this.location = location;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Set getEpisode() {
		return episode;
	}

	public void setEpisode(Set episode) {
		this.episode = episode;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}
