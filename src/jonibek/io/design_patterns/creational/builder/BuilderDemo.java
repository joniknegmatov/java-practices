package jonibek.io.design_patterns.creational.builder;

/**
 * Builder pattern builds a complex object using simple objects and using a step by step approach.
 * This type of design pattern comes under creational pattern as this pattern provides one of the best
 * ways to create an object.
 *
 * A Builder class builds the final object step by step.
 * This builder is independent of other objects.
 */

/**
 * IMPLEMENTATION
 * We have considered a business case of fast-food restaurant where a typical
 * meal could be a burger and a cold drink. Burger could be either a Veg Burger or
 * Chicken Burger and will be packed by a wrapper. Cold drink could be either a coke
 * or pepsi and will be packed in a bottle.
 *
 * We are going to create an Item interface representing food items such as burgers and
 * cold drinks and concrete classes implementing the Item interface and a Packing interface
 * representing packaging of food items and concrete classes implementing the Packing interface
 * as burger would be packed in wrapper and cold drink would be packed as bottle.
 *
 * We then create a Meal class having ArrayList of Item and a MealBuilder to build different types
 * of Meal objects by combining Item. BuilderPatternDemo, our demo class will use MealBuilder to build a Meal.
 */


public class BuilderDemo {

    public static void main(String[] args) {

        MaleBuilder maleBuilder = new MaleBuilder();

        Meal veganMeal = maleBuilder.prepareVeganMeal();

        System.out.println("Vegan Meal");
        veganMeal.showItems();
        System.out.println("Total Cost : " + veganMeal.getCost());

        System.out.println("\n");

        Meal nonVeganMeal = maleBuilder.prepareNonVeganMeal();
        System.out.println("NonVegan Meal");
        nonVeganMeal.showItems();
        System.out.println("Total Cost : " + nonVeganMeal.getCost());

    }
}
