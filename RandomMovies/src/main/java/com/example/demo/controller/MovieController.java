package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;

@Controller
public class MovieController {

	
	private MovieService movieService ; 
	
	@Autowired
	public MovieController (MovieService movieService) {
		this.movieService = movieService ; 
	}
	
	
	
    @GetMapping("/")
    public String home(Model model){
    	
    	Optional<Movie> movie = movieService.getTheMovie() ; 
    	
    	Movie movie2 = movie.get();  
    	
    model.addAttribute("movie", movie2 );
        return "index";
    }
    
    
	
	
	
}
