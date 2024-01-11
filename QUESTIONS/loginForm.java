import java.awt.*;
import java.awt.event.*;

class success extends Frame {
    Label lb1;

    success() {
        setLayout(new FlowLayout());
        setSize(300, 300);
        lb1 = new Label("Welcome to the Page ");
        add(lb1);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class failure extends Frame {
    Label lb1;

    failure() {
        setLayout(new FlowLayout());
        setSize(300, 300);
        lb1 = new Label("Incorrect Credentials ");
        add(lb1);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class loginForm extends Frame implements ActionListener {

    Label lbl1, lbl2;
    Button btn1;
    TextField txt1, txt2;
    String userId = "PathakSantosh987@gmail.com";
    String password = "santosh123";

    loginForm() {
        setLayout(new FlowLayout());
        setSize(280, 200);
        lbl1 = new Label("Enter User ID");
        lbl2 = new Label("Enter User Password ");
        btn1 = new Button("Log In");
        txt1 = new TextField();
        txt2 = new TextField();
        txt1.setColumns(30);
        txt2.setColumns(30);

        btn1.addActionListener(this);
        add(lbl1);
        add(lbl2);
        add(txt1);
        add(txt2);
        add(btn1);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new loginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (txt1.getText() != null && txt1.getText().equals(userId)) {
            if (txt2.getText() != null &&
                    txt2.getText().equals(password)) {
                setVisible(false);
                new success();
            }
        } else {
            setVisible(false);
            new failure();
        }
    }

}
