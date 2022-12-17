package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cbPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbDrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rbFive;
    private JRadioButton rbTen;
    private JRadioButton rbFifteen;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecimalFormat d = new DecimalFormat("0.00");
                float amount = 0;
                float discount = 0;

                if(cbPizza.isSelected()){
                    amount += 100;
                }
                if(cbBurger.isSelected()){
                    amount += 80;
                }
                if(cbFries.isSelected()){
                    amount += 65;
                }
                if(cbDrinks.isSelected()){
                    amount += 55;
                }
                if(cbTea.isSelected()){
                    amount += 50;
                }
                if(cbSundae.isSelected()){
                    amount += 40;
                }

                if(rbNone.isSelected()){
                    JOptionPane.showMessageDialog(btnOrder, "The total price is: " + d.format(amount));
                } else if(rbFive.isSelected()){
                    discount = (float) (amount * 0.05);
                    amount -= discount;
                    JOptionPane.showMessageDialog(btnOrder, "The total price is: " + d.format(amount));
                } else if(rbTen.isSelected()) {
                    discount = (float) (amount * 0.10);
                    amount -= discount;
                    JOptionPane.showMessageDialog(btnOrder, "The total price is: " + d.format(amount));
                } else if(rbFifteen.isSelected()) {
                    discount = (float) (amount * 0.15);
                    amount -= discount;
                    JOptionPane.showMessageDialog(btnOrder, "The total price is: " + d.format(amount));
                }


            }
        });
    }

    public static void main(String[] args) {
        FoodOrderGUI food = new FoodOrderGUI();
        food.setContentPane(food.panel1);
        food.setTitle("Simple Calculator");
        food.setBounds(400, 100, 500, 500);
//        food.setSize(300,400);
        food.setVisible(true);
        food.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
