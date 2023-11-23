interface Operation
{
	final float PI=3.142f;
	void area();
	void volume();
}
class Cylinder implements Operation
{
    float radius, height;	
    Cylinder(float radius, float height)	//constructor
    {
	this.radius=radius;
	this.height=height;
    }	
    public void area() //overriden method		
    {
	float a=2 * PI * radius * (radius+height) ;
	System.out.println("Area of Cylinder="+a) ;
    }    
    public void volume() //overriden method		    
  {
	float v=PI * radius * radius   * height ;
    	System.out.print("Volume of Cylinder="+v);
    }    

}
class UseOperation
{ static public void main(String args[])
   {
     Cylinder c1=new Cylinder(3,2);
     c1.area();
     c1.volume();
   }
}



