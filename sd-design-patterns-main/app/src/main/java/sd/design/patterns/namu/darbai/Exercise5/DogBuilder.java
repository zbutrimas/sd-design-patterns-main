package sd.design.patterns.namu.darbai.Exercise5;

import java.util.ArrayList;
import java.util.List;

public abstract class DogBuilder {

    String name;
    String type;
    Integer age;
    List<String> toy = new ArrayList<>();

    public abstract DogBuilder addBall();

    public abstract DogBuilder addRubberBone();

    public abstract DogBuilder addFlyingDisc();

    public Dog build() {
        Dog dog = new Dog();
        dog.setName(this.name);
        dog.setType(this.type);
        dog.setAge(this.age);
        dog.addToys(toy);
        return dog;
    }
}
