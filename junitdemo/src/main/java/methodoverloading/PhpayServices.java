package methodoverloading;

public class PhpayServices extends BankAccount{
    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){
        System.out.println("from sub class BankAccount ");
        return super.transfer(fromMobileNumber,toMobileNumber,amt);

    }



}
