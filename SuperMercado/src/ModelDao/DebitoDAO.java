/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.DebitoBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class DebitoDAO {
    
    ConexaoBD conexaoBD = new ConexaoBD();
    DebitoBeans mod = new DebitoBeans();
    
public void Salvar(DebitoBeans mod){
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO debito(datapagamento,"+
                                                                   "tipocartao, ven_cod)VALUES (?, ?, ?);",
                                                                   PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setDate(1, new java.sql.Date(mod.getDataPagamento().getTime()));
            pst.setString(2, mod.getTipoCartao());
            pst.setInt(3, mod.getId_venda());
            pst.executeUpdate();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da venda \n Erro: " + ex);
        }
        conexaoBD.desconecta();
};

}
