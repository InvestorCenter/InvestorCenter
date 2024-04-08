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

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;

        add(contributionPrompt, gbc);
        add(textPanel, gbc);
        add(next, gbc);





    }

}
