package interfacelatest;

import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationsService {
    String accountNumber="1111";
    String password="12345";
    String otp;
    public SBIBankLoginService(){

    }
    @Override
    public boolean login(String userName, String password) {
     if (userName.equals(accountNumber)&& this.password.equals(password)){
         return true;
     }
        return false;
    }
    @Override
    public String generateOtp(String accountNumber) {
        if (this.accountNumber.equals(accountNumber)) {
            return otp = UUID.randomUUID().toString();
        }
        return null;
    }
    @Override
    public boolean validateOTp(String otp) {
        if (this.otp.equals(otp)){
        return true;
    }
        return false;
    }

}
