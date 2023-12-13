import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Panel extends JFrame{
    JTextField text1, text2, text3;
    Checkbox sum, sub, del, pr, clear;
    CheckboxGroup cbg;
    JButton button;
    public Panel(){
        super("Пробное окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setSize(600, 300);

        button = new JButton("Calculate");
        button.setSize(150, 75);
        button.setLocation(420,120);

        text1 = new JTextField();
        text1.setSize(150,75);
        text1.setLocation(20,20);

        text2 = new JTextField();
        text2.setSize(150,75);
        text2.setLocation(220,20);

        text3 = new JTextField();
        text3.setSize(150,75);
        text3.setLocation(420,20);

        cbg = new CheckboxGroup();

        sum = new Checkbox("+", cbg, true);
        sum.setLocation(20, 120);
        sum.setSize(20,20);

        sub = new Checkbox("-",cbg,true);
        sub.setLocation(50, 120);
        sub.setSize(20,20);

        pr = new Checkbox("*", cbg, true);
        pr.setLocation(80, 120);
        pr.setSize(20,20);

        del = new Checkbox("/",cbg,true);
        del.setLocation(110, 120);
        del.setSize(20,20);

        clear = new Checkbox("clear", cbg, true);
        clear.setLocation(20, 170);
        clear.setSize(20,20);

        button.addActionListener(new ButtonActionListener());

        panel.add(button);
        panel.add(text1);
        panel.add(text2);
        panel.add(text3);
        panel.add(sum);
        panel.add(sub);
        panel.add(pr);
        panel.add(del);
        panel.add(clear);
        setContentPane(panel);
    }

    public class ButtonActionListener implements ActionListener{public void actionPerformed(ActionEvent e) {
        {
            String getValue1 = text1.getText();
            Integer a = Integer.parseInt(getValue1);
            System.out.println(a);

            String getValue2 = text2.getText();
            Integer b = Integer.parseInt(getValue2);
            int res;

            if (sum.getState()){
                res = a+b;
                text3.setText(Integer.toString(res));
            }
            if (sub.getState()){
                res = a-b;
                text3.setText(Integer.toString(res));
            }
            if (pr.getState()){
                res = a*b;
                text3.setText(Integer.toString(res));
            }
            if (del.getState()){
                res = a/b;
                text3.setText(Integer.toString(res));
            }
            if (clear.getState()){
                text1.setText("");
                text2.setText("");
            }
        }
    }

}}




