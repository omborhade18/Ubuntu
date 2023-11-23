//Slip28_2

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class MyFrameDemo extends JFrame implements ActionListener
{
       		  JTextField t1,t2;
     		  JLabel a1,a2;
     	  	  JButton b1;

       	MyFrameDemo()
      {   
   		 super("Conversion of Temperature");
      		 setLayout(new GridLayout(3,2));
      		 b1=new JButton("ok");		
      		 t1=new JTextField(10);
		 t2=new JTextField(10);
		 a1=new JLabel("Celsius");
		 a2=new JLabel("Fahrenheit");

		
		
         
          	 add(a1);
   		  add(t1);
	 	add(a2);		   
   		add(t2);	
       		add(b1);
 	b1.addActionListener(this);
           setSize(300,200);
           setVisible(true);
          setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	public void actionPerformed (ActionEvent ae)
{
		if(ae.getSource()==b1)
{
			 float c=Integer.parseInt(t1.getText());
			 float f=(32*F-32)*5/9;
			t3.setText(Integer.toString(f));
		}
			
		class MyFrame
	{
	public static void main(String arga[])
	{
		new MyFrameDemo();
	}

     }
}
}
