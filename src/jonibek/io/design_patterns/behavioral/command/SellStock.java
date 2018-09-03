package jonibek.io.design_patterns.behavioral.command;

public class SellStock implements Order {

    private Stock absStock;

    public SellStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.sell();
    }
}
