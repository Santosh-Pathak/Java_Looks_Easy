import java.awt.*;
import java.awt.event.*;

public class CountryCapitalQuiz extends Frame {
    private Choice countryChoice;
    private Choice capitalChoice;
    private Button submitButton;
    private Label feedbackLabel;

    private String[] countries = {"United States", "Canada", "France", "Japan", "Australia"};
    private String[] capitals = {"Washington, D.C.", "Ottawa", "Paris", "Tokyo", "Canberra"};

    public CountryCapitalQuiz() {
        setTitle("Country Capital Quiz");
        setSize(300, 200);
        setLayout(new FlowLayout());

        Label countryLabel = new Label("Select a country:");
        add(countryLabel);

        countryChoice = new Choice();
        for (String country : countries) {
            countryChoice.add(country);
        }
        add(countryChoice);

        Label capitalLabel = new Label("Select its capital:");
        add(capitalLabel);

        capitalChoice = new Choice();
        for (String capital : capitals) {
            capitalChoice.add(capital);
        }
        add(capitalChoice);

        submitButton = new Button("Submit");
        add(submitButton);

        feedbackLabel = new Label("");
        add(feedbackLabel);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = countryChoice.getSelectedItem();
                String selectedCapital = capitalChoice.getSelectedItem();

                int index = countryChoice.getSelectedIndex();
                if (index >= 0 && index < capitals.length && capitals[index].equals(selectedCapital)) {
                    feedbackLabel.setText("Correct answer!");
                } else {
                    feedbackLabel.setText("Incorrect answer. The correct capital is: " + capitals[index]);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        CountryCapitalQuiz quiz = new CountryCapitalQuiz();
        quiz.setVisible(true);
    }
}
