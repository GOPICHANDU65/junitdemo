package methodoverloading;

public class MethodOverrideTest {
    public static void main(String[]args){
        PhpayServices ph = new PhpayServices();
        ph.transfer("12345","6789",100);
        ph.transfer("12345","6789",100);
        ph.transfer("12345","6789",100);
        System.out.println("to account Amount "+ph.toAccountamt );
        BankAccount bank = new BankAccount();
        bank.transfer("12345","6789",100);
        BankAccount banks = new PhpayServices();
        banks.transfer("12345","6789",100);
    }
}
