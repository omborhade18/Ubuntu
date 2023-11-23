import java.io.*;
class OxyException extends Exception
{
     OxyException(String msg)
     {super(msg);}
}
class Patient
{
  int age,oxylevel,hrct;
  String name;
  
  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
  void accept() throws IOException
  {
     try
     { 
          System.out.print("Enter Patient Name:");
          name=br.readLine();
          System.out.print("Enter Patient age:");
          age =Integer.parseInt(br.readLine());
          System.out.print("Enter Oxygen level:");
          oxylevel=Integer.parseInt(br.readLine());
          System.out.print("Enter HRCT scan report:");
          hrct=Integer.parseInt(br.readLine());
          
          if(oxylevel <95 && hrct > 10)
	throw new OxyException("Patient is Covid positive-need to hospitalized");
          else
          {
          System.out.println("Patient Name:"+name);
          System.out.println("Patient age:"+age);
          System.out.println("Oxygen level:"+oxylevel);
          System.out.println("HRCT scan report:"+hrct);
          }
      }
      catch(OxyException ob)
     {
	System.out.println(ob.getMessage());
     }
  }
}
class PatientDemo
{
     public static void main(String ar[]) throws Exception
     {
      Patient p=new Patient();
      p.accept();
     }
}