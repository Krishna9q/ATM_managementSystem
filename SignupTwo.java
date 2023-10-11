package BankManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener {

    
    JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,Female,Married,Unmarrid,other,otherss;
    JDateChooser dateChooser;
    SignupTwo(){
        setLayout(null);
        setTitle("New Account Application Form page 2");
      
      

        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details");
        AdditionalDetails.setFont(new Font("Railway",Font.BOLD,22));
        AdditionalDetails.setBounds(290, 80, 400, 30);
        add(AdditionalDetails);

        //1
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valReligion [] = {"Select","Hindu","Muslim","Sikh", "Christian","Other"};
        JComboBox religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        

        JLabel fname = new JLabel("Catagory:");
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Railway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
         Female = new JRadioButton("Female");
           Female.setBounds(450, 290, 120, 30);
           Female.setBackground(Color.white);
           add(Female);
           otherss = new JRadioButton("other");
           otherss.setBounds(600,290,120,30);
        otherss.setBackground(Color.white);
        add(otherss);

           ButtonGroup gendeGroup = new ButtonGroup();
           gendeGroup.add(Female);
           gendeGroup.add(male);
           gendeGroup.add(otherss);


        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);


        Married = new JRadioButton("Married");
        Married.setBounds(300, 390, 100, 30);
        Married.setBackground(Color.white);
        add(Married);

        Unmarrid = new JRadioButton("Unmarrid");
        Unmarrid.setBounds(450, 390, 100, 30);
        Unmarrid.setBackground(Color.white);
        add(Unmarrid);
        other = new JRadioButton("Other");
        other.setBounds(600, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);
          
           ButtonGroup marritalgroup = new ButtonGroup();
           marritalgroup.add(Unmarrid);
           marritalgroup.add(Married);
           marritalgroup.add(other);


        JLabel address = new JLabel("Pan No:");
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("Adhar NO:");
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);


        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300, 540, 400, 30);
        add( stateTextField);

        JLabel pincode = new JLabel("Excisting Account:");
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Railway",Font.BOLD,14));
        pinTextField.setBounds(300, 590, 400, 30);
        add( pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("railway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
        String name = nameTextField.getText();
       
        String fname = fnameTextField.getText();
        if(fname.equals("")){
            JOptionPane.showMessageDialog(null, "Father's Name is Required");
        } 
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
       
        String gender = null;
        if(male.isSelected()){
            gender = "Male";

        }else if(Female.isSelected()){
            gender = "Female";
        }
       
        String email = emailTextField.getText();
        
        String marital = null;
        if(Married.isSelected()){
            marital = "Married";
        }
        else if(Unmarrid.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
       
        String address = addressTextField.getText();
        
        String city  = cityTextField.getText();
       
        String state = stateTextField.getText();
       
        String pin = pinTextField.getText();
        
try{
    if(name.equals("")){
        JOptionPane.showMessageDialog(null, "Name is Required");
    // } else{
    //     Conn c = new Conn(formno,name,fname,dob,gender,email,marital,address,city,state,pin);
    //     if(c.inceert()) {
    //        JOptionPane.showMessageDialog(null, "Signup Successfully");
    //     }else {
    //          JOptionPane.showMessageDialog(null, "Not");
    //     }
      
        
    }
        
    }
    catch(Exception e){
        System.out.println(e);
    }
    }

    public static void main(String[] args) {
        new SignupTwo();
    }
}
