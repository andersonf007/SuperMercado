/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.PessoaJuridicaBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class PessoaJuridicaDAO {
    
        ConexaoBD conexaoBD = new ConexaoBD();
        PessoaJuridicaBeans mod = new PessoaJuridicaBeans();
     
    public int Salvar(PessoaJuridicaBeans mod){
        conexaoBD.conexao();
        int idJudiciario = 0;
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO fornecedor("+
                                                                   "cnpj, pes_cod)VALUES (?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, mod.getCnpj());
            pst.setInt(2, mod.getPes_cod());
            pst.executeUpdate();
            ResultSet rs = pst.getGeneratedKeys();

            while(rs.next()){
                idJudiciario = rs.getInt(1);
                //JOptionPane.showMessageDialog(null, "id: " + idJudiciario);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da pessoa \n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
        return idJudiciario;
    }
    
}
