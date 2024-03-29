import java.awt.*;
import java.awt.event.*;
// An AWT GUI program inherits the top-level container java.awt.Frame
public class prep extends Frame {
 private Button btn1, btn2, btn3, btn4, btn5, btn6;
 /** Constructor to setup GUI components */
 public prep() {
 setLayout(new FlowLayout());
 // "this" Frame sets layout to FlowLayout, which arranges the components
 // from left-to-right, and flow from top-to-bottom.
 btn1 = new Button("Button 1");
 add(btn1);
 btn2 = new Button("This is Button 2");
 add(btn2);
 btn3 = new Button("3");
 add(btn3);
 btn4 = new Button("Another Button 4");
 add(btn4);
 btn5 = new Button("Button 5");
 add(btn5);
 btn6 = new Button("One More Button 6");
 add(btn6);
 setTitle("FlowLayout Demo"); // "this" Frame sets title
 setSize(280, 150); // "this" Frame sets initial size
 setVisible(true); // "this" Frame shows
 }
 /** The entry main() method */
 public static void main(String[] args) {
 new prep(); // Let the constructor do the job
 }
}
