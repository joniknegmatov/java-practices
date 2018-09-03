package jonibek.io.design_patterns.structural.proxy;

/**
 * In proxy pattern, a class represents functionality of another class.
 * This type of design pattern comes under structural pattern.
 *
 * In proxy pattern, we create object having original object to interface its functionality to outer world.
 *
 * Implementation
 * We are going to create an Image interface and concrete classes implementing the Image interface.
 * ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.
 *
 * ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.
 */

public class ProxyDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
