/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.CreditoBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class CreditoDAO {
    
    ConexaoBD conexaoBD = new ConexaoBD();
    CreditoBeans mod = new CreditoBeans();
    
public void Salvar(CreditoBeans mod){
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO credito(numeroparcela,"+
                                                                   "tipocartao, datavencimento, ven_cod)\n" +
                                                                   "VALUES (?, ?, ?, ?);",
                                                                   PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setInt(1, mod.getNumeroParcelas());
            pst.setString(2, mod.getTipoCartao());
            pst.setDate(3, new java.sql.Date(mod.getDataVencimento().getTime()));
            pst.setInt(4, mod.getId_venda());
            pst.executeUpdate();
               
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da venda \n Erro: " + ex);
        }
        conexaoBD.desconecta();
};
    
}
