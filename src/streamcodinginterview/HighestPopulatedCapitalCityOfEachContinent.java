package streamcodinginterview;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Q.5) Find the highest populated capital city of each continent

public class HighestPopulatedCapitalCityOfEachContinent {

	public static void main(String[] args) {
		List<City> cities = List.of(new City("Tokyo", "Asia", 37400068), new City("Delhi", "Asia", 29399141),
				new City("Shanghai", "Asia", 26317104), new City("New York", "North America", 8175133),
				new City("Los Angeles", "North America", 3792621), new City("Mexico City", "North America", 9209944),
				new City("São Paulo", "South America", 12252023), new City("Buenos Aires", "South America", 3075646),
				new City("Lagos", "Africa", 14200000), new City("Cairo", "Africa", 9500000),
				new City("London", "Europe", 8982000), new City("Moscow", "Europe", 12506468));

		Map<String, Object> result = cities.stream().collect(Collectors.groupingBy(City::getContinent,
				Collectors.collectingAndThen(
						Collectors.maxBy((c1, c2) -> Integer.compare(c1.getPopulation(), c2.getPopulation())),
						Optional::get)));
		
		System.out.println(result);
		
		

	}

}
