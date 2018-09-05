package jonibek.io.design_patterns.behavioral.observer;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
