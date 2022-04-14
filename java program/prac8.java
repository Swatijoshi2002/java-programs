import java.util.Scanner;
class Student
{
 int student_id;
 String name;
 String university;
 String branch; 
String city;
Student(int a)
{
  student_id=a;
}
Student(int a,String n)
{
 this(a);
  name=n;
}
Student(int a,String n,String u_name)
{
 this(a,n);
  university=u_name;
 
}
Student(int a,String n,String u_name,String b)
{
  this(a,n,u_name);
  branch=b;

}
Student(int a,String n,String u_name,String b,String c)
{
 this(a,n,u_name,b);
  city=c;
  
}

void show()
{
System.out.println("Name :"+name);
System.out.println("student_id :"+student_id);
System.out.println("University_name :"+university);
System.out.println("branch_name :"+branch);
System.out.println("city_name :"+city);
}
public static void main(String args[])
{
  System.out.println("Name: Swati Joshi");
  System.out.println("Section: A");
  System.out.println("Roll No: 56");
   System.out.println();
  Student d=new Student(20012261,"ARUN","GRAPHIC ERA HILL UNIVERSITY","CSE","DEHRADUN");
 d.show();
}

}