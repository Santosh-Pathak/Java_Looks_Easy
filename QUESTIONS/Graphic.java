
import java.awt.*;

class FirstDemo extends Frame{
	void display()
	{
		setSize(3000,300);
		FlowLayout l = new FlowLayout();
		setLayout(l);
		Button b =new Button("Click Me");
		TextField txt = new TextField(15);
		
		add(b);
		add(txt);
		setVisible(true);
	}
}

public class Graphic {
public static void main(String args[])
{
	FirstDemo fd = new FirstDemo();
	fd.display();
}
}

