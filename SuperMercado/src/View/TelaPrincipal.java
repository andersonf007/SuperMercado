/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controllers.PDVController;
import ModelConection.ConexaoBD;

/**
 *
 * @author ander
 */

public class TelaPrincipal extends javax.swing.JFrame {
    
    ConexaoBD conecta = new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
        //System.out.println("Entrou na tela principal");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanelInternalFrameBemVindo = new javax.swing.JPanel();
        jLabelPainelFundo = new javax.swing.JLabel();
        jPanelVendas = new javax.swing.JPanel();
        jButtonPdv = new javax.swing.JButton();
        jButtonNfe = new javax.swing.JButton();
        jPanelCadastro = new javax.swing.JPanel();
        jButtonCadPessoas = new javax.swing.JButton();
        jButtonCadProdutos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuVenda = new javax.swing.JMenu();
        jMenuCadastros = new javax.swing.JMenu();
        jRadioButtonMenuItemClientes = new javax.swing.JRadioButtonMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrame1.setTitle("Bem-Vindo");
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jPanelInternalFrameBemVindo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternalFrameBemVindo.setLayout(null);
        jInternalFrame1.getContentPane().add(jPanelInternalFrameBemVindo);
        jPanelInternalFrameBemVindo.setBounds(0, -1, 910, 90);

        jLabelPainelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/internalframe.png"))); // NOI18N
        jInternalFrame1.getContentPane().add(jLabelPainelFundo);
        jLabelPainelFundo.setBounds(4, 84, 900, 260);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 310, 910, 380);

        jPanelVendas.setBackground(new java.awt.Color(204, 255, 255));
        jPanelVendas.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));
        jPanelVendas.setLayout(null);

        jButtonPdv.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPdv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pdv.png"))); // NOI18N
        jButtonPdv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPdvActionPerformed(evt);
            }
        });
        jPanelVendas.add(jButtonPdv);
        jButtonPdv.setBounds(20, 20, 120, 130);

        jButtonNfe.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nfe.png"))); // NOI18N
        jPanelVendas.add(jButtonNfe);
        jButtonNfe.setBounds(170, 20, 120, 130);

        getContentPane().add(jPanelVendas);
        jPanelVendas.setBounds(10, 10, 310, 160);

        jPanelCadastro.setBackground(new java.awt.Color(204, 255, 255));
        jPanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));
        jPanelCadastro.setLayout(null);

        jButtonCadPessoas.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastre-se.png"))); // NOI18N
        jButtonCadPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadPessoasActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonCadPessoas);
        jButtonCadPessoas.setBounds(10, 20, 120, 130);

        jButtonCadProdutos.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Produtos.png"))); // NOI18N
        jButtonCadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadProdutosActionPerformed(evt);
            }
        });
        jPanelCadastro.add(jButtonCadProdutos);
        jButtonCadProdutos.setBounds(160, 20, 120, 130);

        getContentPane().add(jPanelCadastro);
        jPanelCadastro.setBounds(370, 10, 290, 160);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque"));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estoque.png"))); // NOI18N
        jPanel2.add(jButton1);
        jButton1.setBounds(30, 20, 130, 130);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(700, 10, 190, 160);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 930, 500);

        jMenuVenda.setText("Venda");
        jMenuBar1.add(jMenuVenda);

        jMenuCadastros.setText("Cadastros");

        jRadioButtonMenuItemClientes.setSelected(true);
        jRadioButtonMenuItemClientes.setText("Clientes");
        jMenuCadastros.add(jRadioButtonMenuItemClientes);

        jMenuBar1.add(jMenuCadastros);

        jMenuRelatorios.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorios);

        jMenuSair.setText("Sair");
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(927, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPessoasActionPerformed
       CadPessoa Cadpessoa = new CadPessoa();
       Cadpessoa.setVisible(true);
    }//GEN-LAST:event_jButtonCadPessoasActionPerformed

    private void jButtonCadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadProdutosActionPerformed
        CadProdutos Cadprodutos = new CadProdutos();
        Cadprodutos.setVisible(true);
    }//GEN-LAST:event_jButtonCadProdutosActionPerformed

    private void jButtonPdvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPdvActionPerformed
        PDVController.openPDV();
    }//GEN-LAST:event_jButtonPdvActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadPessoas;
    private javax.swing.JButton jButtonCadProdutos;
    private javax.swing.JButton jButtonNfe;
    private javax.swing.JButton jButtonPdv;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelFundo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelInternalFrameBemVindo;
    private javax.swing.JPanel jPanelVendas;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItemClientes;
    // End of variables declaration//GEN-END:variables
}
