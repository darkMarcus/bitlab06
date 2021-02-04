package bitlab.askar.module1.project;

public class NationalBankAccount implements BankAccount {

    private String fullName;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public NationalBankAccount() {
    }

    public NationalBankAccount(String fullName, int balance, String accountNumber, String pinCode) {
        this.fullName = fullName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getPinCode() {
        return pinCode;
    }

    @Override
    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return balance;
    }

    @Override
    public void creditBalance(int credit) {
        if (balance>credit) balance -= credit;
        else System.out.println("not enoght money");
    }

    @Override
    public void debetBalance(int debet) {
        balance+= debet;
    }

    @Override
    public String accountData() {
        return "CityBankAccount{" +
                ", fullname=" + fullName +
                ", balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
