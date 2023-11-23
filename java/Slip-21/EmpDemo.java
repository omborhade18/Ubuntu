import java.io.*;
class Emp
{
	int id;
	String name,dept;
	float sal;
	static int count;
	//Emp()
	//{
	//	this(0,null,null,0);
	//}
	Emp(int id,String name,String dept,float sal)
	{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.sal=sal;
	System.out.println("Object created " + ++count);
	}
	void display()
	{
	System.out.println(id+" "+name+ " "+dept+" "+sal);
	}
	static void countDisplay()
	{
		System.out.println("Total Objects created =" +count);
	}
}
class EmpDemo
{   static public void main(String args[]) throws IOException
    { 	
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter how many objects");
      int n=Integer.parseInt(br.readLine());
      
      Emp m[]=new Emp[n];
      
    for(int i=0;i<n;i++)
    {
      System.out.println("Enter emp id");
      int id=Integer.parseInt(br.readLine());
      System.out.println("Enter name");
      String name=br.readLine();
      System.out.println("Enter dept");
      String dept=br.readLine();
      System.out.println("Enter salary");
      float sal=Float.parseFloat(br.readLine());
      
      m[i]=new Emp(id,name,dept,sal);
    }
   	
    for(int i=0;i<n;i++)
		m[i].display();
    m[0].countDisplay();   	
   }
}	