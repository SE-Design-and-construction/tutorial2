package guavaExamples;

public class RunExamples {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guava example project. When you have added the dependency, you will see their examples");
		
		// Guava-dependent examples
		new ImmutablesInGuava().run();
		new MultiSetExample().run();
		new SplitJoinGuava().run();
	}

}
