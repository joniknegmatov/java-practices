package jonibek.io.design_patterns.behavioral.command;

public class BuyStock implements Order {

    private Stock absStock;

    public BuyStock(Stock absStock) {
        this.absStock = absStock;
    }

    @Override
    public void execute() {
        absStock.buy();
    }
}
