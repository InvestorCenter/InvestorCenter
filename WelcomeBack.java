import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomeBack extends JPanel {

    JLabel welcomeMessage, instructions;
    JButton next;

    public WelcomeBack () {
        String name = User.getName();
        welcomeMessage = new JLabel("Welcome back " + name);
        instructions = new JLabel("Please click next to bring you to your saved profile");
        next = new JButton("Next");

        add(welcomeMessage);
        add(instructions);
        add(next);
    }
}
