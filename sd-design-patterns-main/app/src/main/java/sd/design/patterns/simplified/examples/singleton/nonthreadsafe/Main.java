package sd.design.patterns.simplified.examples.singleton.nonthreadsafe;

public class Main {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getDescription());
	}
}
