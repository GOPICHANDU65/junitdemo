package interfacedemo;

public class HDFCBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNumber, String totalAccountNumber, int amt) {
        return "transfer from HDFCBank";
    }
}
