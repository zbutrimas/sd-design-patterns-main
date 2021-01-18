package sd.design.patterns.all.examples.prototype;

public abstract class Monster implements Cloneable {
	boolean eatsChildren = true;
	boolean hasWings = false;
	int numHeads = 1;
	boolean canBreatheFire = false;
	String name;
	public Monster(String name) {
		this.name = name;
	}
	public void spitPoison() { } // default is do nothing
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Monster copy() throws CloneNotSupportedException;
	
	public String toString() {
		StringBuilder s = new StringBuilder("I'm a monster named " + this.name + " with " + this.numHeads + " head(s). ");
		if (this.canBreatheFire) { s.append("I can breathe fire. "); }
		if (this.eatsChildren) { s.append("I eat children. "); }
		if (this.hasWings) { s.append("I have wings. "); }
		return s.toString();
	}
}