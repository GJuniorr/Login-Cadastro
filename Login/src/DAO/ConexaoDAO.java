/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author JC
 */
public class ConexaoDAO {
    public Connection ConectaBD(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"ConexaoDAO" + erro.getMessage());
        }
        return conn;   
    }    
}
