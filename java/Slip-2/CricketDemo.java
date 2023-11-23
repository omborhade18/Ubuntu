import java.io.*;
class Cricket
{
     int inn, notout, runs;
     String name;
     float avg;
    
     void accept() throws IOException
     {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter name:");
	name=br.readLine();
	System.out.println("Enter no of innings:");
	inn=Integer.parseInt(br.readLine());
	System.out.println("Enter no of times not out:");
	notout=Integer.parseInt(br.readLine());
	System.out.println("Enter total runs:");
	runs=Integer.parseInt(br.readLine());
	System.out.println("Enter batting average:");
	avg=Float.parseFloat(br.readLine());	
     }
     void display()
     {
	System.out.println(name+"\t" +inn+ "\t" +notout +"\t" + runs +"\t" + avg);
     }
     static void average(Cricket c[], int n)
     {
	      for(int i=0;i<n;i++)
		c[i].avg=c[i].runs/c[i].inn;	
     }
     static void sort(Cricket c[], int n)
     {
            Cricket temp;
            for(int i=0;i<n;i++)
	for(int j=i+1;j<n;j++)
	if(c[i].avg<c[j].avg)
	{
		temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
     }

}
class CricketDemo
{   static public void main(String args[]) throws IOException
     { 	
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      System.out.println("Enter how many players");
      int n=Integer.parseInt(br.readLine());
      
      Cricket c[]=new Cricket[n];
      
      for(int i=0;i<n;i++)
      {
       	c[i]=new Cricket();
	c[i].accept();
      }
      Cricket.average(c,n);
      Cricket.sort(c,n);

     System.out.println("Name\tInnings\tTotal Runs\t Not Out\t Batting Average");   			
     for(int i=0;i<n;i++)   
	c[i].display();   	
   }
}	
