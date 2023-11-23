import java.io.*;
abstract class order
{
   int id;
   String desc;
   abstract void accept(int i,String d,String name);
   abstract void display();
}
class purchase extends order
{
   String cname;
   void accept(int i,String d,String name)
   {
       super.id=i;
       super.desc=d;
       cname=name;
   }
   void display()   //override method
   {
      System.out.print(super.id+"\t");
      System.out.println(super.desc+"\t" +cname);
   }
}
class sales extends order
{
   String vname;
   void accept(int i,String d,String name)
   {
       super.id=i;
       super.desc=d;
       vname=name;
   }
   void display()   //override method
   {
       System.out.print(super.id+"\t");
       System.out.println(super.desc+"\t" +vname);
   }
}
class useOrder
{
   public static void main(String args[]) throws IOException
   {	
        purchase p[]=new purchase[3];
        sales s[]=new sales[3];

        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<3;i++)
        { 
       	System.out.println("Enter Id, Description, Customer name:");
	int id=Integer.parseInt(br.readLine());
	String desc=br.readLine();
	String cname=br.readLine();
  	p[i].accept(id,desc,cname);
        }
        for(int i=0;i<3;i++)
        { 
       	System.out.println("Enter Id, Description, Vendor name:");
	int id=Integer.parseInt(br.readLine());
	String desc=br.readLine();
	String vname=br.readLine();
  	s[i].accept(id,desc,vname);
        }
        System.out.println("\nPurchase order details");
        System.out.println("Id\tDesc\tCustname");
        for(int i=0;i<3;i++)
        	p[i].display();

        System.out.println("\nSales order details");
        System.out.println("Id\tDesc\tVendor name");
        for(int i=0;i<3;i++)
                s[i].display();	
}
}



