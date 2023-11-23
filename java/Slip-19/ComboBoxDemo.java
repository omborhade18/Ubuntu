import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ComboBoxDemo extends JFrame implements ItemListener
{
	JComboBox cb=new JComboBox();
	JTextField t1=new JTextField(20);
	ComboBoxDemo()
	{
		super("Combo Box Event Demo");
		setLayout(new FlowLayout());

		cb.addItem("Operating System ");
		cb.addItem("Python");
		cb.addItem("Java");
		cb.addItem("TCS");
		cb.addItem("Web Technology");
		cb.addItem("Computer Network");
		
		add(cb);
		add(t1);

		cb.addItemListener(this);

		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		t1.setText((String)cb.getSelectedItem());
	}
	public static void main(String args[])
	{
		new ComboBoxDemo();
	}
}