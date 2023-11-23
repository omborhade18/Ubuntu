import java.io.*;
class Account
{
	int accno;
	String name;
	Account(int accno, String name)
	{
		this.accno=accno;
		this.name=name;
	}
}
class SavingAccount extends Account
{
	float balance, minbalance;
	
	SavingAccount(int accno, String name, float balance, float minbalance)
	{
		super(accno,name);
		this.balance=balance;
		this.minbalance=minbalance;
	}
}
class AccountDetails extends SavingAccount
{
	int depositAmt, withDrawAmt;
	
	AccountDetails(int accno, String name, float balance, float minbalance, float depositAmt, float withDrawAmt)
	{
		super(accno,name,balance,minbalance);
		this.depositAmt=depositAmt;
		this.withDrawAmt=withDrawAmt;
	}
	void display()
	{
		System.out.println("Account no="+accno);
		System.out.println("Customer Name="+name);
		System.out.println("Saving balance="+balance);
		System.out.println("Minimum balance="+minbalance);
		System.out.println("Deposit amount="+depositAmt);
		System.out.println("Withdraw amount="+withDrawAmt);		
}
	
class AccountDemo
{
    public static void main(String ar[]) throws Exception
    {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter Account no:");
    int accno =Integer.parseInt(br.readLine());
    System.out.print("Enter Name:");
    String name=br.readLine();
    System.out.print("Enter Saving balance:");
    float balance =Float.parseFloat(br.readLine());
    System.out.print("Enter Minimum balance:");
    float minbalance =Float.parseFloat(br.readLine());
    System.out.print("Enter  deposit Amount:");
    float depositAmt =Float.parseFloat(br.readLine());
    System.out.print("Enter withDraw Amount:");
    float withDrawAmt =Float.parseFloat(br.readLine());
   
	AccountDetails a=new AccountDetails(accno, name, balance, minbalance, depositAmt, withDrawAmt);
	a.display();
    
  }
}