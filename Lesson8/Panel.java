package Lesson8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Panel extends JPanel {
    public Panel() {
        Font font = new Font("Arrial", Font.BOLD, 20);


        JButton button1 = new JButton("Button#1");
        button1.setFont(font);
        add(button1);

        TextField textField = new TextField("+7(999)0000000");
        textField.setFont(font);
        add(textField);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textField.setText(generateTelephoneNumber());
            }
        });

        setVisible(true);
    }
    public String generateTelephoneNumber () {
        Random random = new Random();
        String teleponeNumber = "";
        teleponeNumber += "+7";
        teleponeNumber += "(999)";
        for (int i=0; i<7;i++) {
            teleponeNumber += random.nextInt(10);
        }
        return teleponeNumber;

    }
}
