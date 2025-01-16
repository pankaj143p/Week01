//Program to Simulate an ATM
//Problem Statement: Create a BankAccount class with attributes accountHolder,
//        accountNumber, and balance. Add methods for:
//Depositing money.
//Withdrawing money (only if sufficient balance exists).
//Displaying the current balance.
//Explanation: The BankAccount class stores bank account details as
//        attributes. The methods allow interaction with these attributes
//to modify and view the account's state.
import  java.util.Scanner;
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
    private int depositeMoney(int balance, int amount){
        return balance+amount;
    }
    private int withdrawMoney(int balance,int amount){
        if(balance<amount){
            return -1;
        }else{
            balance=balance-amount;
        }
        return balance;
    }
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