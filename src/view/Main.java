package view;

import delegator.Delegator;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
    public Main() {
        super("Main");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.yellow);
        contentPane.setLayout(null);

        JButton button = new JButton("start");
        button.setBounds(110, 400, 150, 50);
        button.setBorder(new LineBorder(Color.black, 2));

        button.addActionListener((ActionEvent e) -> {
            Delegator delegator = Delegator.getInstance();
            delegator.humanController.Login();

            this.dispose();
        });
        contentPane.add(button);

        setBounds(100, 100, 375, 667);
        setResizable(false);
        setVisible(true);
    }
}
