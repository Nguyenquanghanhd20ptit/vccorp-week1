package factoryPattern.factory;

public class Phone implements IProduct{
    @Override
    public void call() {
        System.out.println("Đây là class phone");
    }
}
