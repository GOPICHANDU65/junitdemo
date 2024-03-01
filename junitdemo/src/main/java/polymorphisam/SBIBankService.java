package polymorphisam;

public class SBIBankService extends RBIBankService{
    public double calculateInterest(int principleAmt){
        double totalAmt=0;
        double intersetAmt = super.calculateInterest(principleAmt);
        totalAmt = intersetAmt+ principleAmt;
        return totalAmt;
    }
    public double calculateInterest(int principleAmt,int days) {
        double totalAmt = 0;
        if (days > 85) {
            return  this.calculateInterest(principleAmt);
        }
        return totalAmt;
    }
}
