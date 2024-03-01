package interfacelatest;

public class SBILoginTest {
    public static void main(String[] args) {
       BankLoginService loginProcess= new SBILoginProcess();
     boolean loginStatus =   loginProcess.login("1111","12345");
        if (loginStatus) {
            System.out.println("Login succesfull");
        }else {
            System.out.println(" Login failed");
        }
    }
}
