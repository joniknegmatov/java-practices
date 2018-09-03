package jonibek.io.design_patterns.creational.abstract_factory.color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside " + getClass().getSimpleName() + "::fill() method.");
    }
}
