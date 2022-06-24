package com.example.demo.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {

	private MovieRepository movieRepository ; 
	
	@Autowired
	public MovieService (MovieRepository movieRepository) {
		this.movieRepository = movieRepository ; 
	}
	
	
	public Optional<Movie> getTheMovie() {	
		Random r = new Random(); 
	int random = r.nextInt(9 - 1 + 1) + 1 ;

		return movieRepository.findById((long)random); 
	}
	
	
	
	
}
