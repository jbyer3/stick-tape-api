package com.jmoney.StickyTapeAPI.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "actors")
public class Actor {

	public Actor(String firstName, String lastName, Long activeSinceYear, Date birthDate) {
		super();

		this.firstName = firstName;
		this.lastName = lastName;
		this.activeSinceYear = activeSinceYear;
		this.birthDate = birthDate;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length = 75, nullable = false)
	private String firstName;
	@Column(length = 75, nullable = false)
	private String lastName;
	@Column(nullable = true)
	private Long activeSinceYear;
	@Column(nullable = true)
	private Date birthDate;

	@JsonIgnore
	@ManyToMany(mappedBy = "actors")
	private List<Movie> movies;
	
	@OneToMany
	private List<Award> awards;

	public Actor() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public List<Movie> getMovies(){
		return movies;
	}
	
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getActiveSinceYear() {
		return activeSinceYear;
	}

	public void setActiveSinceYear(Long activeSinceYear) {
		this.activeSinceYear = activeSinceYear;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public List<Award> getAwards() {
		return awards;
	}

	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}

}

