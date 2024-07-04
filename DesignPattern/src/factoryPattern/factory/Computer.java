package factoryPattern.factory;

public class Computer implements  IProduct {
    @Override
    public void call() {
        System.out.println("Đây là class computer");
    }
}
