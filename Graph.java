import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.QuadCurve2D;
// TODO: MAKE GRAPH ONE CURVE/LINE TO SHOW INTEREST EARNED. WILL BE EASIER TO LOOK AT
//TODO: MAKE SURE WE ADD THE MONTHLY CONTRIBUTIONS (CAN DO THIS BY MULTIPLYING THE CONTRIBUTION AMOUNT BY 12 THEN ADDING TO PRINCIPLE AND MULTIPLYING BY INTEREST RATE) DO THIS FOR EVERY YEAR
// FIXME: GRAPH DATA STARTS AT 1 YEAR BUT IT SHOULD START AT 0 YEARS.
// FIXME: GRAPH CREATES MULTIPLE FRAMES (OVERLAPS LIKE 10 OF THEM)
// TODO: SHOULD WE ADD FIELDS TO MODIFY THE GRAPH ONCE ITS ALREADY MADE
// FIXME: CAN NO LONGER SEE THE LINE ON THE GRAPH
public class Graph extends JPanel implements MouseMotionListener {
    private static final int OFFSETX = 100;
    private static final int OFFSETY = 150;
    private Polygon polygon;
    private Polygon polygon2;

    private double[] data;
    private double[] interest;
    private JLabel yValueLabel;

    // Number of y-axis divisions (change as needed)
    private static final int NUM_Y_DIVISIONS = 5;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for smoother lines
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Calculate the scale for the graph
        double xScale = (double) (getWidth() - 2 * OFFSETX) / (data.length - 1);
        double yScale = (double) (getHeight() - 2 * OFFSETY) / (getMaxValue());

        // Draw x-axis
        g2d.drawLine(OFFSETX, getHeight() - OFFSETY, getWidth() - OFFSETX, getHeight() - OFFSETY);

        // Draw y-axis
        g2d.drawLine(OFFSETX, getHeight() - OFFSETY, OFFSETX, OFFSETY);

        // Draw y-axis scale and labels
        double yIncrement = (double) (getMaxValue()) / (NUM_Y_DIVISIONS - 1);
        for (int i = 0; i < NUM_Y_DIVISIONS; i++) {
            int y = (int) (getHeight() - OFFSETY - i * (getHeight() - 2 * OFFSETY) / (NUM_Y_DIVISIONS - 1));
            g2d.drawLine(OFFSETX - 5, y, OFFSETX + 5, y);
            String label = String.format("%.2f", i * yIncrement);
            g2d.drawString(label, OFFSETX - 75, y + 5);
        }

        // Draw data points and curves
        for (int i = 0; i < data.length; i++) {
            g2d.setColor(new Color(0, 0, 0, 100));
            int x1 = (int) (i * xScale) + OFFSETX;
            int y1 = getHeight() - (int) (data[i] * yScale) - OFFSETY;

            int interestY = getHeight() - (int) ((data[i] + interest[i]) * yScale) - OFFSETY;

            if (i > 0) {
                int x2 = (int) ((i - 1) * xScale) + OFFSETX;
                int y2 = getHeight() - (int) (data[i - 1] * yScale) - OFFSETY;

                int interestY2 = getHeight() - (int) ((data[i-1] + interest[i - 1]) * yScale) - OFFSETY;

                int ctrlX = (x1 + x2) / 2;
                int ctrlY = (y1 + y2) / 2;

                int interestCtrlY = (interestY + interestY2) / 2;
                QuadCurve2D interstCurve = new QuadCurve2D.Float(x2, interestY2, ctrlX, interestCtrlY, x1, interestY);

                QuadCurve2D curve = new QuadCurve2D.Float(x2, y2, ctrlX, ctrlY, x1, y1);
                g2d.draw(curve);
                g2d.setColor(Color.BLUE);
                g2d.draw(interstCurve);
                g2d.setColor(new Color(0, 255, 0, 100));

                if (i >= 1) {
                    g2d.setColor(Color.BLACK);
                    g2d.drawString(Integer.toString(i), x1-5, getHeight() - OFFSETY + 20);
                }
            }
        }

        polygon = new Polygon();
        for (int i = 0; i < data.length; i++) {
            int x = (int) (i * xScale) + OFFSETX;
            int y = getHeight() - (int) (data[i] * yScale) - OFFSETY;
            polygon.addPoint(x, y);
        }
        polygon.addPoint((int) ((data.length - 1) * xScale) + OFFSETX, getHeight() - OFFSETY);
        polygon.addPoint(OFFSETX, getHeight() - OFFSETY);

        polygon2 = new Polygon();
        for (int i = 0; i < data.length; i++) {
            int x = (int) (i * xScale) + OFFSETX;
            int y = getHeight() - (int) ((interest[i] + data[i]) * yScale) - OFFSETY;
            polygon2.addPoint(x, y);
        }
        polygon2.addPoint((int) ((data.length - 1) * xScale) + OFFSETX, getHeight() - OFFSETY);
        polygon2.addPoint(OFFSETX, getHeight() - OFFSETY);

        // Fill the area under the curve
        g2d.setColor(new Color(0, 0, 255, 50));
        g2d.fill(polygon2);

        g2d.setColor(new Color(0, 255, 100));
        g2d.fill(polygon);
        if (getMousePosition() != null) {
            int mouseX = getMousePosition().x;
            if (mouseX != -1) {
                int index1 = (int) ((mouseX - OFFSETX) / xScale);
                int index2 = index1 + 1;

                if (index1 >= 0 && index1 < data.length ) {
                    double y1 = data[index1];
                    double interestY1 = interest[index1];
                    double interestY2;
                    double y2;
                    double relativePosition;
                    if (index2 >= data.length) {
                        relativePosition = 1.0;  // Use 1.0 if at the end of the graph
                        y2 = data[index2-1];
                        interestY2 = interest[index2-1];
                    } else {
                        relativePosition = ((double) (mouseX - (index1 * xScale + OFFSETX))) / xScale;
                        y2 = data[index2];
                        interestY2 = interest[index2];
                    }

                    if (relativePosition >= 0 && relativePosition <= 1){
                        int interpolatedY = (int) (y1 + relativePosition * (y2 - y1));
                        int interestInterpolatedY = (int) (interestY1 + relativePosition * (interestY2 - interestY1));
                        yValueLabel.setText(Integer.toString(interpolatedY) + " " + Integer.toString(interestInterpolatedY));
                        g2d.setColor(Color.BLACK);
                        float[] dashPattern = {5f, 5f}; // 5 pixels drawn, 5 pixels skipped
                        BasicStroke dashedStroke = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0, dashPattern, 0);

                        g2d.setStroke(dashedStroke);

                        // keeps the line in the graph

                        if (interpolatedY<data[data.length-1]){
                            g2d.drawLine(mouseX, getHeight() - OFFSETY, mouseX, getHeight() - (int) ((interpolatedY + interestInterpolatedY) * yScale) - OFFSETY);
                            g2d.fillOval(mouseX-3, getHeight() - (int) (interpolatedY * yScale) - OFFSETY-2, 6,6 );
                            g2d.fillOval(mouseX-3, getHeight() - (int) ((interpolatedY + interestInterpolatedY) * yScale) - OFFSETY-2, 6,6 );
                        }
                    }
                }
            }
        }
    }

    private double getMaxValue() {
        return data[data.length-1];
    }

    public Graph(double[] data, double[] interest){
        this.data = data;
        this.interest = interest;
        addMouseMotionListener(this);
        yValueLabel = new JLabel();
        yValueLabel.setPreferredSize(new Dimension(100, 20));
        // Set JPanel layout to BorderLayout to position the label
        setLayout(new BorderLayout());
        JLabel information = new JLabel();
        JLabel key = new JLabel();
        double totalInterest = 0;
        double totalInvestment = data[data.length-1];
        for (double interestValue : this.interest){totalInterest+=interestValue;}
        Double.toString(totalInterest);
        key.setText("<html>" + "After " + data.length + " years, you would of made $" + String.format("%.2f", totalInterest) + " after investing $" +  totalInvestment +"<br><br>" + "GREEN LINE IS INVESTMENT\n BLUE LINE IS INTEREST MADE ON DOLLAR SO FAR" + "<html>");
        add(yValueLabel, BorderLayout.NORTH);
        add(key, BorderLayout.SOUTH);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        repaint();
    }
}