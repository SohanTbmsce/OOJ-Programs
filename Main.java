import java.util.*;
import java.util.*;

class Account{
String name;
int accno;
String type;
double balance;
Account(String name,int accno,String type,double balance){
this.name = name;
this.accno = accno;
this.type = type;
this.balance = balance;
}

void deposit(double amount){
balance +=amount;
}
void withdraw(double amount){
if((balance-amount)>=0){
balance -=amount;
}
else{
System.out.println("Insufficient balance");
}
}
void display(){
System.out.println("Name : "+name+"\n"+
  "AccountNo : "+accno+"\n"+
  "Type : "+type+"\n"+
  "balance: "+balance+"\n");
}
}

class SavingAccount extends Account{
private static int rate = 5;
SavingAccount(String name,int accno,String type,double balance){
super(name,accno,type,balance);
}
void balanceWithInterest(){
balance +=balance*rate/100;
System.out.println("balance: "+balance);
}

}

class CurrentAccount extends Account{
    private static int rate = 5;
    CurrentAccount(String name,int accno,String type,double balance){
    super(name,accno,type,balance);
    }
    void balanceWithInterest(){
    balance +=balance*rate/100;
    System.out.println("balance: "+balance);
    }
    
    }

public class Main{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("Enter your name: ");
String name = s.nextLine();

System.out.println("Enter the account type (current or savings)");
String type = s.next();

System.out.println("Enter the account number: ");
int accno = s.nextInt();

System.out.println("Enter the initial balance: ");
double balance = s.nextDouble();

Account acc = new Account(name,accno,type,balance);
SavingAccount sa =  new SavingAccount(name,accno,type,balance);
CurrentAccount cc=  new CurrentAccount(name,accno,type,balance);
double amount;
while(true){
if(acc.type.equals("savings")){
System.out.println("\n-------MENU------\n");
System.out.println("1. Deposit \n2.Withdraw \n 3.compute interest for SavingsAccount \n 4.Display Account Details\n 5.Exit\n");

System.out.println("Enter your choice");
int choice = s.nextInt();


switch(choice){
case 1:System.out.println("Enter the deposit amount");
amount = s.nextDouble();
sa.deposit(amount);
break;
case 2: System.out.println("Enter the withdrawl amount ");
amount = s.nextDouble();
sa.withdraw(amount);
break;
case 3:sa.balanceWithInterest();
break;
case 4:System.out.println("Details: ");
sa.display();
break;
case 5: return;
default: System.out.println("Invalid choice ");
}

}

else if(acc.type.equals("current")){
    System.out.println("\n-------MENU------\n");
    System.out.println("1. Deposit \n2.Withdraw \n 3.compute interest for SavingsAccount \n 4.Display Account Details\n 5.Exit\n");
    
    System.out.println("Enter your choice");
    int choice = s.nextInt();
    
    
    switch(choice){
    case 1:System.out.println("Enter the deposit amount");
    amount = s.nextDouble();
    cc.deposit(amount);
    break;
    case 2: System.out.println("Enter the withdrawl amount ");
    amount = s.nextDouble();
    cc.withdraw(amount);
    break;
    case 3:cc.balanceWithInterest();
    break;
    case 4:System.out.println("Details: ");
    cc.display();
    break;
    case 5: return;
    default: System.out.println("Invalid choice ");
    }
    
    System.out.println("name:sohan t sanjeev usn:2023bms02532");
}
}
}
}