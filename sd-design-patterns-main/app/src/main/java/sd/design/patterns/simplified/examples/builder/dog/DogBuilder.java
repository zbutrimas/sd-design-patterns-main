package sd.design.patterns.simplified.examples.builder.dog;

import java.util.ArrayList;
import java.util.List;

public class DogBuilder {

    private String name;
    private String type;
    private Integer age;
    private List<String> toys = new ArrayList<>();

    public DogBuilder(String name) {
        this.name = name;
    }

    public DogBuilder(String type) {
        this.type = type;
    }

    public DogBuilder(Integer age) {
        this.age = age;
    }

    public DogBuilder addBall(String ball) {
        this.toys.add(ball);
        return this;
    }
}
