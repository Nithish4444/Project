import java.language.*;
public class Employee
{
int Empno;
String name;
String desig;
Float salary;
Employee()
{
empno=1;
name="Nithin";
desig="SoftwareEngineering";
Salary=45000;
}
Employee(int Empno,String n,String d,Float sal)
{
empno=eno;
name=name;
desig=desig;
salary=salary;
}
Employee(employee e)
{
empno=e.eno;
name=e.name;
desig=e.desig;
salary=e.salary;
}
{
void display();
{
System.out.println("Employeeno:"+empno);
System.out.println("Employeename:"+name);
System.out.println("Designation:"+desig);
System.out.println("Salary:"+salary);
}
}
Class EmployeeDemo;
public static void main(String args[])
{
Employee e1=new Employee();
e1.display();
System.out.println("----------");
Employee e2=new Employee(2,koosappa,Doctor,50000);
e2.display();
System.out.println("----------");
}
}


