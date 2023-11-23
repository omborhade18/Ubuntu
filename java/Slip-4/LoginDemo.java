import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckException extends Exception
{      CheckException(String msg)
        {super(msg);}
}
class LoginDemo extends JFrame implements ActionListener
{
	JLabel a1,a2;
	JButton b1,b2;
	JTextField t1;
	JPasswordField p1;
	static int cnt=0;
	LoginDemo()
	{
		super("Login Window...");
		setLayout(new FlowLayout());

		a1=new JLabel("User Name :",JLabel.RIGHT);
		a2=new JLabel("Password   :",JLabel.RIGHT);

		b1=new JButton("Login");
		b2=new JButton("Clear");

		t1=new JTextField(20);
		p1=new JPasswordField(20);
		
		add(a1);	add(t1);
		add(a2);	add(p1);
		add(b1);	add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{	
			String user=t1.getText();
			String pass=p1.getText();
			if(user.equals(pass))
				JOptionPane.showMessageDialog(this, "Login Successful");
			else
			{
			     try{
				cnt++;
				if(cnt==3)
				{
				   JOptionPane.showMessageDialog(this, "Attempts Over");
				   System.exit(0);
				}
				else
				  throw new CheckException("Authentication failure");	
    			     }
			catch(CheckException e)
			{ JOptionPane.showMessageDialog(this, "Login Fails");}
			}
		}
		else if(ae.getSource()==b2)
		{
			t1.setText("");
			p1.setText("");
		}
	}
	public static void main(String []args)
	{
		new LoginDemo();
	}
}
