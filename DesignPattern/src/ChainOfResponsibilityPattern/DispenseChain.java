package ChainOfResponsibilityPattern;

public interface DispenseChain {
    void nextChain(DispenseChain dispenseChain);
    void dispense(int money);
}
