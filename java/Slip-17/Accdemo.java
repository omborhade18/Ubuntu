slip 17.1

import java.io.*;
class Customer
{
	String cname,phno;
	
	Customer(String cname,String phno)
	{
		this.cname=cname;
		this.phno=phno;
	}
}
class Depositor extends Customer
{
	int accno;
	double balance;

	Depositor(String cname,String phno,int accno,double balance)
	{
		super(cname,phno);
		this.accno=accno;
		this.balance=balance;
	}
}
class Borrower extends Depositor
{
	int loanno;
	double loanamt;
	
	Borrower(String cname,String phno,int accno,double balance,int loanno,double loanamt)
	{
		super(cname,phno,accno,balance);
		this.loanno=loanno;
		this.loanamt=loanamt;
	}
	void display()
	{
		System.out.println(cname+"\t"+phno+"\t"+balance+"\t"+loanno+"\t"+loanamt);
		
	}

}
class Accdemo
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how many Customer");
		int n=Integer.parseInt(br.readLine());
		
		Borrower b[]=new Borrower[n];
		for(int i=0;i<n;i++)
		{
		
			System.out.println("Enter Coustomer Name");
			String cname=br.readLine();

			System.out.println("Enter Phone Number");
			String phno=br.readLine();

			System.out.println("Enter Account Number");
			int accno=Integer.parseInt(br.readLine());

			System.out.println("Enter Balance");
			double balance=Double.parseDouble(br.readLine());

			System.out.println("Enter Lone Number");
			int loanno=Integer.parseInt(br.readLine());

			System.out.println("Enter Loan Amount");
			double loanamt=Double.parseDouble(br.readLine());
			
			b[i]= new Borrower(cname,phno,accno,balance,loanno,loanamt);
		}
		System.out.println("Coustomer Name\t Phnoe Number \t Account Number \t Balance \t Loan Number \t Loan Amount");
		for(int i=0;i<n;i++)
		{
			b[i].display();
		}		
	}
}