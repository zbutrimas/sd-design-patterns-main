package sd.design.patterns.simplified.examples.strategy.sharephoto;

public class Social implements ShareStrategy {
	public void share() {
		System.out.println("I'm posting the photo on social media");
	}
}
