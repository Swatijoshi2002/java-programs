import java.util.Scanner;
import java.util.*;
class Xyz{
public static void main(String args[])
{
System.out.println("Name: Swati Joshi");
System.out.println("Section: A");
System.out.println("Roll No: 56");
System.out.println();
StringBuffer s=new StringBuffer("HELLO");
System.out.println("TASK 1");
System.out.println("append JAVA with HELLO:"+ s.append("JAVA"));
System.out.println("changes in string after apppend: "+ s);
System.out.println("TASK 2");
System.out.println("inserting java at index 1: "+s.insert(1,"java"));
System.out.println("TASK 3");
System.out.println("replacing from index 1 to 2 with java: "+ s.replace(1,2,"java"));
System.out.println("current changes in string: "+ s);
System.out.println("TASK 4");
System.out.println("delete from 1 to  2: "+ s.delete(1,2));
StringBuffer s1=new StringBuffer("HELLO");
System.out.println("TASK 5");
System.out.println("reverse of string : "+ s1.reverse());
}
}