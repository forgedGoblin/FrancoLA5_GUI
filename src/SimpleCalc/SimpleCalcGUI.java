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
                int num1 = Integer.parseInt(tfFirstNo.getText());
                int num2 = Integer.parseInt(tfSecondNo.getText());
                double result = 0;
                String operation = cbOperation.getSelectedItem().toString();

                if(operation == "+"){
                    result = num1 + num2;
                } else if(operation == "-"){
                    result = num1 - num2;
                } else if(operation == "*"){
                    result = num1 * num2;
                } else if(operation == "/"){
                    result = num1 / num2;
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.pMain);
        calc.setTitle("Leap Year");
        calc.setBounds(400, 200, 500, 200);
//        calc.setSize(300,400);
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


