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
    
    public ProdutosBeans buscaProduto(ProdutosBeans mod) {
        conexaoBD.conexao();
        conexaoBD.executaSql("select * from produto where id_produto = '" + mod.getPesquisa() + "'");
        try {
            conexaoBD.rs.first();
            mod.setId(conexaoBD.rs.getInt("id_produto"));
            mod.setDescricao(conexaoBD.rs.getString("descricao"));
            mod.setValorCompra(conexaoBD.rs.getDouble("valorcompra"));
            mod.setValorVenda(conexaoBD.rs.getDouble("valorvenda"));
            mod.setEstoque(conexaoBD.rs.getInt("quantidadeestoque"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar os produtos \n" + ex);
        }
        conexaoBD.desconecta();
        return mod;
    }
}