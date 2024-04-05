// Java program to illustrate the CardLayout Class
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;


public class Survey extends JFrame implements ActionListener {

    // Declaration of objects of CardLayout class.
    CardLayout card;

    // Declaration of objects of JButton class.
    Intro intro;
    IncomePanel incomePanel;
    RiskPanel riskPanel;
    YesNoContributions yesNoContributions;
    ContributionAmount contributionAmount;
    TimePeriod timePeriod;
    // Declaration of objects
    // of Container class.
    Container c;
    
    Profile profile;

    public Survey()
    {

        // Function to set size of JFrame.
        setTitle("Survey");
        setSize(new Dimension(500, 400));
        setLocationRelativeTo(null);

        
        

        // Function to set visibility of JFrame.
        setVisible(true);

        // Function to set default operation of JFrame.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // to get the content
        c = getContentPane();

        // Initialization of object "card"
        card = new CardLayout();

        // set the layout
        c.setLayout(card);

        intro = new Intro();
        intro.next.addActionListener(this);
        
        incomePanel = new IncomePanel();
        incomePanel.setPreferredSize(new Dimension(400,400));
        incomePanel.requestFocus();
        incomePanel.incomeTextField.setEditable(true);
        incomePanel.next.addActionListener(this);

   


        riskPanel = new RiskPanel();
        riskPanel.nextButton.addActionListener(this);

        yesNoContributions = new YesNoContributions();
        yesNoContributions.next.addActionListener(this);

        contributionAmount = new ContributionAmount();
        contributionAmount.contributionAmount.setEditable(true);
        contributionAmount.next.addActionListener(this);

       timePeriod = new TimePeriod();
       timePeriod.next.addActionListener(this);
        profile = new Profile();
       

        c.add(intro, "welcome");

        // Adding the incomePanel
        c.add(incomePanel, "income");

        // Adding the riskPanel
        c.add(riskPanel, "risk");

        c.add(yesNoContributions, "contributions");

        c.add(contributionAmount, "amount");

        c.add(timePeriod, "timePeriod");
        

    }
    // TODO: make sure you have to select an option for radio buttons
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == intro.next){
            profile.setUsername(User.getName());
            System.out.println(User.getName());
            card.show(c, "income");
        } else if (e.getSource() == incomePanel.next) {
            profile.setIncome(Integer.valueOf(incomePanel.incomeTextField.getText()));
            System.out.println(profile.getIncome());
            card.show(c, "risk");

        } else if (e.getSource() == riskPanel.nextButton) {
            if(riskPanel.lowRiskLevel.isSelected()){
                profile.setRisk(1);
            }
            else if(riskPanel.mediumRiskLevel.isSelected()){
                profile.setRisk(2);
            }
            else if(riskPanel.highRiskLevel.isSelected()){
                profile.setRisk(3);
            }
            card.show(c, "contributions");
        } else if (e.getSource() == yesNoContributions.next) {
            if(yesNoContributions.yesButton.isSelected()){
                profile.setContributeMonthly(true);
                System.out.println(profile.getMonthlyAmount());
            card.show(c, "amount");
            }
            else if(yesNoContributions.noButton.isSelected()){
                profile.setContributeMonthly(false);
                card.show(c, "timePeriod");
            }
        }
        else if(e.getSource() == contributionAmount.next){
            profile.setMonthlyAmount(Integer.valueOf(contributionAmount.contributionAmount.getText()));
            card.show(c, "timePeriod");
        }

        // call the next card
        else if(e.getSource() == timePeriod.next){
            if(timePeriod.OnetoTwoYear.isSelected()){
                profile.setTimePeriod(1);
            }
            if(timePeriod.TwotoFiveYear.isSelected()){
                profile.setTimePeriod(2);
            }
            if(timePeriod.FivetoTen.isSelected()){
                profile.setTimePeriod(3);
            }
            profile.uploadProfile();
            int portfolio = DeterminePortfolio(profile);
            switch (portfolio) {
                case 111 -> Portfolios.createPortfolio111Panel();
                case 110 -> Portfolios.createPortfolio110Panel();
                case 121 -> Portfolios.createPortfolio121Panel();
                case 120 -> Portfolios.createPortfolio120Panel();
                case 131 -> Portfolios.createPortfolio131Panel();
                case 130 -> Portfolios.createPortfolio130Panel();
                case 211 -> Portfolios.createPortfolio211Panel();
                case 210 -> Portfolios.createPortfolio210Panel();
                case 221 -> Portfolios.createPortfolio221Panel();
                case 220 -> Portfolios.createPortfolio220Panel();
                case 231 -> Portfolios.createPortfolio231Panel();
                case 230 -> Portfolios.createPortfolio230Panel();
                case 311 -> Portfolios.createPortfolio311Panel();
                case 310 -> Portfolios.createPortfolio310Panel();
                case 321 -> Portfolios.createPortfolio321Panel();
                case 320 -> Portfolios.createPortfolio320Panel();
                case 331 -> Portfolios.createPortfolio331Panel();
                case 330 -> Portfolios.createPortfolio330Panel();
                default -> Portfolios.createDefaultPortfolioPanel();
            }

            }

// TODO: create seperate method. Pass in profile and return a number for a switch statement. Display card bases on that
    }
    // (RISK)(TIME)(CONTRIBUTE)

    public static int DeterminePortfolio(Profile profile){

            // Low risk
            if(profile.getRisk() == 1){
                if (profile.getTimePeriod() == 1){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 111;
                    }
                    // Not contribute monthly
                    else{
                        return 110;
                    }
                }
                else if(profile.getTimePeriod() == 2){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 121;
                    }
                    // Not contribute monthly
                    else{
                        return 120;
                    }
                }
                else if(profile.getTimePeriod() == 3){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 131;
                    }
                    // Not contribute monthly
                    else{
                        return 130;
                    }
                }
            }

            // Medium Risk
            else if(profile.getRisk() == 2){
                if (profile.getTimePeriod() == 1){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 211;
                    }
                    // Not contribute monthly
                    else{
                        return 210;
                    }
                }
                else if(profile.getTimePeriod() == 2){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 221;
                    }
                    // Not contribute monthly
                    else{
                        return 220;
                    }
                }
                else if(profile.getTimePeriod() == 3){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 231;
                    }
                    // Not contribute monthly
                    else{
                        return 230;
                    }
                }

            }
            // High Risk
            else if(profile.getRisk() == 3){
                if (profile.getTimePeriod() == 1){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 311;
                    }
                    // Not contribute monthly
                    else{
                        return 310;
                    }
                }
                else if(profile.getTimePeriod() == 2){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 321;
                    }
                    // Not contribute monthly
                    else{
                        return 320;
                    }
                }
                else if(profile.getTimePeriod() == 3){
                    // Contribute monthly
                    if(profile.isContributeMonthly()){
                        return 331;
                    }
                    // Not contribute monthly
                    else{
                        return 330;
                    }
                }

            }
        return 0;
    }


    }


