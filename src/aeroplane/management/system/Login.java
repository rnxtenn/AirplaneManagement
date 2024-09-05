package aeroplane.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{

    JButton btnreste, btnsubmit, btndlt;
    JTextField tfusername;
    JPasswordField tfpassword;
    JLabel lblusername,lblpassword;

    public Login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        lblusername = new JLabel("Username");
        lblusername.setBounds(20,30,100,20);
        add(lblusername);

        lblpassword = new JLabel("password");
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
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==btnsubmit){
            String lblusername = tfusername.getText();
            String lblpassword = tfpassword.getText();
            
            try{
                createDB d = new createDB();
                
                String query = "select * from login where username='"+lblusername+"' and password='"+lblpassword+"'";
                ResultSet rs = d.s.executeQuery(query);
                
                if(rs.next()){
                    System.out.println("valid");
                }else{
                    JOptionPane.showMessageDialog(null,"invalid username and password");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }        
        else if (ae.getSource() == btnreste) 
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

