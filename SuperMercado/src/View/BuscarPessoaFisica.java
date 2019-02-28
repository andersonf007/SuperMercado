/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ModelBeans.ModelTabela;
import ModelConection.ConexaoBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ander
 */
public class BuscarPessoaFisica extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    
    public BuscarPessoaFisica() {
        initComponents();
        preencherTabela("SELECT p.id_pessoa, p.nome, f.cpf FROM pessoa p, funcionario f WHERE p.id_pessoa = f.pes_cod");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaPessoasFisicas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jTableListaPessoasFisicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaPessoasFisicas);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 10, 460, 310);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 320);

        setSize(new java.awt.Dimension(404, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Nome", "CPF"};

        conecta.conexao();
        conecta.executaSql(sql);

        try {
            conecta.rs.first();
            do {

                dados.add(new Object[]{conecta.rs.getInt("id_pessoa"), conecta.rs.getString("nome"), conecta.rs.getString("cpf")});

            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento dos produtos\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableListaPessoasFisicas.setModel(modelo);
        jTableListaPessoasFisicas.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableListaPessoasFisicas.getColumnModel().getColumn(0).setResizable(false);
        jTableListaPessoasFisicas.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableListaPessoasFisicas.getColumnModel().getColumn(1).setResizable(false);
        jTableListaPessoasFisicas.getColumnModel().getColumn(2).setPreferredWidth(109);
        jTableListaPessoasFisicas.getColumnModel().getColumn(2).setResizable(false);
        jTableListaPessoasFisicas.getTableHeader().setReorderingAllowed(false);
        jTableListaPessoasFisicas.setAutoResizeMode(jTableListaPessoasFisicas.AUTO_RESIZE_OFF);
        jTableListaPessoasFisicas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        conecta.desconecta();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPessoaFisica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPessoaFisica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaPessoasFisicas;
    // End of variables declaration//GEN-END:variables
}
