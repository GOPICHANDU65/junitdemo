package services;

    public class HomeLoan {

        private double principalAmount;
        private double processingRate;
        private double processingFee;
        private double customerAmount;
        private double interest=8.5;
        public double processingFeeCal(int loanAmount){

            processingFee=loanAmount*(processingRate/100);

            return  customerAmount=loanAmount-processingFee;

        }

        public void setProcessingRate(double processingRate) {
            this.processingRate = processingRate;
        }

        public double emiPlanning(int years,double principalAmount){
            for(int i=1;i<=years*12;i++){

                double loanAmountPerMonth=(principalAmount /(years*12));
                //System.out.println("loan amount per month: "+loanAmountPerMonth);

                double interestPerMonth=(principalAmount *(interest/100))/12;
                //System.out.println("interestPerMonth: "+interestPerMonth);
                double emiPerMonth=loanAmountPerMonth+interestPerMonth;
                //System.out.println("emi per month: "+emiPerMonth);



                principalAmount=principalAmount-loanAmountPerMonth;

                System.out.println("EMI in "+i+" Month is:"+emiPerMonth+" & remaining amount to pay "+principalAmount);

            }
            return principalAmount;
        }

}
