import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Hangman 
{

    
    public void CreateNewPanel(JFrame frame, JPanel titlePanel, JPanel buttonPanel)
    {
        frame.getContentPane().removeAll();

        JPanel newPanel = new JPanel();
        newPanel.setLayout(new BorderLayout());
        frame.add(newPanel, BorderLayout.CENTER);
        newPanel.add(buttonPanel, BorderLayout.SOUTH);

        frame.add(titlePanel, BorderLayout.NORTH);

        // Refreshing the frame
        frame.revalidate();
        frame.repaint();
    }

    public void CreateNewPanel(JFrame frame, JPanel titlePanel, JPanel buttonPanel, JPanel main)
    {
        frame.getContentPane().removeAll();

        frame.add(main, BorderLayout.CENTER);
        main.add(buttonPanel, BorderLayout.CENTER);

        frame.add(titlePanel, BorderLayout.NORTH);

        // Refreshing the frame
        frame.revalidate();
        frame.repaint();
    }

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
        ImageIcon hangman_picture = new ImageIcon("Icon_Images/hangman.png");

        /*
            RESIZING THE IMAGES LOADED 
        */

        Image temp_mini = mini_icon.getImage();
        Image temp_close = close_icon.getImage();
        Image temp_hangman_pic = hangman_picture.getImage();

        Image re_mini = temp_mini.getScaledInstance(17, 17, 0);
        Image re_close = temp_close.getScaledInstance(17, 17, 0);
        Image re_hangman_pic = temp_hangman_pic.getScaledInstance(100, 120, 0);

        mini_icon = new ImageIcon(re_mini); 
        close_icon = new ImageIcon(re_close); 
        hangman_picture = new ImageIcon(re_hangman_pic); 

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
        buttoPanel.add(min_button);
        buttoPanel.add(close_button);
        titlePanel.add(buttoPanel, BorderLayout.EAST);

        /*
            CREATING THE MAIN PANEL FOR WELCOME TEXT AND HOST, PLAY BUTTONS
        */

        JPanel main = new JPanel();
        main.setLayout(new BorderLayout());
        main.setBorder(BorderFactory.createEmptyBorder(100, 0, 0, 0));

            /*
                BUTTONS START HERE 
            */
            JPanel buttonPanel = new JPanel();
            
            // Creating play button
            JButton PlayButton = new JButton("Play");
            PlayButton.setBackground(new Color(0,95,115));
            PlayButton.setForeground(Color.WHITE);
            
            // Creating host button
            JButton HostButton = new JButton("Host");
            HostButton.setBackground(new Color(0,95,115));
            HostButton.setForeground(Color.WHITE);
            
            // Adding HOST and Play buttons to buttonPanel
            buttonPanel.add(PlayButton);
            buttonPanel.add(HostButton);

            JPanel buttonPlayPanel = new JPanel();

            // Creating Next Game button
            JButton NewGame1 = new JButton("Next Game");
            NewGame1.setBackground(new Color(0,95,115));
            NewGame1.setForeground(Color.WHITE);
            
            // Creating Exit button
            JButton ExitButton1 = new JButton("Exit");
            ExitButton1.setBackground(new Color(0,95,115));
            ExitButton1.setForeground(Color.WHITE);
            
            // Adding Next Game and Exit buttons to buttonNewPanel
            buttonPlayPanel.add(NewGame1);
            buttonPlayPanel.add(ExitButton1); 

            JPanel buttonHostPanel = new JPanel();

            // Creating Next Game button
            JButton Next = new JButton("Next");
            Next.setBackground(new Color(0,95,115));
            Next.setForeground(Color.WHITE);

            // Creating Exit button
            JButton ExitButton2 = new JButton("Exit");
            ExitButton2.setBackground(new Color(0,95,115));
            ExitButton2.setForeground(Color.WHITE);
            
            // Adding Next Game and Exit buttons to buttonNewPanel
            buttonHostPanel.add(Next);
            buttonHostPanel.add(ExitButton2);
            
            JPanel buttonHostNextGamePanel = new JPanel();

            // Creating Exit button
            JButton ExitButton3 = new JButton("Exit");
            ExitButton3.setBackground(new Color(0,95,115));
            ExitButton3.setForeground(Color.WHITE);

            JButton NewGame2 = new JButton("New Game");
            NewGame2.setBackground(new Color(0,95,115));
            NewGame2.setForeground(Color.WHITE);

            buttonHostNextGamePanel.add(NewGame2);
            buttonHostNextGamePanel.add(ExitButton3);
            
            /*
            LABELS START HERE 
            */
            
            // Creating welcomePanel for welcome label
            JPanel welcomePanel = new JPanel();
            welcomePanel.setLayout(new BoxLayout(welcomePanel, BoxLayout.Y_AXIS));
            welcomePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));

            JLabel welcomeLabel = new JLabel("Welcome to Hangman!");
            welcomeLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
            welcomeLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            
            JLabel hangman_pic_label = new JLabel(hangman_picture);
            hangman_pic_label.setAlignmentX(Component.CENTER_ALIGNMENT);

            // Adding welcome label to welcome panel
            welcomePanel.add(welcomeLabel);
            welcomePanel.add(Box.createVerticalStrut(10));
            welcomePanel.add(hangman_pic_label);

            /*
                CREATING PLAY AND HOST NOTE PANEL AND ADDING THE NOTE LABELS
            */
            JPanel notePanel = new JPanel();
            notePanel.setLayout(new BoxLayout(notePanel, BoxLayout.Y_AXIS));
            JLabel play_note_label = new JLabel("*Play: Guess words randomly generated by computer");
            play_note_label.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));

            JLabel host_note_label = new JLabel("*Host: Host a word, and let audience guess");
            host_note_label.setFont(new Font("Comic Sans MS", Font.ITALIC, 18));

            // Adding host and play note labels to notePanel
            notePanel.add(Box.createVerticalStrut(3));
            notePanel.add(play_note_label);
            notePanel.add(host_note_label);

        /*
            ADDING EVENT LISTENER FOR MINIMIZING AND CLOSING SCREEN 
        */

        close_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                System.exit(0);            
            }
        });

        min_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                frame.setExtendedState(JFrame.ICONIFIED);           
            }
        });

        // Adding to main panel here
        main.add(welcomePanel, BorderLayout.NORTH);
        main.add(buttonPanel, BorderLayout.CENTER);
        main.add(notePanel, BorderLayout.SOUTH);

        // Adding to frame panel here
        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(main, BorderLayout.CENTER);

        /* GETTING MOUSE POSITION WHEN ITS CLICKED */
        final Point mouseClickedPos = new Point();
        final Point diffPos = new Point();

        titlePanel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                
                mouseClickedPos.setLocation(e.getLocationOnScreen());
                diffPos.x = mouseClickedPos.x - frame.getX(); 
                diffPos.y = mouseClickedPos.y - frame.getY(); 
        }});

        /* 
            GETTING MOUSE POSITION WHEN ITS BEEN DRAGGED 
            AND SETTING THE NEW POSITION FOR FRAME
        */
        titlePanel.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                
                Point currentMousePoint = e.getLocationOnScreen();

                int xNewPos = currentMousePoint.x - diffPos.x;
                int yNewPos = currentMousePoint.y - diffPos.y;

                frame.setLocation(xNewPos,yNewPos);
        }});

        PlayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                h1.CreateNewPanel(frame, titlePanel, buttonPlayPanel);
            }
        });

        HostButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                h1.CreateNewPanel(frame, titlePanel, buttonHostPanel);
            }
        });

        ExitButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonPanel, main);
        }});

        ExitButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonPanel, main);
        }});

        ExitButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonPanel, main);
        }});

        Next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonHostNextGamePanel);
        }});

        NewGame1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonPlayPanel);
        }});

        NewGame2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                h1.CreateNewPanel(frame, titlePanel, buttonHostPanel);
        }});

        frame.setVisible(true);
    }
}
