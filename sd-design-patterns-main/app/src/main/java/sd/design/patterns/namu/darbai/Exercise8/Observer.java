package sd.design.patterns.namu.darbai.Exercise8;

public abstract class Observer {

    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }

    // reakcija į būsenos pasikeitimą
    public abstract void update();
}