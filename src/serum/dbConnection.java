///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package serum;
//
//import com.mysql.cj.xdevapi.Statement;
//import com.sun.jdi.connect.spi.Connection;
//import java.sql.SQLException;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
////import java.util.logging.Level;
////import java.util.logging.Logger;
////import javax.swing.JOptionPane;
//
//
///**
// *
// * @author USER
// */
//public class dbConnection {
//    Connection conn;
//    //Statement statement;
//    PreparedStatement insert;
//    public Connection openConnection() throws SQLException {
//        if(conn == null){
//            String url = "jdbc:mysql://localhost:3306/convserum?zeroDateTimeBehavior=CONVERT_TO_NULL";
//            String database = "convserum";
//            String driver = "com.mysql.cj.jdbc.Driver";
//            String username = "root";
//            String password = "";
//            try{
//                Class.forName(driver);
//                conn = (Connection)DriverManager.getConnection(url+database,username,password);
//                
//                
//                String sql = "INSERT INTO serum(visit_id, fname, jname, lname, dob, ftype, dpt_int,dpt_expected, taken, ifno, other, dpt_serum, label, dss_id) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?";
//                
//                
//                
//                System.out.println("Connection Successful");
//            }
//            catch (ClassNotFoundException | SQLException sqlex){
//                System.out.println("Connection Failed");
//                
//            }
//        }
//        return conn;
//    }
//    
//}
