import java.util.Scanner;
import java.util.*;
class JaggedArray{
public static void main(String args[])
{
System.out.println("Name: Swati Joshi");
System.out.println("Section: A");
System.out.println("Roll No: 56");
Scanner sc=new Scanner(System.in);


int a[][]=new int[3][];
a[0]=new int[3];
a[1]=new int[2];
a[2]=new int[4];
for(int i=0;i<3;i++)
{
 for(int j=0;j<a[i].length;j++)
{
  a[i][j]=sc.nextInt();
}
}

System.out.println("TRAVERSING jagged ARRAY.........");
for(int i2=0;i2<3;i2++)
{
 for(int j2=0;j2<a[i2].length;j2++)
{
System.out.print(a[i2][j2]+" ");
}
System.out.println();
}

}
}