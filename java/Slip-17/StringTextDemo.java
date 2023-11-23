import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class myframe extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b1,b2;
      
    myframe()
	{
		super("String Demo"); 
		setLayout(new FlowLayout());
        
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(20);
		b1=new JButton("Concat");
		b2=new JButton("Reverse");
      
      
      add(t1);
      add(t2);
      add(t3);
      add(b1);
	  add(b2);

      b1.addActionListener(this);
      b2.addActionListener(this);
      
      setSize(300,200);
      setLocation(200,100);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   public void actionPerformed(ActionEvent ae)
   {
	String st1,st2;
	st1=t1.getText();
	st2=t2.getText();
	if(ae.getSource()==b1)
		t3.setText(st1.concat(st2));
	else if(ae.getSource()==b2)
	{
		StringBuffer str=new StringBuffer(t3.getText());
		str.reverse();
		t3.setText(str.toString());
	}
   }
}
class StringTextDemo
{   public static void main(String args[])
   {	new myframe();   }
}
