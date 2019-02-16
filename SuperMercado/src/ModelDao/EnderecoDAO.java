/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.EnderecoBeans;
import ModelBeans.PessoaBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class EnderecoDAO {
    
     ConexaoBD conexaoBD = new ConexaoBD();
     EnderecoBeans mod = new EnderecoBeans();
     ResultSet resultSet;
     
      public int Salvar(EnderecoBeans mod){
        conexaoBD.conexao();
        int idEndereco = 0;
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO endereco(" +
                                                                   "numerocasa, bairro, cidade, uf, cep, logradouro)" +
                                                                   "VALUES (?, ?, ?, ?, ?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, mod.getNumeroCasa());
            pst.setString(2, mod.getBairro());
            pst.setString(3, mod.getCidade());
            pst.setString(4, mod.getUf());
            pst.setString(5, mod.getCep());
            pst.setString(6, mod.getLogradouro());
            try{
               pst.executeUpdate();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar! \n Erro: " + e);
            }
            
            //recupera o ultimo ID cadastrado
            ResultSet rs = pst.getGeneratedKeys();
            while(rs.next()){
                idEndereco = rs.getInt(1);
                //JOptionPane.showMessageDialog(null, "id: " + idEndereco);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados do endereço\n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
        return idEndereco;
    }

   
     
}
