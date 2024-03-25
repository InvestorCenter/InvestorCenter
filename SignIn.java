import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class SignIn extends JFrame {
    private JLabel titleLabel, usernameLabel, passwordLabel, invalidLabel, logoLabel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signInButton;
    private JButton createAccount;
    private static Auth authorization = new Auth();

    public SignIn() {
        setTitle("Investor Center");
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sign in title
        titleLabel = new JLabel("Sign in");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 10, 100, 30);

        Color bgColor = Color.decode("#fffbf4"); // Replace #FF0000 with your hex color code
        getContentPane().setBackground(bgColor);

        //display logo
        try {
            File imageFile = new File("logo.png");
            Image image = ImageIO.read(imageFile);
            
            // Calculate the scaled width and height to fit within a specific size
            int maxWidth = 225; // Maximum width
            int maxHeight = 225; // Maximum height
            
            int originalWidth = image.getWidth(null);
            int originalHeight = image.getHeight(null);
            
            // Calculate the scaled dimensions
            int scaledWidth = originalWidth;
            int scaledHeight = originalHeight;
            
            // Check if scaling is needed
            if (originalWidth > maxWidth || originalHeight > maxHeight) {
                double widthRatio = (double) maxWidth / originalWidth;
                double heightRatio = (double) maxHeight / originalHeight;
                double minRatio = Math.min(widthRatio, heightRatio);
                
                scaledWidth = (int) (originalWidth * minRatio);
                scaledHeight = (int) (originalHeight * minRatio);
            }
            
            // Resize the image
            Image scaledImage = image.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
            
            // Create a ImageIcon from the scaled image
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            
            // Create a JLabel for the scaled image
            logoLabel = new JLabel(scaledIcon);
            logoLabel.setBounds(375, 225, scaledWidth, scaledHeight); // Adjust position as needed
            add(logoLabel);

            
        } catch (IOException e) {
            e.printStackTrace();
        }

        

        // Username and password labels
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(125, 90, 80, 30);
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(125, 130, 80, 30);

        // Username text field
        usernameField = new JTextField();
        usernameField.setBounds(200, 90, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black));

        // Password text field
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 130, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black));

        // Sign in button
        signInButton = new JButton("Sign in");
        signInButton.setBounds(235, 200, 100, 30);
        signInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean check = authorization.CheckUser(usernameField.getText(), new String(passwordField.getPassword()));
                if (check) {
                    System.out.println("user has account");
                    User.setString(usernameField.getText());
                    setVisible(false);
                    Survey survey = new Survey();
                    survey.setVisible(true);
                } else {
                    System.out.println("Invalid credentials");
                    // Show invalid credentials label
                    invalidLabel.setVisible(true);
                }
            }
        });

        // Create account option if the user doesn't have an account
        createAccount = new JButton("CREATE ACCOUNT");
        createAccount.setBounds(215, 240, 150, 30);
        createAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open SignUp window when "CREATE ACCOUNT" button is clicked
                SignUp signUp = new SignUp();
                signUp.signUpMethod();
                setVisible(false);
            }
        });

        // Label for invalid credentials
        invalidLabel = new JLabel("Invalid credentials");
        invalidLabel.setForeground(Color.RED);
        invalidLabel.setBounds(235, 170, 150, 20);
        invalidLabel.setVisible(false); // Initially invisible

        add(titleLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(signInButton);
        add(createAccount);
        add(invalidLabel);

        pack();
    }
}
