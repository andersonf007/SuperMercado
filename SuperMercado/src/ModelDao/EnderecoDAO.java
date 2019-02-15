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
import java.sql.SQLException;
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
     
      public void Salvar(PessoaBeans mod){
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO endereco(" +
                                                                   "id_endereco, numerocasa, bairro, cidade, uf, cep, logradouro)" +
                                                                   "VALUES (?, ?, ?, ?, ?, ?, ?);");
            pst.setString(1, mod.getNome());
            pst.setDate(2, new java.sql.Date(mod.getDataNasc().getTime()));
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getTipo());
            pst.setInt(5, mod.getEnd_cod());
            pst.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados do endereço\n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
    }
     
}
