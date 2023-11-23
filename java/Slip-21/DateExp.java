import java.io.*;
class DateException extends Exception
{       DateException(String msg)
         {	super(msg);         }
}
class MyDate
{
    int dd,mm,yy;
    void accept()
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try
      {
        System.out.print("Enter date:");
        dd=Integer.parseInt(br.readLine());
        mm=Integer.parseInt(br.readLine());
        yy=Integer.parseInt(br.readLine());

        if(String.valueOf(yy).length()>4)
	throw new DateException("Invalid Year");
        else if(mm>12 || mm<1)
               	throw new DateException("Invalid month");
        else if(mm==1 || mm==3 ||mm==5 ||mm==7||mm==8||mm==10||mm==12)
        {     
	if(dd>31|| dd<1)	
	     throw new DateException("Invalid Date");
        }
        else if(mm==4||mm==6||mm==9||mm==11)	
        { 
	if(dd>30|| dd<1)	
	     throw new DateException("Invalid Date");
        }
        else if(mm==2)
        {
         	if(yy%4==0 ) 	//leap year
        	{   
	     if( dd>29)
		throw new DateException("Invalid Date");
        	}
        	else if(dd>28)
	      throw new DateException("Invalid Date");
         }
   }catch(DateException e)
   {   System.out.print(e);	}
    catch(IOException e)
    {   System.out.print(e);	}
  }//accept
   public String toString()
   {
	return(dd+"-"+mm+"-"+yy);
   }
}
class DateExp
{ 
  public static void main(String arg[]) 
  {
    MyDate d=new MyDate();
    d.accept(); 	
    System.out.print(d);	
  }
}	