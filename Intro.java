import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Intro extends JPanel {

    JLabel welcomeMessage, instructions;
    JButton next;

    public Intro () {
        String name = User.getName();
        welcomeMessage = new JLabel("Welcome " +name);
        instructions = new JLabel("Please answer the following questions so that we are able to guide you");
        next = new JButton("Next");

        add(welcomeMessage);
        add(instructions);
        add(next);
    }
}
