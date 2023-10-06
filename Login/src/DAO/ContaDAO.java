/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DAO.ConexaoDAO;
import DTO.ContaDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author JC
 */
public class ContaDAO {
    Connection conn;
    PreparedStatement pstm;
    ArrayList<ContaDTO> lista = new ArrayList<>();
    
    public void CadastrarConta(ContaDTO objcontadto){
        String sql = "insert into contas (Login, Senha) values (?, ?)";
        conn = new ConexaoDAO().ConectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcontadto.getLogin());
            pstm.setString(2, objcontadto.getSenha());
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO" + erro.getMessage());
        }
    
    
    }
    
    public ResultSet FazerLogin(ContaDTO objcontadto){
        conn = new ConexaoDAO().ConectaBD();       
        
        try {
            String sql = "select * from contas where Login = ? and Senha = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcontadto.getLogin());
            pstm.setString(2, objcontadto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"FazerLoginCONTADAO" + erro);
            return null;
        }
    
    }
    
}
