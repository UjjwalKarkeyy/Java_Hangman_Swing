import javax.swing.*;
import java.awt.*;

public class temp {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Title Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        
        // Use a BorderLayout for the frame's content pane
        frame.setLayout(new BorderLayout());

        // Create the title panel
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Optional padding

        // Add a label to the left (the title text)
        JLabel titleLabel = new JLabel("Title Panel");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titlePanel.add(titleLabel, BorderLayout.WEST);

        // Create a button and add it to the right
        JButton rightButton = new JButton("Action");
        titlePanel.add(rightButton, BorderLayout.EAST);

        // Add the title panel to the top of the content pane
        frame.add(titlePanel, BorderLayout.NORTH);

        // Add some content to the center for demonstration
        frame.add(new JLabel("Main Content Area", SwingConstants.CENTER), BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }
}
