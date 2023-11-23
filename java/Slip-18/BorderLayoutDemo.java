import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame
{
	MyFrame()
	{
	super("Border Layout Demo");
	setLayout(new BorderLayout(5,5));

	JButton b1=new JButton("Sunday");
	JButton b2=new JButton("Monday");
	JButton b3=new JButton("Tuesday");
	JButton b4=new JButton("Wednesday");
	

	add(b1, BorderLayout.NORTH);
	add(b2, BorderLayout.SOUTH);
	add(b3, BorderLayout.EAST);
	add(b4,"West");
	

	setSize(500,300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
class BorderLayoutDemo
{
	public static void main(String[] args)
	{	new MyFrame();	}
}
