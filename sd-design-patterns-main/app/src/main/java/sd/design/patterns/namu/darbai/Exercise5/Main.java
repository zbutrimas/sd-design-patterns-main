package sd.design.patterns.namu.darbai.Exercise5;

public class Main {
    public static void main(String[] args) {

        DogBuilder maxBuilder = new DogMax() ;
        Dog max = maxBuilder.addBall().addFlyingDisc().addRubberBone().build();
        max.dogNew();
        System.out.println(max);

    }
}
