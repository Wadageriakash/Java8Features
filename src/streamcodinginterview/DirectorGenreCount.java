package streamcodinginterview;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

// Q.3) Find the number of genres of each director's movies
class Movie {
    private String director;
    private String genre;

    public Movie(String director, String genre) {
        this.director = director;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }
}


public class DirectorGenreCount {

	public static void main(String [] args) {
		  List<Movie> movies = List.of(
	                new Movie("Prashant Neel", "Action"),
	                new Movie("Prashant Neel", "Thriller"),
	                new Movie("Prashant Neel", "Action"),
	                new Movie("Rajamouli", "Adventure"),
	                new Movie("Rajamouli", "Fantasy"),
	                new Movie("Rajamouli", "Action"),
	                new Movie("Christopher Nolan", "Sci-Fi"),
	                new Movie("Christopher Nolan", "Thriller"),
	                new Movie("Christopher Nolan", "Drama"),
	                new Movie("Christopher Nolan", "Sci-Fi")
	        );
		  
		  Map<String, Long> result = movies.stream().collect(Collectors.groupingBy(
				  Movie::getDirector, Collectors.counting()));
		  System.out.println(result); // {Christopher Nolan=4, Prashant Neel=3, Rajamouli=3}

		// Group by director and count the number of unique genres per director
	        Map<String, Object> genreCountByDirector = movies.stream()
	                .collect(Collectors.groupingBy(
	                        Movie::getDirector,
	                        Collectors.mapping(Movie::getGenre, Collectors.collectingAndThen(
	                                Collectors.toSet(), Set::size // Convert to Set to get unique genres and count them
	                        ))
	                ));

	        // Print the results
	        genreCountByDirector.forEach((director, count) ->
	                System.out.println(director + " -> " + count + " genres"));
//	        Christopher Nolan -> 3 genres
//	        Prashant Neel -> 2 genres
//	        Rajamouli -> 3 genres
	}
}
