import java.io.*;
class FileDemo
{
    public static void main(String arg[])
    {
        File f1=new File(arg[0]);
        if(f1.exists())
        {
          	System.out.println("Filename="+f1.getName());
	System.out.println("Path="+f1.getPath());
   	System.out.println("Absolute Path="+f1.getAbsolutePath());
	System.out.println(f1.canWrite()? "writable" : "not writable");
	System.out.println(f1.canRead()? "readable" : "not readable");
	System.out.println(f1.isAbsolute()? "absolute" : "not absolute");
	System.out.println(new java.util.Date(f1.lastModified()));   //date
	System.out.println(f1.length());
        }
        else
    	System.out.println("File does not exist");
    }//end main
}//end class