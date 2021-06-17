import java.util.Random;

public class BankAccount {
    //attributes
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numAccounts;
    private static double totalBalance;

    //constructors
    public BankAccount(){
        String accountNumber;
        createAccountNumber();
        double checkingBalance = 0.0;
        double savingsBalance = 0.0;
        numAccounts++;
    }

    //setters & getters
    private void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    private void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    private double getCheckingBalance(){
        return checkingBalance;
    }
    private double getSavingsBalance(){
        return savingsBalance;
    }

    //methods
    private void createAccountNumber(){
        StringBuilder str = new StringBuilder();
        Random rnd = new Random();
        String possibleDigits = "0123456789";
        for(int i=0; i<10; i++){
            str.append(possibleDigits.charAt(rnd.nextInt(9)));
        }
        String newAccountNumber = str.toString();
        System.out.println("New account number: " + newAccountNumber);
        this.accountNumber = newAccountNumber;
    }
    public void printAccountInfo(){
        System.out.println("Acct num: " + accountNumber);
        System.out.println("Checking: " + checkingBalance);
        System.out.println("Savings: " + savingsBalance);
    }
    public void printBankInfo(){
        System.out.println("Total number of accts: " + numAccounts);
        System.out.println("Total balance in bank: " + totalBalance);
    }
    public void deposit(String acct, double amt){
        if(acct.equals("checking")){
            this.checkingBalance += amt;
            totalBalance += amt;
        }
        else if(acct.equals("savings")){
            this.savingsBalance += amt;
            totalBalance += amt;
        } else{
            System.out.println("Unknown account, deposit failed");
        }
    }
    public void withdraw(String acct, double amt){
        if(acct.equals("checking")){
            if(amt > this.checkingBalance){
                System.out.println("Insufficient funds.  Unable to withdraw");
            }
            else{
                this.checkingBalance -= amt;
                totalBalance -= amt;
            }
        }
        else if(acct.equals("savings")){
            if(amt > this.savingsBalance){
                System.out.println("Insufficient funds.  Unable to withdraw");
            }
            else{
                this.savingsBalance -= amt;
                totalBalance -= amt;
            }
        }
        else{
            System.out.println("Unknown account.  Unable to withdraw");
        }
    }
}