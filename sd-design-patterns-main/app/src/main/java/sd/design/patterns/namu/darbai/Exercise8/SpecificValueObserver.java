package sd.design.patterns.namu.darbai.Exercise8;

public class SpecificValueObserver extends Observer {

    public SpecificValueObserver(final Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Specific value observer: " + subject.getState());
    }
}