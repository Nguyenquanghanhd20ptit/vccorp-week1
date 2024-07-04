package factoryPattern;

import factoryPattern.factory.Computer;
import factoryPattern.factory.IProduct;
import factoryPattern.factory.Phone;
import factoryPattern.factory.Television;

public class ProductFactory {

    public IProduct getProduct(String name){
        if(name == null){
            return null;
        }
        else if(name.equalsIgnoreCase("phone")){
            return new Phone();
        }
        else if(name.equalsIgnoreCase("computer")){
            return new Computer();
        }
        else if(name.equalsIgnoreCase("television")){
            return new Television();
        }
        return null;
    }
}
