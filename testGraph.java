import javax.swing.*;

public class testGraph{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    public testGraph(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Curved Graph Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Interest gInterest = new Interest(1000,1000, 10, 10); // 5 grand for 10 years at 6% interest
            double[] data = gInterest.getDataSet();
            double[] interest = gInterest.calculateInterest();
            double totalInterest = 0;
            for (double interestValue : interest){
                totalInterest+=interestValue;
            }

            System.out.println(totalInterest);


            Graph graph = new Graph(data,interest);
            frame.add(graph);
            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
        });
    }
}

