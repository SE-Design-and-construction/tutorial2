package guavaExamples;

import java.util.Arrays;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

// Read more at: https://github.com/google/guava/wiki/StringsExplained
public class SplitJoinGuava {

	public void run() {
		System.out.println("SPLIT AND JOIN EXAMPLES");
		joinerExample();
		splitterExample();
	}
	
	private static void joinerExample() {
		String[] words = {
				"I",
				"need",
				"to",
				"join",
				"a",
				"sentence",
				null,
				"",
				"with",
				"some",
				"nasty",
				"elements"};

		// Still includes the empty string, but the null won't cause a NPE now!
		System.out.println(Joiner.on(" ")
				.skipNulls()
				.join(words));
		System.out.println();
	}
	
	private static void splitterExample() {
		String fromCSV = "1,2,,,3,4,,4,,2,,,,";
		
		// In-built split doesn't get rid of blanks
		System.out.printf("Using String.split() method: %s%n", Arrays.asList(fromCSV.split(",")));
		
		// Splitter can get rid of blanks and do some other stuff
		System.out.printf("Using Guava Splitter class: %s%n%n", Splitter.on(",")
				.omitEmptyStrings()
				.split(fromCSV));
	}

}
