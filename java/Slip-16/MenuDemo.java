import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MenuDemo extends JFrame implements ActionListener
{
	JMenuBar mb;
	JMenu m1,m2,tf;
	JMenuItem t1,t2,t3,t4,s1,s2,p1,p2,p3;
	JCheckBoxMenuItem c1,c2;
	JRadioButtonMenuItem r1,r2;
	ButtonGroup bg=new ButtonGroup();
	JPopupMenu pm;
	Container con=getContentPane();
	MenuDemo()
	{
		super("Menu Designing Application");

		mb=new JMenuBar();
		m1=new JMenu("File");
		m2=new JMenu("Edit");

		t1=new JMenuItem("New");
		t2=new JMenuItem("Open");
		t3=new JMenuItem("Save");
		t4=new JMenuItem("Exit");


		tf=new JMenu("Format");
		s1=new JMenuItem("Color");
		s2=new JMenuItem("Font");
	
		c1=new JCheckBoxMenuItem("Bold");
		c2=new JCheckBoxMenuItem("Italic");
		r1=new JRadioButtonMenuItem("UpperCase");
		r2=new JRadioButtonMenuItem("LowerCase");

		pm=new JPopupMenu();
		p1=new JMenuItem("Cut");
		p2=new JMenuItem("Copy");
		p3=new JMenuItem("Paste");
				

		bg.add(r1);
		bg.add(r2);
		m1.setMnemonic(KeyEvent.VK_F);	//Shortcut key to open File Menu ALT+F
		
		mb.add(m1);  mb.add(m2);

		m1.add(t1);  m1.add(t2);  m1.add(t3);  m1.addSeparator();  m1.add(t4);
		m2.add(c1);  m2.add(c2); m2.add(r1); m2.add(r2); m2.add(tf);
		tf.add(s1);
		tf.add(s2);
		pm.add(p1);
		pm.add(p2);
		pm.add(p3);

		setJMenuBar(mb);
		
		t4.addActionListener(this);

		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent me)
			{
			if(me.getButton()==MouseEvent.BUTTON3)
				pm.show(con, me.getX(),me.getY());
			}
		}
		);

		setSize(600,400);
		setLocation(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}
		public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==t4)
			System.exit(0);
		}	
	public static void main(String args[])
	{
		new MenuDemo();
	}
}