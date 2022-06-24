package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Movie {
	@Id
	@SequenceGenerator (
			name = "student_sequence",
			sequenceName  = "student_sequence",
			allocationSize = 1 
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
			)
	private Long id;
	private String name; 
	private Double imdb; 
	private String genre ; 
	private String plot ; 
	private String imageUrl ;
	
	public Movie() {

	}
	public Movie(String name, Double imdb, String genre, String plot, String imageUrl) {
		this.name = name;
		this.imdb = imdb;
		this.genre = genre;
		this.plot = plot;
		this.imageUrl = imageUrl;
	}
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
	public Double getImdb() {
		return imdb;
	}
	public void setImdb(Double imdb) {
		this.imdb = imdb;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	} 
	
	
	
	

}
