package View;

import Controllers.PDVController;
import ModelBeans.ModelTabela;
import ModelBeans.ProdutosBeans;
import ModelConection.ConexaoBD;
import ModelDao.ProdutosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ander
 */
public class BuscarProdutos extends javax.swing.JFrame {
      
    ConexaoBD conecta = new ConexaoBD();
    ProdutosBeans produtoBeans = new ProdutosBeans();
    ProdutosDAO controlProduto = new ProdutosDAO();
    
    public BuscarProdutos() {
        initComponents();
        preencherTabela("SELECT id_produto, descricao, quantidadeestoque, valorvenda FROM produto order by descricao;");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 14, 490, 275);

        setSize(new java.awt.Dimension(520, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
        String id_produto =""+jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(),0);
        produtoBeans.setPesquisa(id_produto);
        ProdutosBeans model = controlProduto.buscaProduto(produtoBeans);
        PDVController.setInfoProd(model);
       // this.pdv.recebeProduto2(model);
        this.dispose();
    }//GEN-LAST:event_jTableProdutosMouseClicked

    public void preencherTabela(String sql) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Descrição", "V. Venda", "Estoque"};

        conecta.conexao();
        conecta.executaSql(sql);

        try {
            conecta.rs.first();
            do {

                dados.add(new Object[]{conecta.rs.getInt("id_produto"), conecta.rs.getString("descricao"), conecta.rs.getDouble("valorvenda"), conecta.rs.getDouble("quantidadeestoque")});

            } while (conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento dos produtos\n" + ex);
        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableProdutos.setModel(modelo);
        jTableProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(2).setPreferredWidth(109);
        jTableProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTableProdutos.getTableHeader().setReorderingAllowed(false);
        jTableProdutos.setAutoResizeMode(jTableProdutos.AUTO_RESIZE_OFF);
        jTableProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProdutos().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    // End of variables declaration//GEN-END:variables
}
