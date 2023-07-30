package guavaExamples;

import com.google.common.collect.ImmutableSet;

//Information about Immutable collections in Guava: https://github.com/google/guava/wiki/ImmutableCollectionsExplained
public class ImmutablesInGuava {
	
	// Final means we can't change this variable to something else
	// Immutable set means we can't change the values inside this variable
	private static final ImmutableSet<String> COLOUR_NAMES = ImmutableSet.of(
			  "red",
			  "orange",
			  "yellow",
			  "green",
			  "blue",
			  "purple");

	public void run() {
		System.out.println("IMMUTABLES EXAMPLES");
		
		printIsColourHere("red");
		printIsColourHere("Yellow");
		printIsColourHere("indigo");
		printIsColourHere("magenta");
		System.out.println();
		
		tryToBreakImmutability();
		System.out.println();
	}
	
	// Note - this ImmutableSet breaks LSP! Can you figure out why?
	// Also - can you figure out why this trade off is acceptable?
	@SuppressWarnings("deprecation")
	private void tryToBreakImmutability() {
		try {
			COLOUR_NAMES.add("new colour");
			System.out.println("I added something here");
		} catch (UnsupportedOperationException e) {
			System.out.println("I couldn't add in my new colour. This list is immutable!");
		}
	}
	
	private void printIsColourHere(String colour) {
		System.out.printf("Is %s a colour we recognise? %b%n", colour, COLOUR_NAMES.contains(colour.toLowerCase()));
	}

}
