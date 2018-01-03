package view;

import delegator.Delegator;
import dto.HumanDto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    JTextField id;

    JButton signIn;

    public Login(){
        super("Login");
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.yellow);
        contentPane.setLayout(null);

        JLabel title = new JLabel("Sign In");
        title.setBounds(150, 68, 200, 20);
        contentPane.add(title);


        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(100, 170, 50, 20);
        contentPane.add(idLabel);

        id = new JTextField();
        id.setBounds(100, 210, 150, 20);
        contentPane.add(id);

        signIn = new JButton("SIGN IN");
        signIn.setBounds(100, 400, 150, 20);
        signIn.addActionListener((ActionEvent e)->{
            Delegator delegator = Delegator.getInstance();


            delegator.roomController.RoomList();

            this.dispose();
        });
        contentPane.add(signIn);


        setBounds(100, 100, 375, 667);
        setResizable(false);
        setVisible(true);
    }

}
