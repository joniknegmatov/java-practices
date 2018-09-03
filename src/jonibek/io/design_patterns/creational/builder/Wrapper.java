package jonibek.io.design_patterns.creational.builder;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return getClass().getSimpleName();
    }
}
