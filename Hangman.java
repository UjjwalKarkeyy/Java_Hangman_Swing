import java.awt.Color;

import javax.swing.*;

public class Hangman 
{
    public static void main(String[] args) 
    {
        // Creating Hangman class object
        Hangman h1 = new Hangman();

        // Create JFrame class object and providing basic layout
        JFrame frame = new JFrame("Hangman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.CYAN);

        // Initializing button numbers
        int buttonNumbers = 2;

        // Initializing JButton class array object
        JButton[] b = new JButton[buttonNumbers];

        // Creating play button
        b[0] = new JButton("Play");
        b[0].setBackground(Color.GREEN);
        b[0].setBounds(345,250,64,30);
        
        // Creating host button
        b[1] = new JButton("Host");
        b[1].setBackground(Color.GREEN);
        b[1].setBounds(342,215,70,30);

        // Automatically adding every button to the frame
        for(int i = 0; i < buttonNumbers; i++)
        {
            frame.add(b[i]);
        }

        frame.setVisible(true);
    }
}
