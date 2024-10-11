import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NumberGuessingGameGUI extends JFrame {
    private JTextField inputField;
    private JLabel resultLabel;
    private JLabel instructionLabel;
    private GameLogic gameLogic; 
    public NumberGuessingGameGUI() {
        setTitle("Password Guessing Game");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        gameLogic = new GameLogic();
        gameLogic.Generate_Number();  
        instructionLabel = new JLabel("Enter a 4-digit number with no repeating digits:");
        instructionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        instructionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.setHorizontalAlignment(SwingConstants.CENTER);
        JButton checkButton = new JButton("Check");
        checkButton.setFont(new Font("Arial", Font.BOLD, 18));
        checkButton.setBackground(Color.GREEN);
        checkButton.setForeground(Color.WHITE);
        JButton resetButton = new JButton("Restart");
        resetButton.setFont(new Font("Arial", Font.BOLD, 18));
        resetButton.setBackground(Color.RED);
        resetButton.setForeground(Color.WHITE);
        resultLabel = new JLabel("Result will be displayed here.");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setForeground(Color.BLUE);
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 1, 10, 10));
        inputPanel.add(instructionLabel);
        inputPanel.add(inputField);
        inputPanel.add(resultLabel); 
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 10, 10));
        buttonPanel.add(checkButton);
        buttonPanel.add(resetButton); 
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userInput = inputField.getText(); 
                if (userInput.length() == 4) {
                    String result = gameLogic.operation(userInput);  
                    resultLabel.setText(result);
                } else {
                    resultLabel.setText("Please enter a 4-digit number.");
                }
            }
        });
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");  
                resultLabel.setText("Result will be displayed here.");
                gameLogic.Generate_Number();  
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberGuessingGameGUI().setVisible(true);
            }
        });
    }
}