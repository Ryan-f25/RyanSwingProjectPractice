import java.awt.*;
import javax.swing.*;

public class SwingPracticeMedium1 {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public SwingPracticeMedium1(){
        prepareGUI();

    }
    public static void main(String[] args) {
        SwingPracticeMedium1 swingControlDemo = new SwingPracticeMedium1();

    }
    public void prepareGUI(){
        mainFrame = new JFrame("Example With Border Layout");
        mainFrame.setBounds(0,0,500,400);
        mainFrame.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2, 3));

        JLabel statusLabel1 = new JLabel("label 1", SwingConstants.CENTER);
        JLabel statusLabel2 = new JLabel("label 2", SwingConstants.CENTER);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        controlPanel.add(button2);
        controlPanel.add(statusLabel1);
        controlPanel.add(button4);
        controlPanel.add(statusLabel2);
        controlPanel.add(button5);

        mainFrame.add(button1, BorderLayout.NORTH);
        mainFrame.add(button3, BorderLayout.SOUTH);
        mainFrame.add(controlPanel, BorderLayout.CENTER);

        mainFrame.setVisible(true);

    }
}
