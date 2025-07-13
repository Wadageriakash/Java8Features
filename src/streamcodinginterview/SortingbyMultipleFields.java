package streamcodinginterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingbyMultipleFields {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Charlie", 35),
                new Person("Bob", 30),
                new Person("Jhon", 60)
        );

        // Comparator: Sort by age first, then by name
        Comparator<Person> ageThenNameComparator = Comparator.comparingInt(Person::getAge)
                                                             .thenComparing(Person::getName);

        // Sorting the list
        Collections.sort(persons, ageThenNameComparator);

        // Printing the sorted list
        persons.forEach(System.out::println);
    }
}