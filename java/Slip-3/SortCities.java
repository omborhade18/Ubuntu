import java.io.*;
class SortCities
{
  public static void main(String args[])  throws IOException
  {
  
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.print("How many cities:");
     int n=Integer.parseInt(br.readLine());
     String city[]=new String[n];

     for(int i=0;i<n;i++)
     {
     System.out.print("Enter city:");
     city[i]=br.readLine();
     }
    System.out.println("Original Array:-");
    for(int i=0;i < n;i++)
         System.out.println(city[i]);

    String temp;
    for(int i=0;i<n;i++)
    for(int j=i+1;j<n;j++)
   {
        if(city[i].compareTo(city[j]) > 0)
        {
	temp=city[i];
	city[i]=city[j];	
	city[j]=temp;
        }
    }
    System.out.println("\nSorted  cities array:-");
    for(int i=0;i < n;i++)
	System.out.println(city[i]);
    }
}