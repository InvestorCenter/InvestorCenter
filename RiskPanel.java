import javax.swing.*;
import java.awt.*;

public class RiskPanel extends JPanel {
    JLabel riskLevelLabel;
    JRadioButton lowRiskLevel;
    JRadioButton mediumRiskLevel;
    JRadioButton highRiskLevel;
    ButtonGroup riskGroup;
    JButton nextButton;

    public RiskPanel(){
        riskLevelLabel = new JLabel("Please select a risk level:", JLabel.CENTER);

        lowRiskLevel = new JRadioButton("Low");
        mediumRiskLevel = new JRadioButton("Medium");
        highRiskLevel = new JRadioButton("High");

        nextButton = new JButton("Next");

        riskGroup = new ButtonGroup();
        riskGroup.add(lowRiskLevel);
        riskGroup.add(mediumRiskLevel);
        riskGroup.add(highRiskLevel);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));


        radioPanel.add(riskLevelLabel);
        radioPanel.add(Box.createVerticalStrut(12));
        radioPanel.add(lowRiskLevel);
        radioPanel.add(mediumRiskLevel);
        radioPanel.add(highRiskLevel);
        radioPanel.add(Box.createVerticalStrut(12));
        radioPanel.add(nextButton);

        setLayout(new GridBagLayout());


        add(radioPanel);

    }

}
