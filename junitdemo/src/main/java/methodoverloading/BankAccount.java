package methodoverloading;

public class BankAccount {
  public int fromAccountamt=1000;
  public int toAccountamt=0;
    String fromAccount = null;
    String toAccount= null;
   public boolean login(String username,String password){
        return true;
    }
    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){
        System.out.println("from super class BankAccount ");
       if (fromMobileNumber.equals("12345")){
           fromAccount="123";

       }
       if (toMobileNumber.equals("6789")){
           toAccount="6565";
       }
       return this.bookTransfer(fromAccount,toAccount,amt);
    }
    public boolean bookTransfer(String fromAccount,String toAccount,int amt){
        toAccountamt = toAccountamt+amt;
        fromAccountamt= fromAccountamt-amt;
        return true;
    }
}
