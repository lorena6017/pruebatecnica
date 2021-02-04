package com.rickandmortyapi.app.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "location")
public class LocationModel extends AuditModel {
    @Id
    @GeneratedValue(generator = "location_generator")
    @SequenceGenerator(
            name = "location_generator",
            sequenceName = "location_sequence",
            initialValue = 1000
    )
    private Long id;

    @Column(columnDefinition = "text")
    private String name;
    
    @Column(columnDefinition = "text")
    private String type;
    
    @Column(columnDefinition = "text")
    private String dimension;
    
    @OneToMany()
    private Set<CharacterModel> residents;
    
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Set getResidents() {
		return residents;
	}

	public void setResidents(Set residents) {
		this.residents = residents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
}
