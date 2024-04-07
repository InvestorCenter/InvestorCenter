import java.awt.*;
import javax.swing.*;

public class InitialContribution extends JPanel {
    JTextField initialContributionField;
     JButton next;

    public InitialContribution() {
        initialContributionField = new JTextField(10);
        add(initialContributionField);
        initialContributionField.setBorder(BorderFactory.createLineBorder(Color.black));
        JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textPanel.add(initialContributionField);
        JLabel incomeLabel = new JLabel("Please enter your initial contribution amount:");
        next = new JButton("Next");

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        add(incomeLabel, gbc);
        add(textPanel, gbc);
        add(next, gbc);
    }
}