import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
    public MainFrame() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        // https://youtu.be/5G2XM1nlX5Q?si=XvY4HJvAb1EzJsup

        // Set the title of the frame
        setTitle("Hello World GUI");

        // Set the size of the frame
        setSize(500, 600);

        // Set the min size of the frame
        setMinimumSize(new Dimension(300, 400));
        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a label to the frame
        add(new JLabel("Hello, World!"));

        // Set the frame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
