package View;

import Controllers.PDVController;
import ModelBeans.ModelTabela;
import ModelBeans.ProdutosBeans;
import ModelBeans.VendaBeans;
import ModelConection.ConexaoBD;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author ander
 */
public class PDV extends javax.swing.JFrame {
    private volatile static PDV pdv;
    ConexaoBD conexaoBD = new ConexaoBD();
    VendaBeans vendaBeans = new VendaBeans();

    String descricao, id, valor, quantidade;
      
    public PDV() {
        initComponents();
        //System.out.println("Criou nova View PDV");
    }
    
    public void recebeProduto2(ProdutosBeans model){   
        jTextFieldCodigo.setText(Integer.toString(model.getId()));
        jLabelDescricao.setText(model.getDescricao());
        jTextFieldValorUnitario.setText(Double.toString(model.getValorVenda()));
        jTextFieldQuantidade.setText(Integer.toString(1));
        getContentPane().repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldValorUnitario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelDescricao = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDeProdutos = new javax.swing.JTable();
        jButtonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQuantidade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldQuantidade);
        jTextFieldQuantidade.setBounds(20, 250, 170, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quantidade:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 220, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 70, 120, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Valor unitário:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 120, 22);

        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(20, 100, 170, 40);

        jTextFieldValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldValorUnitario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorUnitario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jTextFieldValorUnitario);
        jTextFieldValorUnitario.setBounds(20, 170, 170, 40);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(null);

        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabelDescricao);
        jLabelDescricao.setBounds(133, 5, 580, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 800, 40);

        jButton1.setText("F2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 390, 45, 23);

        jTableListaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaDeProdutos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 90, 550, 280);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(120, 300, 110, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 800, 460);

        setSize(new java.awt.Dimension(838, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if(evt.getKeyCode() == 113){
          PDVController.openSelectionProducts(); // Abre Lista dos produtos cadastrados
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BuscarProdutos n = new BuscarProdutos();
        n.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        id = jTextFieldCodigo.getText();
        descricao = jLabelDescricao.getText(); 
        valor = jTextFieldValorUnitario.getText();
        quantidade = jTextFieldQuantidade.getText();
        preencherTabela(id,descricao,quantidade,valor);
    }//GEN-LAST:event_jButtonConfirmarActionPerformed
 
    public void preencherTabela(String id,String descricao, String quantidade, String valor) {
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID", "Descrição", "Quantidade", "Valor"};

//        try {
        //    do{
                dados.add(new Object[]{id, descricao, quantidade, valor});            
        //   while();
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "nao foi possivel baixar a tabela de preencimento da lista de produtos\n" + ex);
//        }
        ModelTabela modelo = new ModelTabela(dados, colunas);

        jTableListaDeProdutos.setModel(modelo);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setPreferredWidth(225);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setPreferredWidth(109);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableListaDeProdutos.getColumnModel().getColumn(3).setResizable(false);
        jTableListaDeProdutos.getTableHeader().setReorderingAllowed(false);
        jTableListaDeProdutos.setAutoResizeMode(jTableListaDeProdutos.AUTO_RESIZE_OFF);
        jTableListaDeProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
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
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaDeProdutos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables

  
    
}
