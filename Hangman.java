import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Hangman 
{
    public static void main(String[] args) 
    {
        // Creating Hangman class object
        Hangman h1 = new Hangman();

        // Create JFrame class object and providing basic layout
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setUndecorated(true); // Remove default title bar and border
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(250,250,250));
        
        /*
            CREATING CUSTOM TITLEPANEL
            CREATING TITLE LABEL TO ADD TO TITLE PANEL
        */
        
        String titleText = "Hangman";
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(Color.WHITE);
        
        // Creating lable for title of panel
        JLabel titleLabel = new JLabel(titleText);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel, BorderLayout.WEST);

        /*
            IMAGES ARE LOADED HERE 
        */

        ImageIcon mini_icon = new ImageIcon("Icon_Images/minimize_icon.png");
        ImageIcon close_icon = new ImageIcon("Icon_Images/cross_icon.png");

        /*
            RESIZING THE IMAGES LOADED 
        */

        Image temp_mini = mini_icon.getImage();
        Image temp_close = close_icon.getImage();

        Image re_mini = temp_mini.getScaledInstance(17, 17, 0);
        Image re_close = temp_close.getScaledInstance(17, 17, 0);

        mini_icon = new ImageIcon(re_mini); 
        close_icon = new ImageIcon(re_close); 


        /*
            CREATING AND ADDITNG NAV ICON BUTTON TO TITLE PANEL
         */

        // Creating minimize button
        JButton min_button = new JButton(mini_icon);
        min_button.setSize(70,30);
        min_button.setBorder(null);
        
        // Creating cross button
        JButton close_button = new JButton(close_icon);
        min_button.setSize(70,30);
        close_button.setBorder(null);

        /*
            ADDING BUTTONS TO A NEW PANEL SO THEY DON'T OVERLAP
            THEN ADDING TAHT PANEL TO TITLE PANEL
        */ 

        JPanel buttoPanel = new JPanel();
        // buttoPanel.setLayout(BorderLayout.NORTH);
        buttoPanel.add(min_button);
        buttoPanel.add(close_button);
        titlePanel.add(buttoPanel, BorderLayout.EAST);

        /*
            CREATING THE MAIN PANEL FOR WELCOME TEXT AND HOST, PLAY BUTTONS
        */

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());

            /*
                BUTTONS START HERE 
            */

            // Initializing button numbers
            int buttonNumbers = 2;

            // Initializing JButton class array object
            JButton[] b = new JButton[buttonNumbers];

            // Creating play button
            b[0] = new JButton("Play");
            b[0].setBackground(new Color(0,95,115));
            b[0].setForeground(Color.WHITE);

            // Creating host button
            b[1] = new JButton("Host");
            b[1].setBackground(new Color(0,95,115));
            b[1].setForeground(Color.WHITE);

            /*
                LABELS START HERE 
            */

            int labelNumbers = 1;
            JLabel[] l = new JLabel[labelNumbers];

            l[0] = new JLabel();
            l[0].setText("Welcome to Hangman!");
            l[0].setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        /*
            AUTOMATICALLY ADDING  
        */

        // Automatically adding every buttons to the main panel
        for(int i = 0; i < buttonNumbers; i++)
        {
            main.add(b[i], BorderLayout.CENTER);
        }
        
        // Automatically adding every labels to the main panel
        for(int i = 0; i < labelNumbers; i++)
        {
            main.add(l[i], BorderLayout.CENTER);
        }
        frame.add(main, BorderLayout.CENTER);
        frame.add(titlePanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
