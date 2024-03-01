package interfacelatest;

public interface BankOTPValidationsService extends BankLoginService{
    String generateOtp(String accountNumber);

    boolean validateOTp(String otp);

}
