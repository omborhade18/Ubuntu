class BMIDemo
{
   public static void main(String args[])
   {
          if(args.length==0)
	System.out.println("Not enough arguments");	
          else
          {

	String fname=args[0];
	String lname=args[1];
	float weight=Float.parseFloat(args[2]);
	float height=Float.parseFloat(args[3]);
	float bmi=weight/(height*height);

	System.out.println("First Name=" + fname);
	System.out.println("Last Name=" + lname);
	System.out.println("Weight(kg)=" + weight);
	System.out.println("Height(meter)=" + height);
	System.out.println("Body Mass Index =" + bmi);

          }
   }
}