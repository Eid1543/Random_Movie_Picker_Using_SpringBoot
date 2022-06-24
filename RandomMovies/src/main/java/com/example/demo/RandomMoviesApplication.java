package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;

@SpringBootApplication
public class RandomMoviesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RandomMoviesApplication.class, args);
	}
	
	@Autowired
	private MovieRepository movieRepository;

	// seeding data to the database
	@Override
	public void run(String... args) throws Exception {
		
		Movie earth = new Movie("Earth", 7.9 , "Documentary", "Feature-length version of the documentary TV series Planet Earth (2006), following the migration paths of four animal families." , "https://e.snmc.io/i/300/s/b7583c901255321c2edb654a3834a89e/3375419" );  
		Movie bornInChina = new Movie("Born in China" , 7.2 , "Documentary", "Venturing into the wilds of China, \"Born in China\" captures intimate moments with a panda and her growing cub, a young golden monkey who feels displaced by his baby sister, and a mother snow leopard struggling to raise her two cubs." , "https://m.media-amazon.com/images/M/MV5BMTYyMDE5NDU4NV5BMl5BanBnXkFtZTgwNjQ5MjE4MDI@._V1_.jpg"); 
		Movie oceans = new Movie("oceans", 7.7, "Documentary", "An ecological drama/documentary, filmed throughout the globe. Part thriller, part meditation on the vanishing wonders of the sub-aquatic world.", "https://m.media-amazon.com/images/M/MV5BMjIwZjU3ZjgtNGJhOC00Mzk3LTg3YTItOTFlYmQ2NjdlYWE3XkEyXkFqcGdeQXVyMjc1NTg2NTI@._V1_FMjpg_UX1000_.jpg"); 
		
		movieRepository.save(earth); 
		movieRepository.save(bornInChina); 
		movieRepository.save(oceans);
		
		Movie africanCats = new Movie("African Cats", 7.5, "Documentary", "Meet Mara, an endearing lion cub striving to be like her mother; Sita, a cheetah and single mother of five; and Fang, a proud leader of the pride who must defend his family from a rival lion.", "https://m.media-amazon.com/images/M/MV5BMTYxOTQ3MjM5OV5BMl5BanBnXkFtZTcwMDYzMjAyNA@@._V1_.jpg");
		Movie winged_Migration = new Movie("Winged Migration", 7.9, "Documentary", "Documentary on the migratory patterns of birds, shot over the course of three years on all seven continents.", "https://m.media-amazon.com/images/M/MV5BMTkwOTg5MTI5N15BMl5BanBnXkFtZTYwNTQ3Njk5._V1_.jpg");
		Movie crimson = new Movie("The Crimson Wing: Mystery of the Flamingos", 7.3, "Documentary", "The mysterious lives of flamingos are captured on film with a birds-eye view of the animals living in Africa.", "https://m.media-amazon.com/images/M/MV5BNTYwMWRlNWItMTBiZi00YmZjLTg4YzItYTIzNDlkOGQ4Y2ZlXkEyXkFqcGdeQXVyMjc1NTg2NTI@._V1_.jpg");
		
		
		
		movieRepository.save(africanCats); 
		movieRepository.save(winged_Migration); 
		movieRepository.save(crimson);
		
		Movie monkey_Kingdom = new Movie("Monkey Kingdom", 7.2, "Documentary", "Life is an adventure for a young monkey and her son, living among ancient ruins in the jungle. But when her family is forced from their home, she must lead them to safety amidst strange new creatures and surroundings", "https://m.media-amazon.com/images/M/MV5BMzIxNDc1MDg0MF5BMl5BanBnXkFtZTgwNTI3ODE4MzE@._V1_.jpg");
		Movie Seasons = new Movie("Seasons", 7.2, "Documentary", "Jacques Perrin and Jacques Cluzaud return to the lush green forests, when the ice retreated, and the cycle of seasons was established. SEASONS is the awe-inspiring tale of the long shared history that binds humankind and nature.", "https://m.media-amazon.com/images/M/MV5BYTJkODU3MzgtOWFiMS00ZjAyLWI5OTctNjExMmJhYTQ2NGIyXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_.jpg");
		Movie growing = new Movie("Growing Up Wild", 7.2, "Documentary", "Travel to the wildest corners of the planet as five courageous animals tackle the very first challenges of their young lives. With a little guidance from sage family members, each must figure out how to find food and recognize danger", "https://m.media-amazon.com/images/M/MV5BMDBkMzVhMTQtYTRlNi00NjY3LThiYmYtYzRhZjY1ZjQ1MzQ1L2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMjIyMDkxODA@._V1_FMjpg_UX1000_.jpg");
		
		movieRepository.save(monkey_Kingdom); 
		movieRepository.save(Seasons); 
		movieRepository.save(growing);
 
		
		
		
	} 
	
	
	
	

}
