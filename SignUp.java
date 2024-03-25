import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class SignUp extends JFrame implements ActionListener {
<<<<<<< HEAD
    private JLabel titleLabel, usernameLabel, passwordLabel, logoLabel;
=======
    private JLabel titleLabel, usernameLabel, passwordLabel;
>>>>>>> 094d501 (i forget when)
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;
    private static Auth authorization = new Auth();

    public void signUpMethod() {
        setTitle("Investor Center");
        setPreferredSize(new Dimension(600, 400));
        setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //sign up 
        titleLabel = new JLabel("Sign up");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(250, 10, 100, 30);

<<<<<<< HEAD
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

=======
>>>>>>> 094d501 (i forget when)
        


        //username and password indicators
        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(125, 90, 80, 30);
        

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(125, 130, 80, 30);




        //username text field
        usernameField = new JTextField();
        usernameField.setBounds(200,90, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.black));



        //password text field
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 130, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.black));




        //sign up button
        signUpButton = new JButton("Sign up");
        signUpButton.setBounds(235, 200, 100, 30);
        signUpButton.addActionListener(this);

        add(titleLabel);

        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(signUpButton);

        pack();

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //add what happens when clicked "sign up"
        authorization.Signup(usernameField.getText(), passwordField.getText());
        SignIn signIn = new SignIn();
        signIn.setVisible(true);
        setVisible(false);
        

    }
}
