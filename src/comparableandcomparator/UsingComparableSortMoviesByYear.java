package comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Movies implements Comparable<Movies>{
	
	private String name;
	private double rating;
	private int year;
	
	

	public Movies(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	// This is for the descending
//	public int compareTo(Movies m) {
//		return  m.year - this.year;
//	}
	
	// This is for the ascending order
	public int compareTo(Movies m) {
		return this.year - m.year;
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

public class UsingComparableSortMoviesByYear {

	public static void main(String[] args) {
		
		List<Movies>  l = new ArrayList<>();
		l.add(new Movies("Return of the Jedi", 8.4, 1983));
		l.add(new Movies("Star Wars", 8.7, 1977));
		l.add(new Movies("Empire Strikes Back", 8.8, 1980));
		
		Collections.sort(l);
		
		l.stream().forEach(e -> System.out.println(e.getName() + " " + e.getRating() + " " + e.getYear()));
		
	}
}

//Star Wars 8.7 1977
//Empire Strikes Back 8.8 1980
//Return of the Jedi 8.4 1983