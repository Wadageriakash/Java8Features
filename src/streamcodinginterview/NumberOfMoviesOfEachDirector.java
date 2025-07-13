package streamcodinginterview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Q.1) Find the number of movies of each director

class Movies{
	
	private String director;
	private String movies;
	
	public Movies(String director, String movies) {
		this.director = director;
		this.movies = movies;
	}
	
	public String getMovies() {
		return movies;
	}
	
	public String getDirector() {
		return director;
	}
}
public class NumberOfMoviesOfEachDirector {

	public static void main(String[] args) {
		
		List<Movies> moviesOfEachDirector = List.of(
				new Movies("Prashant Neel", "Ugram"),
				new Movies("Prashant Neel", "Salaar"),
				new Movies("Prashant Neel", "Kgf"),
				new Movies("Rajmouli", "Bahubali"),
				new Movies("Rajmouli", "Magadhira"));
		
		Map<String, Long> result = moviesOfEachDirector.stream().collect(Collectors.groupingBy(Movies::getDirector,
				Collectors.counting()));
		
		System.out.println(result); // {Prashant Neel=3, Rajmouli=2}

		
		
	}
}
