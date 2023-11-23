import java.io.*;
class FileDemo
{
	public static void main(String args[]) throws IOException
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int ans;
	  File f1 = new File(args[0]);
	  int cnt=0;
	  if(f1.isDirectory())
      { 
		File st[]=f1.listFiles();
		for(int i=0;i<st.length;i++)
		{
			if(st[i].getName().endsWith(".txt"))
			{	
				System.out.println(st[i].getName() + "  Want to delete?(1/0) ");
				ans=Integer.parseInt(br.readLine());
				if(ans==1)
				{
					st[i].delete();
					cnt++;
				}
			}
        }
		System.out.println("No of .txt files deleted="+cnt);
      }
	  else
	  {
     	System.out.println("Filename="+f1.getName());
		System.out.println("Filepath="+f1.getAbsolutePath());
		System.out.println(f1.canWrite()? "writable" : "not writable");
		System.out.println(f1.canRead()? "readable" : "not readable");
		System.out.println(f1.isAbsolute()? "absolute" : "not absolute");
		System.out.println(new java.util.Date(f1.lastModified()));   //date
		System.out.println(f1.length());
	  }
	  
  }
}