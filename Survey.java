// Java program to illustrate the CardLayout Class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


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
    JPanel portfolioCard;

    Profile profile;

    public Survey() {

        // Function to set size of JFrame.
        setTitle("Survey");
        setSize(new Dimension(500, 400));
        setLocationRelativeTo(null);



        // Function to set visibility of JFrame.
        setVisible(true);

        // Function to set default operation of JFrame.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Function to set size of JFrame.
        setTitle("Survey");
        setSize(new Dimension(400, 400));
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
        incomePanel.setPreferredSize(new Dimension(400, 400));
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


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == intro.next) {
            profile.setUsername(User.getName());

            System.out.println(User.getName());


            if(profile.checkProfile()){
                // TODO: GET INFO FROM DATABASE OF THE PROFILE GIVEN THE USERNAME
                profile.setRisk(profile.getRiskFromDB());
                profile.setContributeMonthly(profile.getContributeMonthFromDB());
                profile.setTimePeriod(profile.getTimePeriodFromDB());
                int portfolio = DeterminePortfolio(profile);

                System.out.println(portfolio);

                switch (portfolio) {
                    case 111:
                        portfolioCard = Portfolios.createPortfolio111Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;

                    case 110:
                        portfolioCard = Portfolios.createPortfolio110Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 121:
                        portfolioCard = Portfolios.createPortfolio121Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 120:
                        portfolioCard = Portfolios.createPortfolio120Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 131:
                        portfolioCard = Portfolios.createPortfolio131Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 130:
                        portfolioCard = Portfolios.createPortfolio130Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 211:
                        portfolioCard = Portfolios.createPortfolio211Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 210:
                        portfolioCard = Portfolios.createPortfolio210Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 221:
                        portfolioCard = Portfolios.createPortfolio221Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 220:
                        portfolioCard = Portfolios.createPortfolio220Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 231:
                        portfolioCard = Portfolios.createPortfolio231Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 230:
                        portfolioCard = Portfolios.createPortfolio230Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 311:
                        portfolioCard = Portfolios.createPortfolio311Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 310:
                        portfolioCard = Portfolios.createPortfolio310Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 321:
                        portfolioCard = Portfolios.createPortfolio321Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 320:
                        portfolioCard = Portfolios.createPortfolio320Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 331:
                        portfolioCard = Portfolios.createPortfolio331Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    case 330:
                        portfolioCard = Portfolios.createPortfolio330Panel();
                        c.add(portfolioCard, "portfolio");
                        card.show(c, "portfolio");
                        break;
                    default:
                        Portfolios.createDefaultPortfolioPanel();
                        break;

                }

            }
            else {
                card.show(c, "income");
            }

        } else if (e.getSource() == incomePanel.next) {
            profile.setIncome(Integer.valueOf(incomePanel.incomeTextField.getText()));
            card.show(c, "risk");

        } else if (e.getSource() == riskPanel.nextButton) {
            if (riskPanel.lowRiskLevel.isSelected()) {
                profile.setRisk(1);
            } else if (riskPanel.mediumRiskLevel.isSelected()) {
                profile.setRisk(2);
            } else if (riskPanel.highRiskLevel.isSelected()) {
                profile.setRisk(3);
            }
            card.show(c, "contributions");
        } else if (e.getSource() == yesNoContributions.next) {
            if (yesNoContributions.yesButton.isSelected()) {
                profile.setContributeMonthly(true);

                System.out.println(profile.getMonthlyAmount());

                card.show(c, "amount");
            } else if (yesNoContributions.noButton.isSelected()) {
                profile.setContributeMonthly(false);
                card.show(c, "timePeriod");
            }
        } else if (e.getSource() == contributionAmount.next) {
            profile.setMonthlyAmount(Integer.valueOf(contributionAmount.contributionAmount.getText()));
            card.show(c, "timePeriod");
        }

        // call the next card
        else if (e.getSource() == timePeriod.next) {
            if (timePeriod.OnetoTwoYear.isSelected()) {
                profile.setTimePeriod(1);
            }
            if (timePeriod.TwotoFiveYear.isSelected()) {
                profile.setTimePeriod(2);
            }
            if (timePeriod.FivetoTen.isSelected()) {
                profile.setTimePeriod(3);
            }
            profile.uploadProfile();
            int portfolio = DeterminePortfolio(profile);
            switch (portfolio) {
                case 111:
                    portfolioCard = Portfolios.createPortfolio111Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");

                case 110:
                    portfolioCard = Portfolios.createPortfolio110Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 121:
                    portfolioCard = Portfolios.createPortfolio121Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 120:
                    portfolioCard = Portfolios.createPortfolio120Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 131:
                    portfolioCard = Portfolios.createPortfolio131Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 130:
                    portfolioCard = Portfolios.createPortfolio130Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 211:
                    portfolioCard = Portfolios.createPortfolio211Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 210:
                    portfolioCard = Portfolios.createPortfolio210Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 221:
                    portfolioCard = Portfolios.createPortfolio221Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 220:
                    portfolioCard = Portfolios.createPortfolio220Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 231:
                    portfolioCard = Portfolios.createPortfolio231Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 230:
                    portfolioCard = Portfolios.createPortfolio230Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 311:
                    portfolioCard = Portfolios.createPortfolio311Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 310:
                    portfolioCard = Portfolios.createPortfolio310Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 321:
                    portfolioCard = Portfolios.createPortfolio321Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 320:
                    portfolioCard = Portfolios.createPortfolio320Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 331:
                    portfolioCard = Portfolios.createPortfolio331Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                case 330:
                    portfolioCard = Portfolios.createPortfolio330Panel();
                    c.add(portfolioCard, "portfolio");
                    card.show(c, "portfolio");
                default:
                    Portfolios.createDefaultPortfolioPanel();

            }

        }


    }

    public static int DeterminePortfolio(Profile profile) {

        // Low risk
        if (profile.getRisk() == 1) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 111;
                }
                // Not contribute monthly
                else {
                    return 110;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 121;
                }
                // Not contribute monthly
                else {
                    return 120;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 131;
                }
                // Not contribute monthly
                else {
                    return 130;
                }
            }
        }

        // Medium Risk
        else if (profile.getRisk() == 2) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 211;
                }
                // Not contribute monthly
                else {
                    return 210;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 221;
                }
                // Not contribute monthly
                else {
                    return 220;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 231;
                }
                // Not contribute monthly
                else {
                    return 230;
                }
            }


        }
        // High Risk
        else if (profile.getRisk() == 3) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 311;
                }
                // Not contribute monthly
                else {
                    return 310;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 321;
                }
                // Not contribute monthly
                else {
                    return 320;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 331;
                }
                // Not contribute monthly
                else {
                    return 330;
                }
            }

        }
        return 0;
    }

    public static int DeterminePortfolio(Profile profile) {

        // Low risk
        if (profile.getRisk() == 1) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 111;
                }
                // Not contribute monthly
                else {
                    return 110;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 121;
                }
                // Not contribute monthly
                else {
                    return 120;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 131;
                }
                // Not contribute monthly
                else {
                    return 130;
                }
            }
        }

        // Medium Risk
        else if (profile.getRisk() == 2) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 211;
                }
                // Not contribute monthly
                else {
                    return 210;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 221;
                }
                // Not contribute monthly
                else {
                    return 220;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 231;
                }
                // Not contribute monthly
                else {
                    return 230;
                }
            }

        }
        // High Risk
        else if (profile.getRisk() == 3) {
            if (profile.getTimePeriod() == 1) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 311;
                }
                // Not contribute monthly
                else {
                    return 310;
                }
            } else if (profile.getTimePeriod() == 2) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 321;
                }
                // Not contribute monthly
                else {
                    return 320;
                }
            } else if (profile.getTimePeriod() == 3) {
                // Contribute monthly
                if (profile.isContributeMonthly()) {
                    return 331;
                }
                // Not contribute monthly
                else {
                    return 330;
                }
            }

        }
        return 0;
    }


}



}



