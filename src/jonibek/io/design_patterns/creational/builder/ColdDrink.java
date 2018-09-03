package jonibek.io.design_patterns.creational.builder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();

    public abstract String name();

}
