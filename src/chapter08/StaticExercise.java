package chapter08;

public class StaticExercise {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("password1", 1000);
        BankAccount account2 = new BankAccount("password2", 2000);
        BankAccount account3 = new BankAccount("password3", 3000);

        System.out.println("账户1信息：");
        System.out.println("账号：" + account1.getAccountNumber());
        System.out.println("密码：" + account1.getPassword());
        System.out.println("余额：" + account1.getBalance());

        System.out.println("账户2信息：");
        System.out.println("账号：" + account2.getAccountNumber());
        System.out.println("密码：" + account2.getPassword());
        System.out.println("余额：" + account2.getBalance());

        System.out.println("账户3信息：");
        System.out.println("账号：" + account3.getAccountNumber());
        System.out.println("密码：" + account3.getPassword());
        System.out.println("余额：" + account3.getBalance());
    }
}

//class Account{
//
//    protected String account_num;
//    protected String account_pwd;
//    protected double deposit_balance;
//    public static double interest_rate;
//    protected double min_balance;
////Deposit balance, interest rate, minimum balance
//    public Account(){
//
//    }
//    public Account(String account_num, String account_pwd,
//                   double deposit_balance, double min_balance){
//        this.account_num =account_num;
//        this.account_pwd = account_pwd;
//        this.deposit_balance = deposit_balance;
//    }
//
//}
 class BankAccount {
    private static int accountNumberCounter = 1000; // 账号计数器，用于自动生成账号
    private String accountNumber; // 帐号
    private String password; // 密码
    private double balance; // 存款余额
    private static double interestRate = 0.01; // 利率
    private static double minimumBalance = 100; // 最小余额

    public BankAccount(String password, double balance) {
        this.accountNumber = generateAccountNumber();
        this.password = password;
        this.balance = balance;
    }

    private String generateAccountNumber() {
        accountNumberCounter++;
        return "AC" + accountNumberCounter;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public static double getMinimumBalance() {
        return minimumBalance;
    }

    public static void setMinimumBalance(double minimumBalance) {
        BankAccount.minimumBalance = minimumBalance;
    }
}