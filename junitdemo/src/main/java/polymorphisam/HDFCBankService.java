package polymorphisam;

public class HDFCBankService extends RBIBankService {
    public double calculateInterest(int principleAmt){
        double totalAmt=0;
        double intersetAmt = super.calculateInterest(principleAmt);
        totalAmt = intersetAmt+ principleAmt;
        return totalAmt;
    }
    public double calculateInterest(int principleAmt,int days) {
        double totalAmt = 0;
        if (days > 89) {
            return this. calculateInterest(principleAmt);
        }
        return totalAmt+principleAmt;
    }

}
