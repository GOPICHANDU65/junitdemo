package polymorphisam;

public class BankServices {
    public  static void main(String[]args){
        SBIBankService sbi = new SBIBankService();
        double sbiInterest= sbi.calculateInterest(1000,86);
        System.out.println("  Sbi Bank "+sbiInterest);

     HDFCBankService hdfc = new HDFCBankService();
        double hdfcInterest= hdfc.calculateInterest(1000,90);
        System.out.println("  Hdfc Bank "+hdfcInterest);
    }
}
