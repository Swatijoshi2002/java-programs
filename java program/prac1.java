import java.util.Scanner;
class Student
{
 int student_id;
 String name;
 static String university="GRAPHIC ERA HILL UNIVERSITY";
 String branch; 
void set_student(int a,String n,String b_name )
{
  student_id=a;
   name=n;
   branch=b_name;
}
void show()
{
System.out.println("Name :"+name);
System.out.println("student_id :"+student_id);
System.out.println("University_name :"+university);
System.out.println("branch_name :"+branch);
}
public static void main(String args[])
{
  Student d=new Student();
 d.set_student(20012261,"Swati","CSE");
 d.show();
}

}