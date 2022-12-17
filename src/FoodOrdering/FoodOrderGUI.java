package FoodOrdering;

import javax.swing.*;

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
