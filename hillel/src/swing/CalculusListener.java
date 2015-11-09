package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by HillelStudent on 09.11.2015.
 */
public class CalculusListener implements ActionListener {
    private JTextField textField;
    private int firstOperand;

    public CalculusListener(JTextField textField){
        this.textField = textField;
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonPressed = e.getActionCommand();
            System.out.println(buttonPressed + " button pressed ");

            textField.setText(textField.getText() + buttonPressed);

            switch (buttonPressed){
                case "+":
                    Integer.parseInt(textField.getText());
                    textField.setText("");
                    break;
                case "=":
                    Integer secondOperand = Integer.parseInt(textField.getText());
                    textField.setText(secondOperand.toString());
                    break;
                default:

            }

        }

    }

