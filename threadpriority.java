class A extends Thread{
public void run(){
for(int i=1;i<=10;i++)
System.out.println("i="+i);
}
}
class B extends Thread{
public void run(){
for(int j=1;j<=10;j++)
System.out.println("j="+j);
}
}
class C extends Thread{
public void run(){
for(int k=1;k<=10;k++)
System.out.println("k="+k);
}
}
class threadpriority{
public static void main(String[]args){
A a=new A();
B b=new B();
C c=new C();
c.setPriority(10);
b.setPriority(5);
a.setPriority(1);
a.start();
b.start();
c.start();
}
}



