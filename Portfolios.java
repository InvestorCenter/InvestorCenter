import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Portfolios {



    public static JPanel getPortfolioPanel(String portfolioCode) {
        return switch (portfolioCode) {
            case "111" -> createPortfolio111Panel();
            case "110" -> createPortfolio110Panel();
            case "121" -> createPortfolio121Panel();
            case "120" -> createPortfolio120Panel();
            case "131" -> createPortfolio131Panel();
            case "130" -> createPortfolio130Panel();
            case "211" -> createPortfolio211Panel();
            case "210" -> createPortfolio210Panel();
            case "221" -> createPortfolio221Panel();
            case "220" -> createPortfolio220Panel();
            case "231" -> createPortfolio231Panel();
            case "230" -> createPortfolio230Panel();
            case "311" -> createPortfolio311Panel();
            case "310" -> createPortfolio310Panel();
            case "321" -> createPortfolio321Panel();
            case "320" -> createPortfolio320Panel();
            case "331" -> createPortfolio331Panel();
            case "330" -> createPortfolio330Panel();
            default -> createDefaultPortfolioPanel();
        };
    }
    // (RISK)(TIME)(CONTRIBUTE)
    static JPanel createPortfolio111Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Random random = new Random();


        // Generate a random number between 0 and 1
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Growth Port - F");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
            // 8% yearly return

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            JLabel descriptionLabel = new JLabel("The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));
            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(10);

        }
        if (option == 1){

            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - F");


            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 5% yearly return

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            JLabel descriptionLabel = new JLabel("The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);

        }


        return panel;
    }

    static JPanel createPortfolio110Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {

            JLabel titleLabel = new JLabel("Betterment Cash Management Account");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 5% interest

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Betterment Savings is a high-yield cash account provided by Betterment, a leading online financial advisor. It offers a competitive interest rate on savings, FDIC insurance coverage, and easy accessibility, providing a simple yet effective way for individuals to grow their savings while maintaining liquidity.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);
        }
        if (option == 1){

            JLabel titleLabel = new JLabel("EquityMultiple");

            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 8%

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            
            String description = "EquityMultiple is an online real estate investment platform that allows investors to participate in a variety of commercial real estate deals. By pooling funds with other investors, EquityMultiple provides opportunities to invest in properties that may otherwise be inaccessible, offering potential returns through rental income and property appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);


        }

        return panel;
    }

    static JPanel createPortfolio121Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Growth Port - A ");

            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 7%

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "TD Advantage Balanced Growth Portfolio (Series A) is a diversified investment fund managed by TD Asset Management, aiming for long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It seeks to provide investors with a balanced approach to capital appreciation while managing risk through a strategic allocation strategy.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);

            

        }
        if (option == 1){

            JLabel titleLabel = new JLabel("TD Advantage Balanced Growth Port - I");

            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 9%

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);
        }

        return panel;
    }

    static JPanel createPortfolio120Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);
// risk time contribute
        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Q International Low Volatility ETF (TILV)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            // 8%
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "TD Q International Low Volatility ETF seeks to achieve long-term capital growth by investing directly in, or obtaining exposure to, a diversified portfolio of international stocks, including companies domiciled in the developed countries of Europe, Australasia, and the Far East, while seeking to reduce volatility.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(8);


            

        }
        if (option == 1){

            JLabel titleLabel = new JLabel("TD Growth ETF Portfolio (TRGO)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "TD Growth ETF Portfolio seeks to generate long-term capital growth with the added potential for earning a modest level of income. The TD ETF invests primarily in units of other exchange-traded funds, emphasizing exchange-traded funds with greater potential for capital growth.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(20);


        }
        return panel;
    }

    static JPanel createPortfolio131Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - I (TDB885)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The TD Advantage Balanced Income Portfolio is a diversified investment fund managed by TD Asset Management, primarily targeting income generation while aiming for capital preservation. It typically invests in a mix of fixed income securities, dividend-paying stocks, and other income-generating assets to provide investors with regular income distributions and potential capital appreciation over the long term.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(7);


        }
        if (option == 1){

            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - A");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The TD Advantage Balanced Income Portfolio (Series A) is a diversified investment fund managed by TD Asset Management, focusing on generating income while aiming to preserve capital. It typically invests in a mix of fixed income securities and dividend-paying stocks, providing investors with regular income distributions and potential for moderate capital appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(7);


        }

        return panel;
    }

    static JPanel createPortfolio130Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("SPXL");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The Direxion Daily S&P 500 Bull 3X Shares (SPXL) is an exchange-traded fund (ETF) that seeks to provide investors with triple the daily performance of the S&P 500 Index. This leveraged ETF is designed for short-term trading strategies and aims to amplify returns when the S&P 500 Index rises, but it also magnifies losses when the index declines.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(14);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("SPXS");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The Direxion Daily S&P 500 Bear 3X Shares (SPXS) is an exchange-traded fund (ETF) designed to provide investors with triple the inverse (opposite) daily performance of the S&P 500 Index. This leveraged ETF is intended for short-term trading strategies and seeks to profit from declines in the S&P 500 Index. ";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(17);


            

        }
        return panel;
    }


    /*------------------- low risk (above)---------------------------------------*/


    static JPanel createPortfolio211Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Visa inc (V) ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Visa is a global payments technology company that facilitates electronic funds transfers throughout the world. As one of the largest payment processors, Visa operates a network that enables consumers, businesses, and governments to make secure, convenient, and reliable digital transactions using credit, debit, and prepaid cards.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(18);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Apple (AAPL) ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Apple is a multinational technology company known for its iconic hardware products, software platforms, and digital services. Renowned for innovations such as the iPhone, iPad, Mac, and Apple Watch, as well as services like iCloud, the App Store, and Apple Music, Apple has established itself as a leader in consumer electronics, software, and digital content distribution.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(8);


        }

        return panel;
    }

    static JPanel createPortfolio210Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("American Express National Bank (Member FDIC)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "American Express National Bank offers a savings account option, providing customers with a secure way to save money while earning competitive interest rates. As a member of the Federal Deposit Insurance Corporation (FDIC), deposits held in American Express National Bank savings accounts are insured up to the maximum allowable limit, offering customers peace of mind and financial security";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(9);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Jenius Bank Jenius Savings Account");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "With Jenius Savings Account, customers can easily open and manage their savings online, track their expenses, set savings goals, and earn interest on their deposits. Jenius emphasizes convenience and transparency, allowing customers to have greater control over their finances through its user-friendly mobile app.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(5);


        }

        return panel;
    }

    static JPanel createPortfolio221Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Amazon (AMZN)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "As one of the largest and most well-known companies in the world, Amazon's stock is widely followed by investors. The stock has historically been characterized by strong growth potential driven by the company's dominance in e-commerce, cloud computing through Amazon Web Services (AWS), and expansion into various other industries. However, like all stocks, the value of Amazon's stock can fluctuate based on various factors, including market conditions, company performance, and broader economic trends.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(40);



        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("IShares NASDAQ 100 Index ETF");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            
            String description = "The iShares NASDAQ 100 Index ETF is an exchange-traded fund designed to mirror the performance of the NASDAQ-100 Index, which consists of the largest non-financial companies listed on the NASDAQ stock exchange. This ETF provides investors with diversified exposure to leading technology, consumer discretionary, healthcare, and communication services companies, making it a popular choice for those seeking to invest in high-growth sectors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(6);



        }

        return panel;
    }

    static JPanel createPortfolio220Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("UFB Direct Savings Accounts");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "As an online bank, UFB Direct allows customers to easily manage their accounts through digital platforms, offering features such as online banking and mobile apps for convenient access. Additionally, UFB Direct savings accounts may come with benefits like FDIC insurance coverage to ensure the safety of deposited funds up to the maximum allowable limit.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(5);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Capital One 360 Performance Savings");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "This savings account provides customers with a competitive interest rate to help their savings grow faster, along with features such as no monthly fees and no minimum balance requirements. With convenient online and mobile banking access, Capital One 360 Performance Savings offers flexibility and ease of management for savers seeking to maximize their earnings.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(5);


        }

        return panel;
    }

    static JPanel createPortfolio231Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Vanguard S&P 500 Index ETF");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The Vanguard S&P 500 Index ETF is an exchange-traded fund designed to track the performance of the S&P 500 Index, which includes 500 of the largest publicly traded companies in the United States. This ETF provides investors with diversified exposure to the U.S. stock market, offering a low-cost and efficient way to invest in a broad range of companies across various sectors. With its passive investment approach and low expense ratio, the Vanguard S&P 500 Index ETF is a popular choice for investors seeking to replicate the performance of the overall U.S. stock market.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(9);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Invesco QQQ trust");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The Invesco QQQ Trust is an ETF tracking the NASDAQ-100 Index, featuring 100 top non-financial companies listed on NASDAQ, providing diversified exposure to technology, consumer, healthcare, and communication sectors. It offers investors a convenient avenue to invest in high-growth stocks, particularly those seeking exposure to leading tech and growth-oriented companies.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(10);



        }

        return panel;
    }

    static JPanel createPortfolio230Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("CloudBank 24/7 Savings Accounts");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "CloudBank 24/7 offers high-yield savings accounts, providing customers with competitive interest rates and convenient online access. With features like 24/7 account management and FDIC insurance coverage, CloudBank ensures security and flexibility for savers aiming to grow their funds.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(6);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("SoFi Bank Savings Accounts ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "SoFi Bank offers savings accounts with competitive interest rates and no account fees, providing customers with a convenient way to grow their savings. With features such as mobile banking and ATM fee reimbursements, SoFi Bank aims to provide a user-friendly and flexible banking experience for its customers.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(5);

        }

        return panel;
    }


    /*------------------- med risk (above)---------------------------------------*/


    static JPanel createPortfolio311Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Nice Ltd (NICE) ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Nice Ltd is a multinational software company specializing in providing solutions for customer experience management, compliance, and workforce optimization. With a focus on analytics and artificial intelligence, Nice offers products and services that help organizations improve customer interactions, ensure regulatory compliance, and enhance operational efficiency.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(9);



        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("ClearPoint Neuro Inc (CLPT)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "ClearPoint Neuro Inc. is a medical technology company specializing in neurosurgery solutions, particularly for brain-related procedures. Their flagship product, the ClearPoint System, enables surgeons to perform minimally invasive brain surgeries with precision and accuracy, enhancing patient outcomes and reducing risks. ClearPoint Neuro aims to advance neurosurgery through innovative technologies that improve the quality of care for patients with neurological disorders.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(9);



        }

        return panel;
    }

    static JPanel createPortfolio310Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("SoFi Bank Savings Accounts ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "SoFi Bank offers savings accounts with competitive interest rates and no account fees, providing customers with a convenient way to grow their savings. With features such as mobile banking and ATM fee reimbursements, SoFi Bank aims to provide a user-friendly and flexible banking experience for its customers.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(5);


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("HDFC Dynamic PE Ratio FoF Direct Growth ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The HDFC Dynamic PE Ratio FoF Direct Growth is a mutual fund offered by HDFC Mutual Fund. This fund dynamically manages its portfolio based on the Price-to-Earnings (PE) ratio of the market, aiming to capitalize on opportunities arising from fluctuations in valuations. By investing in a diversified portfolio of equities, the fund seeks to generate long-term capital appreciation for investors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(16);


        }

        return panel;
    }

    static JPanel createPortfolio321Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Meta platforms Inc (META)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Meta Platforms (formerly known as Facebook, Inc.) is a multinational technology company known for its social media platforms, including Facebook, Instagram, WhatsApp, and Messenger. Meta Platforms enables people to connect, share, and communicate with each other globally through its various services. Additionally, Meta is involved in virtual reality and augmented reality technologies, aiming to redefine digital experiences and connectivity in the future.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(12);
        }



        if (option == 1) {

            JLabel titleLabel = new JLabel("Bank of Hawaii Corp (BOH)   ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Bank of Hawaii Corp is a reputable regional bank headquartered in Honolulu, Hawaii, offering a comprehensive suite of banking services, including personal and business banking, wealth management, and mortgage lending. Renowned for its customer-centric approach and commitment to community involvement, Bank of Hawaii Corp is a trusted financial institution in the Hawaiian islands.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(9);



        }

        return panel;
    }

    static JPanel createPortfolio320Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("ICICI Prudential Asset Allocator Fund (FOF) Direct Growth  ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The ICICI Prudential Asset Allocator Fund (FOF) Direct Growth is a mutual fund offered by ICICI Prudential Mutual Fund. This fund dynamically allocates its investments across various asset classes such as equity, debt, and other instruments based on market conditions and the fund manager's outlook. By aiming to optimize returns while managing risks, the fund seeks to provide investors with long-term capital appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(19);
        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("HDFC Gold Direct Plan Growth");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The HDFC Gold Direct Plan Growth is a mutual fund scheme offered by HDFC Mutual Fund that primarily invests in gold and gold-related instruments. This investment avenue allows investors to participate in the potential appreciation of gold prices without the need for physical possession. The growth option of this plan aims to generate capital appreciation over the long term by investing in gold-related assets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(15);
        }

        return panel;
    }

    static JPanel createPortfolio331Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("NVIDA Corporation (NVDA)");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "NVIDIA Corporation is a leading multinational technology company known for its graphics processing units (GPUs) and semiconductor products. NVDA is at the forefront of innovation in artificial intelligence, gaming, data centers, and autonomous vehicles, offering cutting-edge solutions that power various industries worldwide.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(20);
        }



        if (option == 1) {

            JLabel titleLabel = new JLabel("Tesla (TSLA)  ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Tesla, Inc. is a renowned electric vehicle (EV) manufacturer led by CEO Elon Musk. Known for its innovative approach to sustainable transportation, Tesla produces electric cars, battery energy storage solutions, and solar energy products. With a mission to accelerate the world's transition to sustainable energy, Tesla has become a key player in the automotive industry and renewable energy sector.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(18);


        }

        return panel;
    }

    static JPanel createPortfolio330Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("Sundaram Equity Hybrid Fund Direct Growth");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Sundaram Equity Hybrid Fund Direct Growth is a mutual fund scheme offered by Sundaram Mutual Fund. This fund follows a hybrid investment strategy by investing in a mix of equity and debt instruments, aiming to achieve capital appreciation along with income generation. The direct growth option of this fund allows investors to participate in the potential growth of both equity and debt markets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(22);
        }



        if (option == 1) {

            JLabel titleLabel = new JLabel("SBI Gold Direct Plan Growth ");
            titleLabel.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));

            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The SBI Gold Direct Plan Growth is a mutual fund scheme offered by SBI Mutual Fund that primarily invests in gold and gold-related instruments. This investment avenue allows investors to participate in the potential appreciation of gold prices without the need for physical possession. The growth option of this plan aims to generate capital appreciation over the long term by investing in gold-related assets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>"+ description +"</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            descriptionLabel.setBorder(BorderFactory.createEmptyBorder(0,10,0,10));

            panel.add(descriptionLabel, BorderLayout.CENTER);

            createGraph(15);

        }

        return panel;
    }



    /*------------------- high risk (above)---------------------------------------*/

    static JPanel createDefaultPortfolioPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Default Panel");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        panel.add(titleLabel, BorderLayout.NORTH);
        return panel;
    }

    private static void createGraph(float interestRate){
        int contribution = Auth.getUserMonthlyAmount(User.getName());
        int initalInvestment = Auth.getUserIncome(User.getName());
        int length = getTimePeriod();

       
        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interest gInterest = new Interest(initalInvestment,contribution, length, interestRate); // 5 grand for 10 years at 6% interest
        double[] data = gInterest.getDataSet();
        double[] interest = gInterest.calculateInterest();
        Graph graph = new Graph(data,interest);
        frame.add(graph);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }


    private static int getTimePeriod() {
        int timeNumber = Auth.getUserTimePeriod(User.getName());
        if (timeNumber == 1) {
            return 2;
        } else if (timeNumber == 2) {
            return 5;
        } else {
            return 10;
        }
    }
}
