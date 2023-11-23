import java.io.*;
class copyFile
{
public static void main(String args[]) throws IOException
{
try
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter two filnames");
	String f1=br.readLine();
	String f2=br.readLine();
	
	FileInputStream fis=new FileInputStream(f1);
	FileOutputStream fos=new FileOutputStream(f2);
	int b;
	while( (b=fis.read())!=-1)
	{
         fos.write(b);
	}
	fis.close();
	fos.close();
}
catch(FileNotFoundException e)
{ System.out.print("File Not Found");}
catch(ArrayIndexOutOfBoundsException e)
{ System.out.print("Invalid arguments");}
}
}			