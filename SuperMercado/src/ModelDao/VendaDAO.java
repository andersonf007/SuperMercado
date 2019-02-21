/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDao;

import ModelBeans.PessoaBeans;
import ModelBeans.VendaBeans;
import ModelConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class VendaDAO {
    
    Date d = new Date();
    //Calendar cal = new GregorianCalendar();
    ConexaoBD conexaoBD = new ConexaoBD();
    VendaBeans mod = new VendaBeans();
    
    
    public int Salvar(VendaBeans mod){
        conexaoBD.conexao();
        int idvenda = 0;
        
        try {
            PreparedStatement pst = conexaoBD.con.prepareStatement("INSERT INTO venda(" +
                                                                   "datavenda, valor, pes_cod)" +
                                                                   "VALUES (?, ?, ?);",PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setDate(1, new java.sql.Date(mod.getDataVenda().getTime()));
            pst.setDouble(2, mod.getValor());
            pst.setInt(3, mod.getId_pessoa());
            try{
               pst.executeUpdate();
               
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar! \n Erro: " + e);
            }
            
            //recupera o ultimo ID cadastrado
            ResultSet rs = pst.getGeneratedKeys();
            while(rs.next()){
                idvenda = rs.getInt(1);
                //JOptionPane.showMessageDialog(null, "id: " + idPessoa);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel inserir os dados da pessoa \n Erro: " + ex);
        }
        
        conexaoBD.desconecta();
        return idvenda;
    }
    
    private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    return dateFormat.format(date);
}
    
}
