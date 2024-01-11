import java.awt.*;
import java.awt.event.*;
class FirstDemo extends Frame implements ActionListener{
	TextField num1,num2;
	Button summ,mull;
	Label result,mul;
	FirstDemo()
	{
		setSize(450,450);
		FlowLayout l = new FlowLayout();
		setLayout(l);
		Label l1= new Label ("First Number : ");
		Label l2= new Label ("Second Number : ");
		
		result= new Label ();
		mul = new Label();
		
		num1= new TextField(15);
		num2 = new TextField(15);
		
		summ =new Button("Sum");
		mull = new Button("Multiply");
		

		
		add(l1);
		add(num1);
		
		add(l2);
		add(num2);
		
		add(summ);
		add(result);
		
		add(mull);
		
		summ.addActionListener(this);
		mull.addActionListener(this);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(num1.getText());
		int y = Integer.parseInt(num2.getText());
		
		if(e.getActionCommand() == "Sum")
		{
	
		int z = x+y;
		result.setText("Sum of Numbers is " + z);
		}
		else
		{
			int z = x*y;
			result.setText("Product of Numbers is " + z);
		}
		
	}
}

public class prep1 {
public static void main(String args[])
{
	FirstDemo fd = new FirstDemo();

}
}
