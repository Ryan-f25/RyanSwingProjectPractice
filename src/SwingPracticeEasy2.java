import java.awt.*;
import javax.swing.*;

public class SwingPracticeEasy2 {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public SwingPracticeEasy2(){
        prepareGUI();

    }

    public static void main(String[] args) {
        SwingPracticeEasy2 swingControlDemo = new SwingPracticeEasy2();

    }
    public void prepareGUI(){
        mainFrame = new JFrame("Example With Border Layout");
        mainFrame.setBounds(0,0,500,400);
        //mainFrame.setLayout(new GridLayout(4,1));
        mainFrame.setLayout(new BorderLayout());
//
//        JPanel controlPanel = new JPanel();
//        controlPanel.setLayout(new BorderLayout());

        JButton button4 = new JButton("Button 4");
        //controlPanel.add(button,BorderLayout.WEST);
        mainFrame.add(button4,BorderLayout.WEST);

        JButton button2 = new JButton("Button 2");
        mainFrame.add(button2, BorderLayout.EAST);

        JButton button5 = new JButton("Button 5");
        mainFrame.add(button5, BorderLayout.CENTER);

        JButton button1 = new JButton("Button 1");
        mainFrame.add(button1, BorderLayout.NORTH);

        JButton button3 = new JButton("Button 3");
        mainFrame.add(button3, BorderLayout.SOUTH);

//        JLabel statusLabel = new JLabel("Taking too long");
//        controlPanel.add(statusLabel,BorderLayout.SOUTH);

       // mainFrame.add(controlPanel);

        mainFrame.setVisible(true);

        //JTextArea ta = new JTextArea();
    }

}
