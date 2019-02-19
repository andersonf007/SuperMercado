/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;


import ModelBeans.ProdutosBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class ProdutosDAO {
    
    ConexaoBD conexaoBD = new ConexaoBD();
    ProdutosBeans mod = new ProdutosBeans();
     
    public void Salvar(ProdutosBeans mod){
        
        conexaoBD.conexao();
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO produto(" +
                                                                   "descricao, quantidadeestoque, valorcompra,valorvenda)" +
                                                                   "VALUES (?, ?, ?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, mod.getDescricao());
            pst.setInt(2, mod.getEstoque());
            pst.setDouble(3, mod.getValorCompra());
            pst.setDouble(4, mod.getValorVenda());            
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
