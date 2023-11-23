import java.io.*;
class Continent
{
	String con;
	void setdata(String con)
	{	this.con=con;	}
}
class Country extends Continent
{
	String cou;
	void setcountry(String cou)	
	{	this.cou=cou;	}
}
class State extends Country
{
	String st;
	void setstate(String st)
	{	this.st=st;	}
	void display(
	{
		System.out.println("Continent=" + con);
		System.out.println("Country=" + cou);
		System.out.println("State=" + st);
	}
}
class conDemo extends state
{
	String pl;
	void setplace(String st)
	{	this.pl=st;	}
	void display()
	{
		System.out.println("Continent=" + con);
		System.out.println("Country=" + cou);
		System.out.println("State=" + st);
		System.out.println("Place=" + pl);
	}
	public static void main(String args[]) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	State s1=new State();
	System.out.print("Enter Continent:");
	String con=br.readLine();
	System.out.print("Enter Country:");
	String cou=br.readLine();
	System.out.print("Enter State:");
	String st=br.readLine();
	System.out.print("Enter Place:");
	String pl=br.readLine();
	
	s1.setdata(con);
	s1.setcountry(cou);
	s1.setstate(st);
	s1.setplace(st);
	s1.display();
	}
}	
	