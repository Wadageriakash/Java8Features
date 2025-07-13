package streamcodinginterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Q.4) Find the highest populated capital city

class PopulatedCity {
	private String name;
	private boolean isCapital;
	private long population;

	public PopulatedCity(String name, boolean isCapital, long population) {
		this.name = name;
		this.isCapital = isCapital;
		this.population = population;
	}

	public String getName() {
		return this.name;
	}

	public boolean getIsCapital() {
		return this.isCapital;
	}

	public long getPopulation() {
		return this.population;
	}
}

public class HighestPopulatedCapitalCity {

	public static void main(String[] args) {

		List<PopulatedCity> city = new ArrayList<>();
		city.add(new PopulatedCity("Delhi", true, 29399141)); 
		city.add(new PopulatedCity("Bengaluru", true, 1000000));
		city.add(new PopulatedCity("Mumbai", true, 62224));
		city.add(new PopulatedCity("Kolkata", true, 700067));
		city.add(new PopulatedCity("Pune", false, 2000));
		city.add(new PopulatedCity("Bidar", false, 1000));
		
		// Find the highest populated capital city using streams
        
		Optional<PopulatedCity>  highestCapital =  city.stream().filter(PopulatedCity::getIsCapital)
    		   .max((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()));
       
		List<PopulatedCity> resultAsList = highestCapital.map(List::of).orElse(List.of());
        resultAsList.forEach(c -> System.out.println("Name: " + c.getName() + ", Capital: " + c.getIsCapital() + ", Population: " + c.getPopulation()));

       
       
        
        //Alternative approach using grouping by and then finding the max
        Map<Boolean, Optional<PopulatedCity>> capitalCities = city.stream().collect(
                Collectors.groupingBy(PopulatedCity::getIsCapital,
                        Collectors.maxBy((c1, c2) -> Long.compare(c1.getPopulation(), c2.getPopulation()))));

        if(capitalCities.containsKey(true) && capitalCities.get(true).isPresent()) {
            System.out.println("Highest populated capital city (grouping): " + capitalCities.get(true).get());
        } else {
             System.out.println("No capital cities found.");
        }
	}
}
