
import javax.swing.*;
import java.awt.*;




public class TimePeriod extends JPanel{

    JLabel promptUser;
    JRadioButton OnetoTwoYear;
    JRadioButton TwotoFiveYear;
    JRadioButton FivetoTen;
    ButtonGroup buttonGroup;
    JButton next;


    public TimePeriod(){
        promptUser = new JLabel("Please select a time period you wish to keep your money invested for:");
        OnetoTwoYear  = new JRadioButton("1 - 2 years");
        TwotoFiveYear = new JRadioButton("2 - 5 years");
        FivetoTen = new JRadioButton("5 - 10 years");
        next = new JButton("Next");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(OnetoTwoYear);
        buttonGroup.add(TwotoFiveYear);
        buttonGroup.add(FivetoTen);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));


        radioPanel.add(promptUser);
        radioPanel.add(Box.createVerticalStrut(12));
        radioPanel.add(OnetoTwoYear);
        radioPanel.add(TwotoFiveYear);
        radioPanel.add(FivetoTen);
        radioPanel.add(Box.createVerticalStrut(12));
        radioPanel.add(next);

        setLayout(new GridBagLayout());


        add(radioPanel);



    }

    
}