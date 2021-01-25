package sd.design.patterns.namu.darbai.Exercise5;

public class DogMax extends DogBuilder {
    public DogMax() { this.name = "Max" ;this.type = "Buldog";this.age = 8; }

    @Override
    public DogBuilder addBall() {
        this.toy.add("ball");
        return this;
    }

    @Override
    public DogBuilder addRubberBone() {
        this.toy.add("rubber bone");
        return this;
    }

    @Override
    public DogBuilder addFlyingDisc() {
        this.toy.add("flying disc");
        return this;
    }
}
