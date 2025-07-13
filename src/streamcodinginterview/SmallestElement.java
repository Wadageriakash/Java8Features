package streamcodinginterview;

import java.util.Arrays;
import java.util.stream.Collectors;

// Find the kth smallest element in an array using Java streams:
public class SmallestElement {

	public static void main(String [] args) {
		
		int[] array = {4, 2, 7, 1, 5, 3, 6};
		int k = 3; // Find the 3rd smallest element
		
		int kthSmallest  = Arrays.stream(array).sorted()
				.skip(k-1).findFirst().orElse(-1);
		System.out.println("kthSmallest =  "+ kthSmallest);
		
	}
}
