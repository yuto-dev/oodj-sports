package com.mycompany.assignment;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
    
    JButton loginButton;
    
    LoginFrame(){
        
        JTextField logintext = new JTextField();    
        loginButton = new JButton("Login");
        loginButton.setBounds(200, 100, 100, 50);
        loginButton.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(360,360);
        this.setTitle("Login");
        this.setVisible(true);
        this.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            System.out.println("potato");
            new HomePage();
            this.dispose();
        }
        
    }
}
