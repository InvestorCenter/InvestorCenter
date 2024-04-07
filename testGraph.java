import javax.swing.*;

public class testGraph{
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;
    int[] timePeriod = {2000, 2001, 2002, 2003, 2004, 2005};
    public testGraph(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Curved Graph Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Interest gInterest = new Interest(1000,1000, 10, 10); // 5 grand for 10 years at 6% interest
            double[] data = gInterest.getDataSet();
            double[] interest = gInterest.calculateInterest();
            Graph graph = new Graph(data,interest);
            frame.add(graph);
            frame.setSize(WIDTH, HEIGHT);
            frame.setVisible(true);
        });
    }
}

