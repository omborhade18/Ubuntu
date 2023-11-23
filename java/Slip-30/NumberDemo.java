import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b1;
	JLabel a1,a2;
    myframe()
	{
		super("String Demo"); 
		setLayout(new FlowLayout());
        
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		b1=new JButton("Ok");
		a1=new JLabel("First Number");
		a2=new JLabel("Second Number");
		
		
      add(a1);
      add(t1);
	  add(a2);
      add(t2);
      add(t3);
      add(b1);
	 

      b1.addActionListener(this);
      
      setSize(300,200);
      setLocation(200,100);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent ae)
   {
	   try
	   {
		int a,b;
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		int ans=a/b;
	
		if(ae.getSource()==b1)
		{
			t3.setText(Integer.toString(ans));
		}
	   }
	   catch(NumberFormatException e)
	   {
		JOptionPane.showMessageDialog(this,"Format");
	   }
	   
   }
}
class NumberDemo
{   public static void main(String args[])
   {	new myframe();   }
}
