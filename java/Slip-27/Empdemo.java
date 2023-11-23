slip 27.1

import java.io.*;
class Employee
{
	String ename,desg;
	double sal;
	
	Employee(String ename,String desg,double sal)
	{
		this.ename=ename;
		this.desg=desg;
		this.sal=sal;
	}
	
	double getSalary()
	{
		return sal;
	}
	void display()
	{
		System.out.println(ename+"\t"+desg+"\t"+sal);
		
	}
	
}

class manager extends Employee
{
	double TA,HRA;
	manager(String ename,String desg,double sal,double TA,double HRA)
	{
		super(ename,desg,sal);
		this.TA=TA;
		this.HRA=HRA;
	}
	
	double getSalary()
	{
		return sal+TA+HRA;
	}
	void display()
	{
		System.out.println(ename+"\t"+desg+"\t"+sal+"\t"+TA+"\t"+HRA);
		
	}
}

class Empdemo
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Name:");
		String ename=br.readLine();

		System.out.println("Enter Employee Designation:");
		String desg=br.readLine();

		System.out.println("Enter Employee Salary:");
		double sal=Double.parseDouble(br.readLine());

		System.out.println("Enter Employee Travel Allowance:");
		double TA=Double.parseDouble(br.readLine());

		System.out.println("Enter Employee Homerent Allowance:");
		double HRA=Double.parseDouble(br.readLine());

		manager m= new manager(ename,desg,sal,TA,HRA);
		m.display();
		System.out.println("salary=" +m.getSalary());
	}
}
