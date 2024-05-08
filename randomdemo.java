import java.util.Random;
class square extends Thread{
int num,ans;
square(int x){
num=x;
}
public void run(){
ans=num*num;
try{
Thread.sleep(1000);
System.out.println("Square is:"+ans);
}
catch(Exception e){
}
}
}
class cube extends Thread{
int num,ans;
cube(int w){
num=w;
}
public void run(){
ans=num*num*num;
try{
Thread.sleep(2000);
System.out.println("cube is:"+ans);
}
catch(Exception e){
}
}
}
class randomdemo{
public static void main(String[]args)
{
Random random=new Random();
int x=random.nextInt(10);
System.out.println("Random number is:"+x);
square s=new square(x);
cube c=new cube(x);
s.start();
c.start();
}
}


