import javax.swing.*;
import java.awt.*;

public class ContributionAmount extends JPanel {
    JLabel contributionPrompt;
    JTextField  contributionAmount;
    JButton next;

    public ContributionAmount() {
        contributionPrompt = new JLabel("Please enter the contribution amount (monthly):");
        contributionAmount = new JTextField(10);
        next = new JButton("Next");

        JPanel textPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textPanel.add(contributionAmount);

        // Set layout and create constraints
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        // First add the prompt - this will place it above
        add(contributionPrompt, gbc);
        // Add the textPanel with the textfield
        add(textPanel, gbc);
        // Finally add the next button
        add(next, gbc);





    }

}
