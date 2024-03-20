import java.awt.*;
import javax.swing.*;



public class Main {

public static void main(String[] args) {
        System.out.println(Auth.CheckUser("chris_bolton", "daddy"));
        
        SignIn signIn = new SignIn();
        signIn.setVisible(true);

    }
}
