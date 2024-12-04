import java.awt.*;

import javax.swing.*;

public class Hangman 
{
    public static void main(String[] args) 
    {
        // Creating Hangman class object
        Hangman h1 = new Hangman();

        // Create JFrame class object and providing basic layout
        String titleText = "Hangman";
        JFrame frame = new JFrame(titleText);
        frame.setLayout(null);
        frame.setLayout(new BorderLayout());
        frame.setUndecorated(true); // Remove default title bar and border
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(30,30,30));

        /*
            CREATING CUSTOM TITLEPANEL
        */

        JPanel titlePanel = new JPanel();
        
        // Flow layout basically helps to deal with the x-axis i.e., the row. It works in a way that if a whole row is occupied then it will simply flow to the next row.
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT)); 
        titlePanel.setBackground(Color.WHITE);
        
        /*
            Creating TITLEPANEL label and adding it to the title panel
        */        

        JLabel title = new JLabel();
        title.setText(titleText);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(Color.BLACK);
        titlePanel.add(title);

        /*
            IMAGES ARE LOADED HERE 
        */

        ImageIcon mini = new ImageIcon("Icon_Images/minimize_icon.png");
        ImageIcon close = new ImageIcon("Icon_Images/close_icon.png");

        /*
            RESIZING THE IMAGES LOADED 
        */

        Image temp_mini = mini.getImage();
        Image temp_close = close.getImage();

        Image re_mini = temp_mini.getScaledInstance(17, 17, 0);
        Image re_close = temp_close.getScaledInstance(25, 25, 0);

        ImageIcon mini_icon = new ImageIcon(re_mini); 
        ImageIcon close_icon = new ImageIcon(re_close); 


        /*
            BUTTONS START HERE 
        */

        // Initializing button numbers
        int buttonNumbers = 4;

        // Initializing JButton class array object
        JButton[] b = new JButton[buttonNumbers];

        // Creating play button
        b[0] = new JButton("Play");
        b[0].setBackground(new Color(0,95,115));
        b[0].setForeground(Color.WHITE);
        b[0].setBounds(345,250,64,30);
        
        // Creating host button
        b[1] = new JButton("Host");
        b[1].setBackground(new Color(0,95,115));
        b[1].setForeground(Color.WHITE);
        b[1].setBounds(342,210,70,30);

        // Creating minimize button
        b[2] = new JButton(mini_icon);
        b[2].setBounds(342,0,70,30);

        // Creating cross button
        b[3] = new JButton(close_icon);
        b[3].setBounds(442,0,100,50);

        /*
            LABELS START HERE 
        */

        int labelNumbers = 1;
        JLabel[] l = new JLabel[labelNumbers];

        l[0] = new JLabel();
        l[0].setText("Welcome to Hangman!");
        l[0].setBounds(236, 100, 500, 30);
        l[0].setFont(new Font("Comic Sans MS", Font.BOLD, 24));

        /*
            AUTOMATICALLY ADDING  
        */

        // Automatically adding every buttons to the frame
        for(int i = 0; i < buttonNumbers; i++)
        {
            frame.add(b[i]);
        }
        
        // Automatically adding every labels to the frame
        for(int i = 0; i < labelNumbers; i++)
        {
            frame.add(l[i]);
        }

        frame.add(titlePanel, BorderLayout.NORTH);

        frame.setVisible(true);
    }
}
