import java.io.*;
class InsufficientFundsException extends Exception
{
     InsufficientFundsException(String msg)
     {super(msg);}
}

class Bank
{
  private int accno;
  private String name;
  private float bal;
                
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  void accept() throws IOException
  {
     try
     { 
          System.out.print("Enter Account no:");
          accno =Integer.parseInt(br.readLine());
          System.out.print("Enter Name:");
          name=br.readLine();
          System.out.print("Enter Balance:");
          bal=Float.parseFloat(br.readLine());
          if(bal < 500)
	throw new InsufficientFundsException("Insufficient balance");

      }
      catch(InsufficientFundsException ob)
     {
	System.out.println(ob.getMessage());
     }

  }
  public void withDraw() throws Exception
  {
     try
     {
          System.out.print("Enter amount to be withdrawn:");
          float amt=Integer.parseInt(br.readLine());
          if(bal - amt < 500)
	throw new InsufficientFundsException("Insufficient balance");
          else
          {
	bal=bal - amt;
	System.out.println("Amount withdrawn successfully.");
          }
     }
     catch(InsufficientFundsException ob)
     {
	System.out.println(ob);
     }
}
           
public void deposit() throws Exception
{
     System.out.println("Enter amount to be deposited:");
     float amt=Integer.parseInt(br.readLine());
     bal=bal+amt;
     System.out.println("Amount deposited successfully.");
}

public void viewBalance()
{
     System.out.println("Balance:"+bal);
}
}

class SavingAccountDemo
{
     public static void main(String ar[]) throws Exception
     {
     BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      
     SavingAccount sa=new SavingAccount();

     while(true)
     {
          System.out.println("1.Accept\n2.Deposit\n3.Withdraw\n4.Check Balance\n5.Exit");
          System.out.print("Enter your choice (1-4):");
                                                            
          int ch=Integer.parseInt(br.readLine());
          switch(ch)
          {
	case 1: 	sa.accept();
		break;
	case 2: 	sa.deposit();
		break;
	case 3:	sa.withDraw();
                               	break;
	case 4:	sa.viewBalance();
		break;
	case 5: 	System.exit(0);
           }
     }
  }
}