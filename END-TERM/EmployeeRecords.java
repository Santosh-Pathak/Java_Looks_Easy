import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class EmployeeRecords extends JFrame implements ActionListener {
    private JLabel departmentLabel;
    private JTextField departmentTextField;
    private JTextArea resultTextArea;

    public EmployeeRecords() {
        setTitle("Employee Records");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        departmentLabel = new JLabel("Enter Department:");
        departmentTextField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(this);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(departmentLabel);
        panel.add(departmentTextField);
        panel.add(searchButton);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(panel, BorderLayout.NORTH);
        container.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getActionCommand().equals("Search")) {
            String department = departmentTextField.getText();

            try {
                // Assuming you have a database connection setup
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");

                String query = "SELECT * FROM employees WHERE department = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, department);
                ResultSet resultSet = statement.executeQuery();

                resultTextArea.setText(""); // Clear previous results

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String designation = resultSet.getString("designation");
                    // Add more columns as per your employees table structure

                    String result = "ID: " + id + ", Name: " + name + ", Designation: " + designation;
                    resultTextArea.append(result + "\n");
                }

                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                resultTextArea.setText("Error occurred while fetching records!");
            }
        }
    }

    public static void main(String[] args) {
        EmployeeRecords employeeRecords = new EmployeeRecords();
        employeeRecords.setVisible(true);
    }
}
