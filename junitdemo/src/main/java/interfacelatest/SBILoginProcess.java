package interfacelatest;

public class SBILoginProcess implements BankLoginService{
    SBIBankLoginService sbiBankLoginService;

    public SBILoginProcess() {
       this. sbiBankLoginService =new SBIBankLoginService();
    }

    public SBILoginProcess(SBIBankLoginService sbiBankLoginService) {
        this.sbiBankLoginService=sbiBankLoginService;
    }

    @Override
    public boolean login(String userName, String password) {
if (sbiBankLoginService.login(userName, password)){
    String otp = sbiBankLoginService.generateOtp(userName);
    System.out.println(otp);
    boolean validateOTP= sbiBankLoginService.validateOTp(otp);

    if (validateOTP){
        System.out.println("Valid otp & login is successfull");
    }else {
        System.out.println("Invalid otp & login is failed");
    }
    return validateOTP;

   }else {
    System.out.println("invalid credentails");
    return false;
   }
    }
}
