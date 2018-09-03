package jonibek.io.design_patterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item != null)
            items.add(item);
    }

    public float getCost(){

        float price = 0.0f;

        for (Item item : items){
            price += item.price();
        }

        return price;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }

}
