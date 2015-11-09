package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HillelStudent on 09.11.2015.
 */
public class MainForm extends JFrame {
    private JPanel panel;
    private JButton exitButton;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a7Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a8Button;
    private JButton a6Button1;
    private JButton a5Button1;
    private JButton a9Button;
    private JTextField textField;
    private JButton equalButton;
    private JButton plusButton;

    public MainForm(){

        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        exitButton.addActionListener(new QuitAction());

        ActionListener keyListener = new CalculusListener(textField);
        exitButton.addActionListener(keyListener);
        a4Button.addActionListener(keyListener);
        a1Button.addActionListener(keyListener);
        a7Button.addActionListener(keyListener);
        a2Button.addActionListener(keyListener);
        a0Button.addActionListener(keyListener);
        a3Button.addActionListener(keyListener);
        a8Button.addActionListener(keyListener);
        a6Button1.addActionListener(keyListener);
        a5Button1.addActionListener(keyListener);
        a9Button.addActionListener(keyListener);
        plusButton.addActionListener(keyListener);
        equalButton.addActionListener(keyListener);


        a4Button.setActionCommand("4");
        a1Button.setActionCommand("1");
        a7Button.setActionCommand("7");
        a2Button.setActionCommand("2");
        a0Button.setActionCommand("0");
        a3Button.setActionCommand("3");
        a8Button.setActionCommand("8");
        a6Button1.setActionCommand("6");
        a5Button1.setActionCommand("5");
        a9Button.setActionCommand("9");

    }

    public static void main(String[] args) {
        new MainForm();
    }
}
