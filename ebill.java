import java.util.Scanner;
class bill
{
String cname;
String type;
int cmr,pmr,cno;
int amount,units;
void input()
{
Scanner input=new Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.println("Enter cname:\n");
cname=sc.nextLine();
System.out.println("Enter cno:\n");
cno=input.nextInt();
System.out.println("Enter type");
type=sc.nextLine();
System.out.println("Enter cmr:\n");
cmr=input.nextInt();
System.out.println("Enter pmr:\n");
pmr=input.nextInt();
}
void cal()
{
units=cmr-pmr;
if(type.equals("DOM"))
{
if(units<=100)
amount=1*units;
else if(units>100 && units<=200)
amount=2*units;
else if(units>200 && units<=500)
amount=6*units;
else
;
}
else if(type.equals("COM"))
{
if(units<=100)
amount=units*2;
else if(units>100 && units<=200)
amount=units*4;
else if(units>200 && units<=500)
amount=units*6;
else if(units>500)
amount=units*7;
}
else 
{
System.out.println("Enter valid input\n");
}
}
void display()
{
System.out.println("Units used is:"+units);
System.out.println("Amount to be paid is:"+amount);
}
}
class ebill
{
public static void main(String[]args)
{
bill B=new bill();
B.input();
B.cal();
B.display();
bill B1=new bill();
B1.input();
B1.cal();
B1.display();
}
}

