package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {
    static int counter = 0;
    public App (){
        setTitle ("Моё первое оконное приложение");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,400);

        add(new Panel(), BorderLayout.NORTH);

        setVisible(true);
    }


}
