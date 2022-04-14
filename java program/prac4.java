import java.util.Scanner;
class Employee
{
 int ID;
 String name;
 String department;
 int salary; 
void set(int ID,String name,String department,int salary)
{
  this.ID=ID;
   this.name=name;
  this.department=department;
   this.salary=salary;
}
void show()
{
System.out.println("Name :"+name);
System.out.println("ID: "+ID);
System.out.println("Department:"+department);
System.out.println("Salary :"+salary);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Name: Swati Joshi");
System.out.println("Section: A");
System.out.println("Roll No: 56");
Employee d=new Employee();
System.out.println("ENTER NAME OF EMPLOYEE");
String name=sc.next();
System.out.println("ENTER ID");
int id=sc.nextInt();
System.out.println("ENTER SALARY");
int salary=sc.nextInt();
System.out.println("ENTER DEPARTMENT");
String depart=sc.next();
d.set(id,name,depart,salary);
d.show();
}

}