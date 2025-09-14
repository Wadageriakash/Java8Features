package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie{
	private String name; 
    private double rating; 
    private int year;   
    
    public Movie(String name, double rating, int year) {
    	this.name = name;
    	this.rating = rating;
    	this.year = year;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

//Comparator to sort movies by rating
class NameRating implements Comparator<Movie> {

	public int compare(Movie r1, Movie r2) {
		return Double.compare(r2.getRating(), r1.getRating());
	}
	
}

//Comparator to sort movies by name
class NameCompare implements Comparator<Movie> {
 public int compare(Movie m1, Movie m2) {
   
     // Sort by name in alphabetical order
     return m1.getName().compareTo(m2.getName()); 
 }
}
public class UsingComparatorSortingWithTwoFields {

	public static void main(String [] args) {
		
		List<Movie> m = new ArrayList<>();
		 m.add(new Movie("Force Awakens", 8.3, 2015));
	     m.add(new Movie("Star Wars", 8.7, 1977));
	     m.add(new Movie("Empire Strikes Back", 8.8, 1980));
	     
	  // Sort movies by rating and display all
	     Collections.sort(m, new NameRating());
	     m.stream().forEach(e -> System.out.println(e.getName() + " " + e.getRating() + " " + e.getYear()));

	     System.out.println("=================================================================");
	     
	  // Sort movies by name and display all
	     Collections.sort(m, new NameCompare());
	     m.stream().forEach(e -> System.out.println(e.getName() + " " + e.getRating() + " " + e.getYear()));
	}
}
