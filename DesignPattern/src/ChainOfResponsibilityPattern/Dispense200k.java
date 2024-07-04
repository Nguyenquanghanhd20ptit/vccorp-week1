package ChainOfResponsibilityPattern;

public class Dispense200k implements DispenseChain {
    private DispenseChain dispenseChain;
    private final int MONEY_DEFAULT = 200000;
    @Override
    public void nextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }

    @Override
    public void dispense(int money) {
        if(money >= this.MONEY_DEFAULT){
            int num = money / MONEY_DEFAULT;
            int remainder = money % MONEY_DEFAULT;
            System.out.println(num + " tờ tiền có mệnh giá là: " + MONEY_DEFAULT + " VNĐ");
            if(remainder != 0) this.dispenseChain.dispense(remainder);
        }else {
            this.dispenseChain.dispense(money);
        }
    }
}
