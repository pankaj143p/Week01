
import  java.util.Scanner;
// create a class for BankAccount
class BankAccount{
    private String accountHolder;
    private String getAccountNumber;
    private  int balance;
    private static int disA;
    private static int witA;
    BankAccount(String accountHolder, String getAccountNumber, int balance){
        this.accountHolder=accountHolder;
        this.getAccountNumber=getAccountNumber;
        this.balance=balance;
    }
    // method to deposite money
    private int depositeMoney(int balance, int amount){
        return balance+amount;
    }
    // method to withdraw money
    private int withdrawMoney(int balance,int amount){
        if(balance<amount){
            return -1;
        }else{
            balance=balance-amount;
        }
        return balance;
    }
    // method to display the details of account holder
    private void display(){
        System.out.println("Name of Account Holder: "+accountHolder);
        System.out.println("Account number of Account Holder: "+getAccountNumber);
        System.out.println("Current Balance: "+balance);
        System.out.println("Balance after add amount: "+depositeMoney(balance,disA));
        int tempAmount=withdrawMoney(balance,witA);
        if(tempAmount==-1){
            System.out.println("insufficient balance in your account: ");
        }else{
            System.out.println("Balance after withdraw: "+tempAmount);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter deposite amount:");
        disA=sc.nextInt();
        System.out.println("Enter withdraw amount:");
        witA=sc.nextInt();
        BankAccount ba = new BankAccount("Pankaj","228323982972",3000);
        ba.display();
    }
}