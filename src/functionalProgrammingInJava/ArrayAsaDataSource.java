package functionalProgrammingInJava;

import java.util.stream.IntStream;

public class ArrayAsaDataSource {

	public static void main(String[] args) {
		// Creating a predefined stream using range method
        // Custom inputs for range as parameters
		var stream = IntStream.range(1, 100);
		
		// Stream is created
		var max = stream.filter(number -> number % 4 == 0).count();
		
		System.out.println(max); // 24
		
	}
}
