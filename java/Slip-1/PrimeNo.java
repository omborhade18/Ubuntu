class PrimeNo
{
   public static void main(String args[])
   {
          int a[]=new int[args.length];
          for(int i=0;i<a.length;i++)
	a[i]=Integer.parseInt(args[i]);
          for(int i=0;i<a.length;i++)
          {      int n=a[i];
          	boolean flag = true; 
          	for(int j=2;j<=n/2;j++)
          	{
         		if(n%j==0)
		{    flag=false; break; }
           	}
           	if (flag==true)
		System.out.println(n+" is Prime");           
           }
     }
}
