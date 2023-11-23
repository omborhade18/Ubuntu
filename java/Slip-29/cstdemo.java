slip 29.1

import java.io.*;
class customer
{
	int cno;
	String cname,ccno,cadd;
	
	customer(int cno,String cname,String ccno,String cadd)
	{
		this.cno=cno;
		this.cname=cname;
		this.ccno=ccno;
		this.cadd=cadd;
	}	
	
	String getnum()
	{
	  return ccno;
	}

	
}



class cstdemo
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of customers:");
		int n=Integer.parseInt(br.readLine());
		
		customer c[]=new customer[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter customer no.");
			int cno=Integer.parseInt(br.readLine());

			System.out.println("Enter customer name");
			String cname=br.readLine();

			System.out.println("Enter customer contact number");
			String ccno=br.readLine();
				
			System.out.println("Enter customer address");
			String cadd=br.readLine();

			c[i]=new customer(cno,cname,ccno,cadd);
		}
		System.out.println("Enter Customer Contact number");
		String a=br.readLine();
			for(int i=0;i<n;i++)
			  {
				if(a.equals(c[i].getnum()))
				{
				   System.out.println(cno+"\t"+cname+"\t"+ccno +"\t"+cadd);
				   
				}
				else
				{
				  System.out.println("Not Found!!!");
				}			
			  }
		
    }	
}				
			