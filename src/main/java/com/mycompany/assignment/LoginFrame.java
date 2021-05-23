package com.mycompany.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LoginFrame extends JFrame implements ActionListener {
    
    JButton loginButton;
    
    LoginFrame(){
        
        loginButton = new JButton();
        loginButton.setBounds(200, 100, 100, 50);
        loginButton.addActionListener(this);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(360,360);
        this.setTitle("Login");
        this.setVisible(true);
        this.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            System.out.println("potato");
        }
        
    }
}
