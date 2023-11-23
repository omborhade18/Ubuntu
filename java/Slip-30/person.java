
import java.io.*;

class person 
	{
	
	String Aadharno,name, Panno;

person(String Aadharno, String name, String Panno)
 {
	this.Aadharno = Aadharno;
	this.name = name;
	this.Panno = Panno;
}

void display() 
{
	System.out.println(Aadharno+"\t"+name+"\t"+Panno);
}

public static void main(String ar[])throws IOException	
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter how many persons");
	int n = Integer.parseInt(br.readLine());
	person p[]=new person[n];
	
	for(int i=0;i<n; i++)
	{
	System.out.println("Enter Aadhar no");
	String a = br.readLine();
	System.out.println("Enter name");
	String name = br.readLine();
	System.out.println("Enter panno");
	String pno = br.readLine();
	p[i] = new person(a,name,pno);
	}
	System.out.println("Aadhar Number\t Name\t Pan Number");
	for(int i=0;i<n; i++)
	{
		p[i].display();
	}
}
}
