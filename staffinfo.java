import java.util.Scanner;
class staff
{
String name;
int staffid;
double salary;
long phone;
void getdata()
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the name,staffid,salary,phone\n");
name=input.nextLine();
staffid=input.nextInt();
salary=input.nextDouble();
phone=input.nextLong();
}
void display()
{
System.out.println("\nName:"+name+"\nStaffid:"+staffid+"\nSalary:"+salary+"\nPhone no:"+phone);
}
}

class teaching extends staff
{
String domain;
int no_pub;
void input_teach()
{
super.getdata();
Scanner z=new Scanner(System.in);
System.out.println("Enter the domain and no of publications");
domain=z.nextLine();
no_pub=z.nextInt();
}
void disp_teach()
{
super.display();
System.out.println("Domain:"+domain+"no_pub:"+no_pub);
}
}

class techinical extends staff
{
String skill;
void input_tech()
{
super.getdata();
Scanner z=new Scanner(System.in);
System.out.println("Enter the skill\n");
skill=z.nextLine();
}
void disp_tech(){
super.display();
System.out.println("Skill:"+skill);
}
}

class contr extends staff
{
int period;
void input_cont()
{
super.getdata();
Scanner z=new Scanner(System.in);
System.out.println("Enter the periods\n");
period=z.nextInt();
}
void display_cont()
{
super.display();
System.out.println("Period:"+period);
}
}
class staffinfo
{
public static void main(String[]args)
{
teaching a=new teaching();
a.input_teach();
a.disp_teach();
techinical b=new techinical();
b.input_tech();
b.disp_tech();
contr c=new contr();
c.input_cont();
c.display_cont();
}
}





  