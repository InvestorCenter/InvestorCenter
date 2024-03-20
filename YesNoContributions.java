import javax.swing.*;
import java.awt.*;

public class YesNoContributions extends JPanel {
    JLabel contributionsLabel;
    JRadioButton yesButton;
    JRadioButton noButton;
    ButtonGroup buttonGroup;
    JButton next;


    public YesNoContributions() {
        contributionsLabel = new JLabel("Can you contribute monthly?:");
        yesButton = new JRadioButton("Yes");
        noButton = new JRadioButton("No");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(yesButton);
        buttonGroup.add(noButton);
        next = new JButton("Next");

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));
        radioPanel.add(contributionsLabel);
        radioPanel.add(yesButton);
        radioPanel.add(noButton);
        radioPanel.add(next);

        setLayout(new GridBagLayout());


        add(radioPanel);


    }

}
