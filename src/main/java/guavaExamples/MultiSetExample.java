package guavaExamples;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

// Read more at: https://github.com/google/guava/wiki/NewCollectionTypesExplained
public class MultiSetExample {

	public void run() {
		System.out.println("MULTISET EXAMPLES");
		List<Integer> firstList = Arrays.asList(1, 3, 4, 3, 1);
		List<Integer> secondList = Arrays.asList(1, 1, 3, 3, 4);
		System.out.printf("Is the %s list the same as the  %s list? %b%n", firstList.toString(), secondList.toString(), firstList.equals(secondList));
		
		Multiset<Integer> multi1 = HashMultiset.create(firstList);
		Multiset<Integer> multi2 = HashMultiset.create(secondList);
		System.out.printf("Is the %s multiset the same as the  %s multiset? %b%n%n", multi1.toString(), multi2.toString(), multi1.equals(multi2));
	}

}
