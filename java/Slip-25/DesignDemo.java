import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DesignDemo extends JFrame implements ActionListener
{
	JCheckBox cb1,cb2,cb3;
	JRadioButton rb1,rb2,rb3;
	ButtonGroup bg=new ButtonGroup();
	JLabel a1,a2,a3;
	JTextField t1, t2;
	JPanel p1,p2;
	JButton b1;
	DesignDemo()
	{
		setLayout(new FlowLayout());
	
		p1=new JPanel();
		p2=new JPanel();
		
		a1=new JLabel("Your Name");
		a2=new JLabel("Your Class");
		a3=new JLabel("Your Hobbies");
		
		
		cb1=new JCheckBox("Music");
		cb2=new JCheckBox("Dance");
		cb3=new JCheckBox("Sport");
		
		rb1=new JRadioButton("FY");
		rb2=new JRadioButton("SY");
		rb3=new JRadioButton("TY");
		
		t1=new JTextField(10);
		t2=new JTextField(30);
		
		b1=new JButton("Ok");
		
		bg.add(rb1);bg.add(rb2);bg.add(rb3);

		p1.setLayout(new GridLayout(5,2));
		p2.setLayout(new GridLayout(2,2));
		
		p1.add(a1);	
		p1.add(t1);	
		p1.add(a2);	
		p1.add(a3);
		
		p1.add(rb1);	p1.add(cb1);	
		p1.add(rb2);	p1.add(cb2);	
		p1.add(rb3);	p1.add(cb3);
		p2.add(t2);
		p2.add(b1);
		
		
		add(p1,"North");
		add(p2,"East");
		
		b1.addActionListener(this);

		setSize(350,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1,s2,s3,s4;
		s1=" ";
		s2=" ";
		s3=" ";
		s4=" ";
		if(cb1.isSelected())
			s1=cb1.getLabel();
		if(cb2.isSelected())
			s2=cb2.getLabel();
		if(cb3.isSelected())
			s3=cb3.getLabel();
		
		
		if(rb1.isSelected())
			s4=rb1.getLabel();
		else if(rb2.isSelected())
			s4=rb2.getLabel();
		else if(rb3.isSelected())
			s4=rb3.getLabel();

		String str="Name=" + t1.getText()  +" Class=" + s4+ " Hobbies=" + (s1+s2+s3);
		t2.setText(str);
	}
	public static void main(String args[])
	{
		new DesignDemo();
	}
}	

