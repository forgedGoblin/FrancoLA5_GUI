package SimpleCalc;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame{
    private JPanel pMain;
    private JTextField tfFirstNo;
    private JComboBox cbOperation;
    private JButton btnCompute;
    private JPanel pFirstNo;
    private JPanel pSecondNo;
    private JPanel pResult;
    private JTextField tfSecondNo;
    private JTextField tfResult;

    public SimpleCalcGUI() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int num1 = Integer.parseInt(tfFirstNo.getText());
                    int num2 = Integer.parseInt(tfSecondNo.getText());
                    int result = 0;
                    String remain = "";
                    String operation = cbOperation.getSelectedItem().toString();

                    if (operation == "+") {
                        result = num1 + num2;
                    } else if (operation == "-") {
                        result = num1 - num2;
                    } else if (operation == "*") {
                        result = num1 * num2;
                    } else if (operation == "/") {
                        result = num1 / num2;
                        remain = " r." + Integer.toString(num1 % num2);
                    }
                    tfResult.setText(Integer.toString(result) + remain);
                    tfResult.setEditable(false);
                } catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(btnCompute, "Enter a numeric value!","ERROR", JOptionPane.ERROR_MESSAGE);
                } catch(ArithmeticException ex){
                    JOptionPane.showMessageDialog(btnCompute, "Enter a nonzero value!","ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.pMain);
        calc.setTitle("Simple Calculator");
        calc.setBounds(400, 200, 500, 200);
//        calc.setSize(300,400);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


