import java.io.*;
abstract class Staff
{
     protected int id;
     protected String name;
     Staff(int id, String name)
     {
	this.id = id;
	this.name= name;
     }

     abstract void display();
 }
class OfficeStaff extends Staff
{
     String dept;
     OfficeStaff(int id, String name, String dept)
     {
	super(id, name);
	this.dept=dept;
     }
     void display()
     {
	System.out.println(id+"\t"+name+"\t"+dept);
     }
}
class StaffDemo
{
public static void main(String args[])throws Exception
{
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.print("How many staff members :");
   int n = Integer.parseInt(br.readLine());
   OfficeStaff s[]=new OfficeStaff[n];
   for(int i=0 ; i<n ; i++)
   {    
	System.out.print("Enter id:");
	int id=Integer.parseInt(br.readLine());
	System.out.print("Enter Name:");
	String name=br.readLine();
	System.out.print("Enter Department:");
	String dept=br.readLine();

	s[i]=new OfficeStaff(id,name,dept);
   }
   System.out.println("Id\tName\tDeartment");
   for(int i=0; i<n ; i++)
	s[i].display();
}
}
