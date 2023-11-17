import java.awt.*;
import javax.swing.*;

public class SwingPracticeHard {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JPanel topPanel;
    private JPanel bigPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public SwingPracticeHard() {
        prepareGUI();

    }

    public static void main(String[] args) {
        SwingPracticeHard swingControlDemo = new SwingPracticeHard();

    }

    public void prepareGUI(){
        mainFrame = new JFrame("Example With border inside grid layout");
        mainFrame.setBounds(0,0,500,400);
        mainFrame.setLayout(new GridLayout(2,1));

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(3,3));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(2,1));

        JPanel bigPanel = new JPanel();
        bigPanel.setLayout(new GridLayout(1,2));

        JLabel statusLabel1 = new JLabel("Top 0", SwingConstants.CENTER);
        JLabel statusLabel2 = new JLabel("Top 0", SwingConstants.CENTER);
        JLabel statusLabel3 = new JLabel("Top 0", SwingConstants.CENTER);
        JLabel statusLabel4 = new JLabel("Top 0", SwingConstants.CENTER);
        JLabel statusLabel5 = new JLabel("Top 0", SwingConstants.CENTER);
        JLabel statusLabel6 = new JLabel("Top Right", SwingConstants.CENTER);


        JButton button1 = new JButton("Top 1");
        JButton button2 = new JButton("Top 2");
        JButton button3 = new JButton("Top 3");
        JButton button4 = new JButton("Top 4");
        JButton button5 = new JButton("1");

        controlPanel.add(statusLabel1);
        controlPanel.add(button1);
        controlPanel.add(statusLabel2);
        controlPanel.add(button2);
        controlPanel.add(statusLabel3);
        controlPanel.add(button3);
        controlPanel.add(statusLabel4);
        controlPanel.add(button4);
        controlPanel.add(statusLabel5);

        topPanel.add(statusLabel6);
        topPanel.add(button5);


        bigPanel.add(controlPanel);
        bigPanel.add(topPanel);

        mainFrame.add(bigPanel);



        mainFrame.setVisible(true);

    }
}