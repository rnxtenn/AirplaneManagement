package AirplaneManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{

    JButton btnreste,btnsubmit, btndlt;
    JTextField tfusername;
    JPasswordField tfpassword;

    public Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(20,30,100,20);
        add(lblusername);

        JLabel lblpassword = new JLabel("password");
        lblpassword.setBounds(20,80,128,40);
        add(lblpassword);

        tfusername = new JTextField();
        tfusername.setBounds(20,60,150,20);
        add(tfusername);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(20,120,150,20);
        add(tfpassword);

        btnreste = new JButton("Reset");
        btnreste.setBounds(20,160,90,30);
        btnreste.addActionListener(this);
        add(btnreste);

        btnsubmit = new JButton("Submit");
        btnsubmit.setBounds(120,160,90,30);
        btnsubmit.addActionListener(this);
        add(btnsubmit);

        btndlt = new JButton("delete");
        btndlt.setBounds(69,200,90,30);
        btndlt.addActionListener(this);
        add(btndlt);

        setVisible(true);
        setSize(600,400);
        setLocation(520,240);
    }
    
    public void Actionperformed(ActionEvent ae){
        
        if (ae.getSource() == btnreste) 
        {
            tfusername.setText("");
            tfpassword.setText("");
        }
        else if (ae.getSource() == btndlt) 
        {
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
