//Display the contents of file in reverse order
import java.io.*;
class FileReverseDemo
{
  public static void main(String args[]) throws IOException
  {
   try
   {
   FileInputStream f1=new FileInputStream(args[0]);
   StringBuffer st=new StringBuffer(" ");
   int b;
   while((b=f1.read())!=-1)
	st.append((char)b); 
   for(int i=st.length()-1;i>=0;i--)
   {
	   char ch=st.charAt(i);
	   if(Character.isLowerCase(ch))
		   ch=Character.toUpperCase(ch);
	   else if(Character.isUpperCase(ch))
		   ch=Character.toLowerCase(ch);
	System.out.print(ch);
   }
   f1.close();
 }
  catch(FileNotFoundException e)
  { System.out.print("File Not Found");}
  catch(ArrayIndexOutOfBoundsException e)
  { System.out.print("Invalid Arguments");}
 }
}		
