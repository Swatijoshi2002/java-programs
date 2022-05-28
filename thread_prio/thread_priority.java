import java.util.*;

class A extends Thread{

public void run()
{
for(int i=0;i<5;i++)
 System.out.println("thread A is running"); 
}

}

class B extends Thread{

public void run()
{
  for(int i=0;i<5;i++)
  System.out.println("thread B is running"); 
}

}
class C extends Thread{

public void run()
{
  for(int i=0;i<5;i++)
 System.out.println("thread c is running"); 
}

}

class Xy{

 public static void main(String args[])
{
  A a=new A();
   Thread t=new Thread(a);
   B b=new B();
   Thread t2=new Thread(b);
   C c=new C();
  System.out.println("class A thread name "+t.getName());
 System.out.println("class B thread name "+t2.getName());
 System.out.println("class C thread name "+c.getName());
  /*t.start();
  t2.start();
 c.start();*/
  c.setPriority(1);
   t.setPriority(5);
  t2.setPriority(10);
   t.start();
   t2.start();
   c.start();
 System.out.println(t.getPriority());
  System.out.println(t2.getPriority());
 System.out.println(c.getPriority());

}



}
