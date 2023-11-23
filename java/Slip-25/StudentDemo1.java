import java.io.*;
class Student
{
	int rollno;
	String name, classname;
	float per;
	
	void accept() 
	{
	    try
	    {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rollno:");
		rollno=Integer.parseInt(br.readLine());
		System.out.print("Enter Student Name:");
		name=br.readLine();
		System.out.print("Enter Class Name:");
		classname=br.readLine();
		System.out.print("Enter Percentage:");
		per=Float.parseFloat(br.readLine());
	    }
	    catch(IOException e)
	    {
		System.out.println(e);
	    }
	}
	void display()
	{
		System.out.print("Rollno:" + rollno);
		System.out.print("Student Name:"+name);
		System.out.print("Class Name:"+classname);
		System.out.print("Percentage:"+per);
    
	}
}
class StudentDemo1
{
	public static void main(String args[]) 
	{
		Student st=new Student();
		st.accept();
		st.display();
	}
}