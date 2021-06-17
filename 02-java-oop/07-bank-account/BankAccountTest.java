public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("Creating new account");
        BankAccount piggy = new BankAccount();
        piggy.printAccountInfo();
        System.out.println("Depositing 100 into checking");
        piggy.deposit("checking", 100.0);
        piggy.printAccountInfo();
        System.out.println("Depositing 500 into savings");
        piggy.deposit("savings", 500.0);
        piggy.printAccountInfo();
        System.out.println("Depositing 1000 into money market");
        piggy.deposit("moneymarket", 1000.0);
        piggy.printAccountInfo();
        System.out.println("Num of accts and total deposit at bank");
        piggy.printBankInfo();
        System.out.println("Withdrawing 200 from checking");
        piggy.withdraw("checking", 200.0);
        piggy.printAccountInfo();
        piggy.printBankInfo();
        System.out.println("Withdrawing 200 from savings");
        piggy.withdraw("savings", 200.0);
        piggy.printAccountInfo();
        piggy.printBankInfo();
        System.out.println("Withdrawing 1000 from money market");
        piggy.withdraw("money market", 1000.0);
    }
}