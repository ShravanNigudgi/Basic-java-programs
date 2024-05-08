import java.util.Scanner;
class quadraticeq
{
public static void main(String[]arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the a b c value\n");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double qd=b*b-4*a*c;
if(qd>0)
{
System.out.println("Roots are real and distcint\n");
double Root1=(-b+Math.sqrt(qd))/(2*a);
double Root2=(-b-Math.sqrt(qd))/(2*a);
System.out.println("+Root1");
System.out.println("+Root2");
}
else if(qd==0)
{
System.out.println("Roots are real and equal\n");
double Root1=-b/(2*a);
System.out.println(+Root1);
}
else
System.out.println("Roots are distint and imaginary\n");
}
}

