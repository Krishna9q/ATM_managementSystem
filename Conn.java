package BankManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class Conn {
    String formnoD;
    private  String  nameD;
    private  String fathers_nameD;
    private  String dobD;
    private  String genderD;
    private  String emailD;
    private  String marritalD;
    private  String addressD;
    private  String cityD;
    private  String statesD;
    private  String pinD;



// COnstructor
    public Conn(
            String formno,String  name,
            String fathers_name, String dob, String gender,
            String email, String marital, String address,
            String city, String states, String pin)
    {
         this.formnoD = formno;
         this.nameD = name;
        this.fathers_nameD = fathers_name;
        this.dobD = dob;
        this.genderD = gender;
        this.emailD = email;
        this.marritalD = marital;
        this.addressD = address;
        this.cityD = city;
        this.statesD = states;
        this.pinD = pin;
    }
    
    
    Boolean inceert() {
        Boolean isInserted = false;
       

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms", "root", "Krishna@bca");
        //    System.out.println(con.isClosed());

        String q = "insert into signup(formno,name,father_name,dob,gender,email,marital_status,address,city,state,pin) values (?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement    s= con.prepareStatement(q);
         s.setString(1, formnoD);
         s.setString(2, nameD);  
         s.setString(3, fathers_nameD);
         s.setString(4, dobD);
         s.setString(5, genderD);
         s.setString(6, emailD);
         s.setString(7, marritalD);
         s.setString(8, addressD);
         s.setString(9, cityD);
         s.setString(10, statesD);
         s.setString(11, pinD);
           
         s.executeUpdate();
         isInserted = true;
         s.close();
           
            
        } catch (Exception e) {

            e.printStackTrace();
        }
        return isInserted;
    }

     public static void main(String[] args) {
        
        //  Conn c = new Conn("\"1000\"","\"Kuldeep\"","\"ds\"","\"2322\"","\"egver\"","\"gvd\"","\"eger\"","\"dg\"","\"vreg\"","\"fsgfs\"","\"1421\"");
        
        //  System.out.println(c.inceert());
       
     }
    
}
