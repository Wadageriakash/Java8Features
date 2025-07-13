package streamcodinginterview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.text.AbstractDocument.Content;

// Q.2) Find the most populated city of each continent

class City {
	private String name;
	private String continent;
	private int population;

	public City(String name, String continent, int population) {
		this.name = name;
		this.continent = continent;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return name + " (" + population + ")";
	}
}

public class MostPopulatedCityByContinent {

	public static void main(String[] args) {

		List<City> cities = List.of(new City("Tokyo", "Asia", 37400068), 
				new City("Delhi", "Asia", 29399141),
				new City("Shanghai", "Asia", 26317104),
				new City("New York", "North America", 8175133),
				new City("Los Angeles", "North America", 3792621), 
				new City("Mexico City", "North America", 9209944),
				new City("São Paulo", "South America", 12252023), 
				new City("Buenos Aires", "South America", 3075646),
				new City("Lagos", "Africa", 14200000), 
				new City("Cairo", "Africa", 9500000),
				new City("London", "Europe", 8982000), 
				new City("Moscow", "Europe", 12506468));

//		System.out.println(cities);

		Map<String, City> mostPopulatedCitiesByContinent = cities.stream()
				.collect(Collectors.groupingBy(City::getContinent,
						Collectors.collectingAndThen(
								Collectors.maxBy((c1, c2) -> Integer.compare(c1.getPopulation(), c2.getPopulation())),
								Optional::get)));

		mostPopulatedCitiesByContinent.forEach((continent, city) -> System.out
				.println(continent + " -> " + city.getName() + " (" + city.getPopulation() + ")"));

	}
}
