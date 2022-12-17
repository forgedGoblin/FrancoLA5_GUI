package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame{
    private JPanel mainPanel;
    private JPanel panelLeapYear;
    private JTextField tfYear;
    private JButton btnCheckYear;
public LeapYearGUI() {
    btnCheckYear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int year = Integer.parseInt(tfYear.getText());

                if (year % 400 == 0) {
                    JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                } else if (year % 100 == 0) {
                    JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                } else if (year % 4 == 0) {
                    JOptionPane.showMessageDialog(btnCheckYear, "Leap year");
                } else {
                    JOptionPane.showMessageDialog(btnCheckYear, "Not a leap year");
                }
            }catch(NumberFormatException i){
                JOptionPane.showMessageDialog(btnCheckYear, "Enter a numeric value!","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    });
}

    public static void main(String[] args) {
        LeapYearGUI leap = new LeapYearGUI();
        leap.setContentPane(leap.mainPanel);
        leap.setTitle("Leap Year");
        leap.setBounds(600, 200, 400, 400);
//        leap.setSize(300,400);
        leap.setVisible(true);
        leap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
