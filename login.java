package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class login extends JFrame implements ActionListener {
    JButton login, signup , clear;
    JTextField CardTextField;
    JPasswordField PinTextField;
    login(){
        setTitle(" ATM Machine ");

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);

        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osword",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardNo = new JLabel("Card No:");
        cardNo.setFont(new Font("Railway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);
//
        CardTextField = new JTextField();
        CardTextField.setBounds(300, 150, 230, 30);
        CardTextField.setFont(new Font("Arial",Font.BOLD,28));
        add(CardTextField);


        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Osword",Font.BOLD,28));
        pin.setBounds(120,220,250,30);
        CardTextField.setFont(new Font("Arial",Font.BOLD,28));
        add(pin);

        PinTextField = new JPasswordField();
        PinTextField.setBounds(300, 220, 230, 30);
        PinTextField.setFont(new Font("Arial",Font.BOLD,28));
        add(PinTextField);
 
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

    
        getContentPane().setBackground(Color.WHITE);

        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == login){

        }
        else if(ae.getSource() == clear){
            CardTextField.setText("");
            PinTextField.setText("");
        }
        else if(ae.getSource() == signup){
                setVisible(false);
                SignupOne s = new SignupOne();
        }
        
    }
    


   public static void main(String[] args) {
        new login();
   }


    
}
