package factoryPattern.factory;

public class Television implements IProduct {
    @Override
    public void call() {
        System.out.println("Đây là class television");
    }
}
