import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Portfolios {
    // TODO: PUT MORE INFO ON THE STOCKS SUCH AS POTENTIAL RETURN, RISK
    //TODO: ADDED A NEW CREATEGRAPH METHOD WHICH TAKES IN A YEARLY INTEREST RATE. USE THIS INSTEAD OF FIXED RATES
    // TODO: ADD a Link to each stock??
    // TODO: create more specifc names for the stocks
    // (RISK)(TIME)(CONTRIBUTE)
    static JPanel createPortfolio111Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Random random = new Random();


        // Generate a random number between 0 and 1
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Growth Port - F");
            // 8% yearly return
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            JLabel descriptionLabel = new JLabel("The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(8);


        }
        if (option == 1) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - F");
            // 5% yearly return
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            JLabel descriptionLabel = new JLabel("The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(5);

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
            // 5% interest
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "Betterment Savings is a high-yield cash account provided by Betterment, a leading online financial advisor. It offers a competitive interest rate on savings, FDIC insurance coverage, and easy accessibility, providing a simple yet effective way for individuals to grow their savings while maintaining liquidity.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(5);

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("EquityMultiple");
            // 8%
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "EquityMultiple is an online real estate investment platform that allows investors to participate in a variety of commercial real estate deals. By pooling funds with other investors, EquityMultiple provides opportunities to invest in properties that may otherwise be inaccessible, offering potential returns through rental income and property appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(8);


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
            // 7%
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "TD Advantage Balanced Growth Portfolio (Series A) is a diversified investment fund managed by TD Asset Management, aiming for long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It seeks to provide investors with a balanced approach to capital appreciation while managing risk through a strategic allocation strategy.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(7);


        }
        if (option == 1) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Growth Port - I");
            // 9%
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The TD Advantage Balanced Growth Portfolio is a diversified investment fund managed by TD Asset Management, designed to pursue long-term growth by investing in a mix of equities, fixed income securities, and alternative investments. It aims to strike a balance between growth potential and risk management to achieve optimal returns for investors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraph(9);

        }

        return panel;
    }

    static JPanel createPortfolio120Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("VanGuard  ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "Vanguard is a renowned investment management company known for its low-cost index funds and exchange-traded funds (ETFs). With a focus on investor ownership and long-term growth, Vanguard offers a wide range of investment options tailored to various risk tolerances and financial goals.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("S&P 500 ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The S&P 500 is a stock market index that measures the performance of 500 large companies listed on stock exchanges in the United States. It is widely regarded as one of the best indicators of the U.S. stock market's health and is commonly used as a benchmark for the overall performance of the U.S. economy.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();


        }
        return panel;
    }

    static JPanel createPortfolio131Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Random random = new Random();
        int option = random.nextInt(2);

        if (option == 0) {
            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - I");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The TD Advantage Balanced Income Portfolio is a diversified investment fund managed by TD Asset Management, primarily targeting income generation while aiming for capital preservation. It typically invests in a mix of fixed income securities, dividend-paying stocks, and other income-generating assets to provide investors with regular income distributions and potential capital appreciation over the long term.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("TD Advantage Balanced Income Port - A");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The TD Advantage Balanced Income Portfolio (Series A) is a diversified investment fund managed by TD Asset Management, focusing on generating income while aiming to preserve capital. It typically invests in a mix of fixed income securities and dividend-paying stocks, providing investors with regular income distributions and potential for moderate capital appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The Direxion Daily S&P 500 Bull 3X Shares (SPXL) is an exchange-traded fund (ETF) that seeks to provide investors with triple the daily performance of the S&P 500 Index. This leveraged ETF is designed for short-term trading strategies and aims to amplify returns when the S&P 500 Index rises, but it also magnifies losses when the index declines.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("SPXS");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The Direxion Daily S&P 500 Bear 3X Shares (SPXS) is an exchange-traded fund (ETF) designed to provide investors with triple the inverse (opposite) daily performance of the S&P 500 Index. This leveraged ETF is intended for short-term trading strategies and seeks to profit from declines in the S&P 500 Index. ";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphLow();


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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "Visa is a global payments technology company that facilitates electronic funds transfers throughout the world. As one of the largest payment processors, Visa operates a network that enables consumers, businesses, and governments to make secure, convenient, and reliable digital transactions using credit, debit, and prepaid cards.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Apple (AAPL) ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "Apple is a multinational technology company known for its iconic hardware products, software platforms, and digital services. Renowned for innovations such as the iPhone, iPad, Mac, and Apple Watch, as well as services like iCloud, the App Store, and Apple Music, Apple has established itself as a leader in consumer electronics, software, and digital content distribution.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "American Express National Bank offers a savings account option, providing customers with a secure way to save money while earning competitive interest rates. As a member of the Federal Deposit Insurance Corporation (FDIC), deposits held in American Express National Bank savings accounts are insured up to the maximum allowable limit, offering customers peace of mind and financial security";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Jenius Bank Jenius Savings Account");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "With Jenius Savings Account, customers can easily open and manage their savings online, track their expenses, set savings goals, and earn interest on their deposits. Jenius emphasizes convenience and transparency, allowing customers to have greater control over their finances through its user-friendly mobile app.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "As one of the largest and most well-known companies in the world, Amazon's stock is widely followed by investors. The stock has historically been characterized by strong growth potential driven by the company's dominance in e-commerce, cloud computing through Amazon Web Services (AWS), and expansion into various other industries. However, like all stocks, the value of Amazon's stock can fluctuate based on various factors, including market conditions, company performance, and broader economic trends.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("IShares NASDAQ 100 Index ETF");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The iShares NASDAQ 100 Index ETF is an exchange-traded fund designed to mirror the performance of the NASDAQ-100 Index, which consists of the largest non-financial companies listed on the NASDAQ stock exchange. This ETF provides investors with diversified exposure to leading technology, consumer discretionary, healthcare, and communication services companies, making it a popular choice for those seeking to invest in high-growth sectors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();


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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "As an online bank, UFB Direct allows customers to easily manage their accounts through digital platforms, offering features such as online banking and mobile apps for convenient access. Additionally, UFB Direct savings accounts may come with benefits like FDIC insurance coverage to ensure the safety of deposited funds up to the maximum allowable limit.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Capital One 360 Performance Savings");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "This savings account provides customers with a competitive interest rate to help their savings grow faster, along with features such as no monthly fees and no minimum balance requirements. With convenient online and mobile banking access, Capital One 360 Performance Savings offers flexibility and ease of management for savers seeking to maximize their earnings.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The Vanguard S&P 500 Index ETF is an exchange-traded fund designed to track the performance of the S&P 500 Index, which includes 500 of the largest publicly traded companies in the United States. This ETF provides investors with diversified exposure to the U.S. stock market, offering a low-cost and efficient way to invest in a broad range of companies across various sectors. With its passive investment approach and low expense ratio, the Vanguard S&P 500 Index ETF is a popular choice for investors seeking to replicate the performance of the overall U.S. stock market.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("Invesco QQQ trust");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The Invesco QQQ Trust is an ETF tracking the NASDAQ-100 Index, featuring 100 top non-financial companies listed on NASDAQ, providing diversified exposure to technology, consumer, healthcare, and communication sectors. It offers investors a convenient avenue to invest in high-growth stocks, particularly those seeking exposure to leading tech and growth-oriented companies.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "CloudBank 24/7 offers high-yield savings accounts, providing customers with competitive interest rates and convenient online access. With features like 24/7 account management and FDIC insurance coverage, CloudBank ensures security and flexibility for savers aiming to grow their funds.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("SoFi Bank Savings Accounts ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "SoFi Bank offers savings accounts with competitive interest rates and no account fees, providing customers with a convenient way to grow their savings. With features such as mobile banking and ATM fee reimbursements, SoFi Bank aims to provide a user-friendly and flexible banking experience for its customers.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphMed();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "Nice Ltd is a multinational software company specializing in providing solutions for customer experience management, compliance, and workforce optimization. With a focus on analytics and artificial intelligence, Nice offers products and services that help organizations improve customer interactions, ensure regulatory compliance, and enhance operational efficiency.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("ClearPoint Neuro Inc (CLPT)");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "ClearPoint Neuro Inc. is a medical technology company specializing in neurosurgery solutions, particularly for brain-related procedures. Their flagship product, the ClearPoint System, enables surgeons to perform minimally invasive brain surgeries with precision and accuracy, enhancing patient outcomes and reducing risks. ClearPoint Neuro aims to advance neurosurgery through innovative technologies that improve the quality of care for patients with neurological disorders.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();


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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "SoFi Bank offers savings accounts with competitive interest rates and no account fees, providing customers with a convenient way to grow their savings. With features such as mobile banking and ATM fee reimbursements, SoFi Bank aims to provide a user-friendly and flexible banking experience for its customers.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();

        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("HDFC Dynamic PE Ratio FoF Direct Growth ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The HDFC Dynamic PE Ratio FoF Direct Growth is a mutual fund offered by HDFC Mutual Fund. This fund dynamically manages its portfolio based on the Price-to-Earnings (PE) ratio of the market, aiming to capitalize on opportunities arising from fluctuations in valuations. By investing in a diversified portfolio of equities, the fund seeks to generate long-term capital appreciation for investors.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Meta Platforms (formerly known as Facebook, Inc.) is a multinational technology company known for its social media platforms, including Facebook, Instagram, WhatsApp, and Messenger. Meta Platforms enables people to connect, share, and communicate with each other globally through its various services. Additionally, Meta is involved in virtual reality and augmented reality technologies, aiming to redefine digital experiences and connectivity in the future.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();
        }

        if (option == 1) {

            JLabel titleLabel = new JLabel("Bank of Hawaii Corp (BOH)   ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Bank of Hawaii Corp is a reputable regional bank headquartered in Honolulu, Hawaii, offering a comprehensive suite of banking services, including personal and business banking, wealth management, and mortgage lending. Renowned for its customer-centric approach and commitment to community involvement, Bank of Hawaii Corp is a trusted financial institution in the Hawaiian islands.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();


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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The ICICI Prudential Asset Allocator Fund (FOF) Direct Growth is a mutual fund offered by ICICI Prudential Mutual Fund. This fund dynamically allocates its investments across various asset classes such as equity, debt, and other instruments based on market conditions and the fund manager's outlook. By aiming to optimize returns while managing risks, the fund seeks to provide investors with long-term capital appreciation.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();


        }
        if (option == 1) {

            JLabel titleLabel = new JLabel("HDFC Gold Direct Plan Growth");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);
            String description = "The HDFC Gold Direct Plan Growth is a mutual fund scheme offered by HDFC Mutual Fund that primarily invests in gold and gold-related instruments. This investment avenue allows investors to participate in the potential appreciation of gold prices without the need for physical possession. The growth option of this plan aims to generate capital appreciation over the long term by investing in gold-related assets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();
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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);


            String description = "NVIDIA Corporation is a leading multinational technology company known for its graphics processing units (GPUs) and semiconductor products. NVDA is at the forefront of innovation in artificial intelligence, gaming, data centers, and autonomous vehicles, offering cutting-edge solutions that power various industries worldwide.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();
        }

        if (option == 1) {

            JLabel titleLabel = new JLabel("Tesla (TSLA)  ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Tesla, Inc. is a renowned electric vehicle (EV) manufacturer led by CEO Elon Musk. Known for its innovative approach to sustainable transportation, Tesla produces electric cars, battery energy storage solutions, and solar energy products. With a mission to accelerate the world's transition to sustainable energy, Tesla has become a key player in the automotive industry and renewable energy sector.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();

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
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "Sundaram Equity Hybrid Fund Direct Growth is a mutual fund scheme offered by Sundaram Mutual Fund. This fund follows a hybrid investment strategy by investing in a mix of equity and debt instruments, aiming to achieve capital appreciation along with income generation. The direct growth option of this fund allows investors to participate in the potential growth of both equity and debt markets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();
        }

        if (option == 1) {

            JLabel titleLabel = new JLabel("SBI Gold Direct Plan Growth ");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(titleLabel, BorderLayout.NORTH);

            String description = "The SBI Gold Direct Plan Growth is a mutual fund scheme offered by SBI Mutual Fund that primarily invests in gold and gold-related instruments. This investment avenue allows investors to participate in the potential appreciation of gold prices without the need for physical possession. The growth option of this plan aims to generate capital appreciation over the long term by investing in gold-related assets.";
            JLabel descriptionLabel = new JLabel();
            descriptionLabel.setText("<html>" + description + "</html>");
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            descriptionLabel.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(descriptionLabel, BorderLayout.CENTER);
            createGraphHigh();
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
        createGraphMed();
        return panel;
    }

    // HIGH RISK: 13%
    private static void createGraphHigh() {
        System.out.println(Auth.getUserMonthlyAmount(User.getName()));
        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interest gInterest = new Interest(Auth.getUserIncome(User.getName()), Auth.getUserContributeMonthly(User.getName()), getTimePeriod(), 13); // 5 grand for 10 years at 13% interest
        double[] data = gInterest.getDataSet();
        double[] interest = gInterest.calculateInterest();
        Graph graph = new Graph(data, interest);
        frame.add(graph);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    // MEDIUM RISK: 9%
    private static void createGraphMed() {
        System.out.println(Auth.getUserMonthlyAmount(User.getName()));
        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interest gInterest = new Interest(Auth.getUserIncome(User.getName()), Auth.getUserContributeMonthly(User.getName()), getTimePeriod(), 9); // 5 grand for 10 years at 9% interest
        double[] data = gInterest.getDataSet();
        double[] interest = gInterest.calculateInterest();
        Graph graph = new Graph(data, interest);
        frame.add(graph);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    // LOW RISK: 5%
    private static void createGraphLow() {
        System.out.println(Auth.getUserMonthlyAmount(User.getName()));
        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interest gInterest = new Interest(Auth.getUserIncome(User.getName()), Auth.getUserContributeMonthly(User.getName()), getTimePeriod(), 5);

        double[] data = gInterest.getDataSet();
        double[] interest = gInterest.calculateInterest();
        Graph graph = new Graph(data, interest);
        frame.add(graph);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    private static void createGraph(int yearlyInterest) {
        System.out.println(Auth.getUserMonthlyAmount(User.getName()));
        JFrame frame = new JFrame("Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interest gInterest = new Interest(Auth.getUserIncome(User.getName()), Auth.getUserContributeMonthly(User.getName()), getTimePeriod(), yearlyInterest);

        double[] data = gInterest.getDataSet();
        double[] interest = gInterest.calculateInterest();
        Graph graph = new Graph(data, interest);
        frame.add(graph);
        frame.setSize(800, 500);
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