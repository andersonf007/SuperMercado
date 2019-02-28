/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.PessoaBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 *
 * @author ander
 */
public class PessoaDAO {
    
    ConexaoBD conexaoBD = new ConexaoBD();
    PessoaBeans mod = new PessoaBeans();
    
    public int Salvar(PessoaBeans mod){
        conexaoBD.conexao();
        int idPessoa = 0;
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO pessoa("+
                                                                   "nome, datanasc, sexo,tipo, end_cod)"+
                                                                   "VALUES (?, ?, ?, ?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1, mod.getNome());
            pst.setDate(2, new java.sql.Date(mod.getDataNasc().getTime()));
            pst.setString(3, mod.getSexo());
            pst.setString(4, mod.getTipo());
            pst.setInt(5, mod.getEnd_cod());
            try{
               pst.executeUpdate();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar! \n Erro: " + e);
            }
            
            //recupera o ultimo ID cadastrado
            ResultSet rs = pst.getGeneratedKeys();
            while(rs.next()){
                idPessoa = rs.getInt(1);
                //JOptionPane.showMessageDialog(null, "id: " + idPessoa);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da pessoa \n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
        return idPessoa;
    }
    
    public PessoaBeans buscaPessoa(PessoaBeans mod) {
        conexaoBD.conexao();
        conexaoBD.executaSql("select * from pessoa where id_pessoa = '" + mod.getPesquisa() + "'");
        try {
            conexaoBD.rs.first();
            mod.setCodigo(conexaoBD.rs.getInt("id_pessoa"));
            mod.setNome(conexaoBD.rs.getString("nome"));
            mod.setDataNasc(conexaoBD.rs.getDate("datanasc"));
            mod.setEnd_cod(conexaoBD.rs.getInt("end_cod"));
            mod.setTipo(conexaoBD.rs.getString("tipo"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel buscar os produtos \n" + ex);
        }
        conexaoBD.desconecta();
        return mod;
    }        
       
}
