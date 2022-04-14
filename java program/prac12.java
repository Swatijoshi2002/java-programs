import java.util.Scanner;
import java.util.*;
class Bank{

   float set_roi()
  {
   return(2.0f);
  }
}
class Hdfc extends Bank{
 float set_roi()
  {
   return(4.0f);
  }

}
class Sbi extends Bank{
 float set_roi()
  {
   return(5.0f);
  }

}
class Pnb extends Bank{
 float set_roi()
  {
   return(4.5f);
  }

}
class Run{
public static void main(String args[])
{
System.out.println("Name: Swati Joshi");
System.out.println("Section: A");
System.out.println("Roll No: 56");

Bank obj=new Bank();
System.out.println("roi of bank: "+ obj.set_roi());
obj=new Pnb();
System.out.println("roi of pnb: "+ obj.set_roi());
obj=new Hdfc();
System.out.println("roi of hdfc: "+ obj.set_roi());
obj=new Sbi();
System.out.println("roi of sbi: "+ obj.set_roi());

}
}