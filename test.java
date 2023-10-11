package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class test extends JFrame {
  JDateChooser dateChooser;  JButton next;
  JTextField name;
    test(){

        
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(850,800);
        
         JLabel name = new JLabel("Select Date");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(250, 80, 120, 30);
        add(name);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(400, 80, 180, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        getContentPane().add(dateChooser);


         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("railway",Font.BOLD,14));
        next.setBounds(500,150,80,30);
        next.addActionListener(new ActionListener(){
            public  void actionPerformed(ActionEvent ae) {


            }

        });
        

        add(next);

       }
    

    public static void main(String[] args) {
        new test().setVisible(true);
        
    }
}
