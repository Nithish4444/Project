class encapsulationdemo
{
private int ssn;
private String empname;
private int empage;
public int getmpssn()
{
return ssn;
}
public String getempname()
{
return empname;
}
public int getempage()
{
retun empage;
}
public void setempage(int newvalue)
{
empage=newvalue;
}
public void setempssn(String newvalue)
{
empname=newvalue;
}
public void setempssn(int newvalue)
{
ssn=newvalue;
}
}
public class encapstest
{
public static void main(String args[])
{
encapsulationdemo obj=new encapsulationdemmo();
obj.setempname("mario");
obj.setempage(32);
obj.setempssn(112233);
System.out.println("employee name:"+obj.getempname());
System.out.println("employee ssn:"+obj.getempssn());
System.out.println("employee age:"+obj.getempage());
}
}
