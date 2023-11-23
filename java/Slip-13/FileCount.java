//Count no of lines
import java.io.*;
class FileCount
{
  public static void main(String args[])
  {
  int c=0;
  try
  {
     FileReader f1=new FileReader(args[0]);
     BufferedReader br=new BufferedReader(f1);
     String st;
     while ( (st=br.readLine())!=null)
     {
        c++;		//count lines
        String s[]=st.split(" ");
		w=w+s.length;   //count words
		System.out.println(st);
	}
	System.out.print("No of lines="+c);
	System.out.print("No of words="+w);
    f1.close();
    br.close();
   }
   catch(FileNotFoundException e)
   {System.out.print(e.getMessage());}
   catch(IOException e)
   {System.out.print(e.getMessage());}
}//main
}//class


/*       String s[]=st.split(" ");
       w=w+s.length;   //count words
       System.out.println(st);
}
System.out.print("No of lines="+c);
System.out.print("No of words="+w);
*/