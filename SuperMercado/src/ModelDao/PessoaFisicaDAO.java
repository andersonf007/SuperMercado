/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.PessoaFisicaBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class PessoaFisicaDAO {
    
     ConexaoBD conexaoBD = new ConexaoBD();
     PessoaFisicaBeans mod = new PessoaFisicaBeans();
     
    public void Salvar(PessoaFisicaBeans mod){
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO funcionario(" +
                                                                   "cpf, cargo, rg, datadmissao, salario, pes_cod)" +
                                                                   "VALUES (?, ?, ?, ?, ?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, mod.getCpf());
            pst.setString(2, mod.getCargo());
            pst.setString(3, mod.getRg());
            pst.setDate(4, new java.sql.Date(mod.getDataAdmissao().getTime()));
            pst.setString(5, mod.getSalario());
            pst.setInt(6, mod.getPes_cod());
            try{
               pst.executeUpdate();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar! \n Erro: " + e);
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da pessoa \n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
       
    }
    
}
