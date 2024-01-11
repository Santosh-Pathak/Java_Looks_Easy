import java.awt.*;
import java.awt.event.*;

public class LoginForm extends Frame implements ActionListener {
    private TextField userIdField;
    private TextField passwordField;
    private Button loginButton;

    public LoginForm() {
        // Set up the frame
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Create and add components
        Label userIdLabel = new Label("User ID:");
        add(userIdLabel);

        userIdField = new TextField(20);
        add(userIdField);

        Label passwordLabel = new Label("Password:");
        add(passwordLabel);

        passwordField = new TextField(20);
        passwordField.setEchoChar('*'); // Hide the password characters
        add(passwordField);

        loginButton = new Button("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        // Add a window listener to handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        // Check if the entered user-id and password match
        String userId = userIdField.getText();
        String password = passwordField.getText();

        if (userId.equals("admin") && password.equals("password123")) {
            showWelcomeMessage();
        } else {
            showErrorDialog("Invalid user-id or password. Please try again.");
        }
    }

    private void showWelcomeMessage() {
        // Display a welcome message
        Label welcomeLabel = new Label("Welcome!");
        add(welcomeLabel);

        // Disable the login button
        loginButton.setEnabled(false);

        // Repaint the frame to show the new components
        validate();
    }

    private void showErrorDialog(String message) {
        // Display an error dialog with the given message
        Dialog errorDialog = new Dialog(this, "Error", true);
        errorDialog.setLayout(new FlowLayout());
        errorDialog.setSize(300, 100);

        Label errorLabel = new Label(message);
        errorDialog.add(errorLabel);

        Button closeButton = new Button("Close");
        closeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                errorDialog.dispose();
            }
        });
        errorDialog.add(closeButton);

        errorDialog.setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
