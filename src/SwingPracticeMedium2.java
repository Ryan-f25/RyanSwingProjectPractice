import java.awt.*;
import javax.swing.*;

public class SwingPracticeMedium2 {

    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel statusLabel;
    private TextArea ta;
    private JButton button;


    public SwingPracticeMedium2() {
        prepareGUI();

    }

    public static void main(String[] args) {
        SwingPracticeMedium2 swingControlDemo = new SwingPracticeMedium2();

    }

    public void prepareGUI(){
        mainFrame = new JFrame("Example With border inside grid layout");
        mainFrame.setBounds(0,0,500,400);
        mainFrame.setLayout(new GridLayout(3,3));

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());

        JLabel statusLabel1 = new JLabel("label 1", SwingConstants.CENTER);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");
        JButton button8 = new JButton("Button 8");
        JButton button9 = new JButton("Button 9");
        JButton button10 = new JButton("Button 10");

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);
        mainFrame.add(controlPanel);

        controlPanel.add(statusLabel1,BorderLayout.CENTER);
        controlPanel.add(button9, BorderLayout.EAST);
        controlPanel.add(button10, BorderLayout.SOUTH);
        mainFrame.add(button5);
        mainFrame.add(button6);
        mainFrame.add(button7);
        mainFrame.add(button8);






        mainFrame.setVisible(true);
        controlPanel.setVisible(true);

    }
}

