import java.util.Scanner;
class bank
{
int ri;
}
class sbi extends bank
{
int get_r(int a)
{
ri=a;
return ri;
}
}
class axis extends bank
{
int get_r(int a)
{
ri=a;
return ri;
}
}
class canara extends bank
{
int get_r(int a)
{
ri=a;
return ri;
}
}
class methodoverriding
{
public static void main(String[]arg)
{
int p,q,r;
sbi i=new sbi();
axis a=new axis();
canara b=new canara();
p=i.get_r(9);
System.out.println("The sbi rate of interest is:\n"+p);
q=a.get_r(5);
System.out.println("The axis rate of interest is:\n"+q);
r=b.get_r(6);
System.out.println("The canara rate of interest is:\n"+r);
}
}


