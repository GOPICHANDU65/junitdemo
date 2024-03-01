package interfacedemo;

public class InterfaceDemoTest {
    public static void main(String[] args) {
        RBIBankService sbi= new SBIBankService();
        RBIBankService hdfc=new HDFCBankService();
        String hdfcStatus=  hdfc.transfer("12345","789",1000);
        String sbiStatus= sbi.transfer("456","555",900);
        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }
}
