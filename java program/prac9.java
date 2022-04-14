import java.util.Scanner;
import java.util.*;
class Array2D{
public static void main(String args[])
{
System.out.println("Name: Swati Joshi");
System.out.println("Section: A");
System.out.println("Roll No: 56");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();

int a[][]=new int[n][m];
for(int i=0;i<n;i++)
{
 for(int j=0;j<m;j++)
{
  a[i][j]=sc.nextInt();
}
}
System.out.println("ENTER KEY TO SEARCH");
int key=sc.nextInt();
int flag=0;
for(int i1=0;i1<n;i1++)
{
 for(int j1=0;j1<m;j1++)
{
  if(a[i1][j1]==key)
{
System.out.println("KEY FOUND.........");
flag=1;
break;
}
}
}
if(flag==0)
{
System.out.println("KEY not FOUND.........");
}

System.out.println("TRAVERSING 2d ARRAY.........");
for(int i2=0;i2<n;i2++)
{
 for(int j2=0;j2<m;j2++)
{
System.out.print(a[i2][j2]+" ");
}
}

}
}