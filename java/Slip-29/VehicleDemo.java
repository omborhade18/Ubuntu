import java.io.*;
class Vehicle
{
    String company;
    float price;

    Vehicle(String  c,float p)  //superclass constructor
     { company=c;
        price=p;
     }
     void display(){}
}
class LightMotorVehicle extends Vehicle
{
    int mileage;
    
    LightMotorVehicle (String c,float p,int m)
    {
	super(c,p);
	mileage=m;
    }
    
    void display()
    {
     System.out.println(company+"\t"+price+"\t"+mileage+"km");
    }
}
class HeavyMotorVehicle extends Vehicle
{
    int capacity;
    HeavyMotorVehicle (String c,float p,int m)
    {
	super(c,p);
	capacity=m;
    }
    void display()
    {
     System.out.println(company+"\t"+price+"\t"+capacity+"tons");
    }
}
class VehicleDemo
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter how many vehicles:");
int n=Integer.parseInt(br.readLine());

Vehicle v[]=new Vehicle[n];

for(int i=0;i<n;i++)
{
System.out.println("Type of vehicle:");	 
System.out.println("1.Light motor vehicle:");	 
System.out.println("2.Heavy motor vehicle:");	 
System.out.print("Enter Choice:");	 
int ch=Integer.parseInt(br.readLine());

System.out.println("Enter Company Name:");
String c=br.readLine();
System.out.println("Enter Price:");
float p=Float.parseFloat(br.readLine());
if(ch==1)
{
   System.out.println("Enter mileage");
   int m=Integer.parseInt(br.readLine());
   v[i]=new LightMotorVehicle(c,p,m);
}
else
{
   System.out.println("Enter capacity in tons:");
   int m=Integer.parseInt(br.readLine());	
   v[i]=new HeavyMotorVehicle(c,p,m);
}
}//end for
System.out.println("Company\tPrice\tMileage/Capacity");
for(int i=0;i<n;i++)
{	
     v[i].display();}
}
}