package javaLevel1Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game extends JFrame {
    public Game () {
        setBounds(100,100,400,400);
        setTitle("Game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextArea area = new JTextArea();
        //area.setFont(new Font("Dialog", Font.PLAIN, 14));
        //area.setTabSize(10);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        add(area, BorderLayout.CENTER);

        JButton button = new JButton("Action");
        add(button, BorderLayout.PAGE_END);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(area.getText());
            }
        });
        setVisible(true);


    }

    public static void main(String[] args){
        new Game();
    }
}
