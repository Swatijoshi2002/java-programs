import java.util.Scanner;
class Bank
{
 long acc_no;
 String name;
 long amount=0;
void insert(String n,long ac,long am)
{ 
   name=n;
   acc_no=ac;
   amount=am;
}
void withdraw(int am)
{
 if(am>amount)
{
 System.out.println("Balance is not sufficient");
}
else
{
  amount=amount-am;
 System.out.println("Transaction Successful");
}
}
void check_balance()
{
 System.out.println("Amount in savings: "+amount);
}
void display()
{
System.out.println("Name :"+name);
System.out.println("Account N0. :"+acc_no);
System.out.println("Amount :"+ amount);

}
public static void main(String args[])
{
  Bank d=new Bank();
   int i=1;
   Scanner sc=new Scanner(System.in);
while(i==1)
{
  System.out.println("ENTER YOUR CHOICE");
 System.out.println("1. INSERT 2. WITHDRAW 3. DISPLAY 4. CHECK_BALANCE 5.zero to exit");
   int n=sc.nextInt();
 switch(n)
{
case 1:

System.out.println("Enter Name :");
  
String na=sc.next();
System.out.println("Enter Account Number :");
   long ac=sc.nextLong();
  
System.out.println("Enter Amount :");
   long am=sc.nextLong();
 
 d.insert(na,ac,am);
break;

case 2:  System.out.println("ENTER WITHDRAWL AMOUNT");
int a=sc.nextInt();
d.withdraw(a);
break;

case 3:d.display();
break;
case 4:d.check_balance();
break;
case 0: i=0;
}
}
}
}