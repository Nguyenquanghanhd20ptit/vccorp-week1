package ChainOfResponsibilityPattern;

import java.util.Scanner;

public class DispenseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền: ");
        int money = scanner.nextInt();
        if(money % 10000 != 0){
            System.out.println("Số tiền phải là bội số của 10k");
            return;
        }
        System.out.println("Hóa đơn rút tiền");
        DispenseChain dispense10k = new Dispense10k();
        DispenseChain dispense20k = new Dispense20k();
        DispenseChain dispense50k = new Dispense50k();
        DispenseChain dispense100k = new Dispense100k();
        DispenseChain dispense200k = new Dispense200k();
        DispenseChain dispense500k = new Dispense500k();

        dispense500k.nextChain(dispense200k);
        dispense200k.nextChain(dispense100k);
        dispense100k.nextChain(dispense50k);
        dispense50k.nextChain(dispense20k);
        dispense20k.nextChain(dispense10k);

        dispense500k.dispense(money);
    }
}
