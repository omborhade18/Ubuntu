import java.io.*;
class PasswordException extends Exception
{       PasswordException(String msg)
         {	super(msg);         }
}
class passwordExp
{ public static void main(String arg[])
  {
   String uname, pwd;
   try
   {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter user name: ");
   uname=br.readLine();
   System.out.print("Enter Password: ");
   pwd=br.readLine();
   if(uname.equals(pwd))
     System.out.println("Login Successful");
   else
     throw new PasswordException("Authentication Failure");   
   }
   catch(PasswordException e)
   {   System.out.print(e.getMessage());   }
   catch(IOException e)
   {   System.out.print(e.getMessage());   }
 }	
}