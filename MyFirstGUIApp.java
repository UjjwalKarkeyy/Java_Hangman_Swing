import javax.swing.JFrame;

public class MyFirstGUIApp
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setSize(500,500);

        // EXIT_ON_CLOSE is defined as static constant which means it is a part of class and not of objects being static.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        frame.setVisible(true); 
        frame.setLocationRelativeTo(null); 
    }
}