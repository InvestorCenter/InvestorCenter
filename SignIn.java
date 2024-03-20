import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignIn extends JFrame implements ActionListener {
    private JLabel titleLabel, usernameLabel, passwordLabel, titlePromptLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;
    private JButton createAccount;

    public SignIn() {
        setTitle("Investor Center");
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //sign in 
        titleLabel = new JLabel("Sign in");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 10, 100, 30);

        titlePromptLabel = new JLabel("Click 'enter' to enter input");
        titlePromptLabel.setFont(new Font("Arial", Font.PLAIN ,10));
        titlePromptLabel.setBounds(235, 30, 125, 50);

        //username and password indicators
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(125, 90, 80, 30);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(125, 130, 80, 30);

        //username text field
        usernameField = new JTextField();
        usernameField.setBounds(200,90, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black));
        usernameField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                
                System.out.println(username);
            }
        });


        //password text field
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 130, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black));
        passwordField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                
                System.out.println(password);
            }
        });

        //sign in button
        signUpButton = new JButton("Sign in");
        signUpButton.setBounds(235, 200, 100, 30);

        //create account option if user doesnt have account
        createAccount = new JButton ("CREATE ACCOUNT");
        createAccount.setBounds(215, 240, 150, 30);
        createAccount.addActionListener(this);
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open SignUp window when "CREATE ACCOUNT" button is clicked
                SignUp signUp = new SignUp();
                signUp.signUpMethod();
                setVisible(false);
            }
        });

        add(titleLabel);
        add(titlePromptLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(signUpButton);
        add(createAccount);


        pack();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}