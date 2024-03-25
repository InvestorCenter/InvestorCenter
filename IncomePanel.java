import java.awt.*;
import javax.swing.*;

public class IncomePanel extends JPanel {
    JTextField incomeTextField;
     JButton next;

    public IncomePanel() {
        incomeTextField = new JTextField(10);
        add(incomeTextField);
        incomeTextField.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textPanel.add(incomeTextField);
        JLabel incomeLabel = new JLabel("Enter your yearly income as an integer:");
        next = new JButton("Next");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(incomeLabel, gbc);
        add(textPanel, gbc);
        add(next, gbc);
    }
}