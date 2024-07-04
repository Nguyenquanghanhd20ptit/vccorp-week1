package factoryPattern;

import factoryPattern.factory.IProduct;

public class FactoryMain {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        IProduct product1 = productFactory.getProduct("phone");
        product1.call();

        IProduct product2 = productFactory.getProduct("computer");
        product2.call();

        IProduct product3 = productFactory.getProduct("television");
        product3.call();
    }
}
