import java.io.File;
import java.io.IOException;
class CreateFile3
{
public static void main(String args[])
{
try
{
File fo=new File("C:FileOperationExample.txt");
if(fo.createNewFile())
{
System.out.println("File"+fo.getName()+"is created successfully.");
}
else
{
System.out.println("File is already exits in the directory.");
}
}
catch(IOException exception)
{
System.out.println("An unexpected error is occured.");
exception.printStackTrace();
}
}
}
