/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author ander
 */
public class NFE extends javax.swing.JFrame {

    /**
     * Creates new form NFE
     */
    public NFE() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDeNFE = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jLabelNomeCliente1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelDescricaoProduto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooserDataSaida = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableListaDeProdutos = new javax.swing.JTable();
        jLabelValorTotal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(null);

        jTableListaDeNFE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaDeNFE);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 11, 465, 402);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jPanel3.add(jButtonSalvar);
        jButtonSalvar.setBounds(390, 440, 90, 30);

        jLabelNomeCliente1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(jLabelNomeCliente1);
        jLabelNomeCliente1.setBounds(810, 10, 140, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CPF/CNPJ:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(726, 10, 84, 30);

        jLabelDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(jLabelDescricaoProduto);
        jLabelDescricaoProduto.setBounds(560, 60, 180, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Quantidade:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(750, 60, 96, 30);

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(jLabelQuantidade);
        jLabelQuantidade.setBounds(860, 60, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Data de Saida:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(480, 330, 120, 30);
        jPanel3.add(jDateChooserDataSaida);
        jDateChooserDataSaida.setBounds(610, 330, 130, 30);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Produto:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 68, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 50, 50, 30);

        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(jTextFieldValor);
        jTextFieldValor.setBounds(60, 50, 100, 30);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(480, 50, 530, 90);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cliente:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 60, 30);

        jLabelNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jLabelNomeCliente);
        jLabelNomeCliente.setBounds(70, 0, 170, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        jPanel2.add(jButton2);
        jButton2.setBounds(480, 5, 30, 30);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(480, 10, 530, 40);

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
        jScrollPane2.setViewportView(jTableListaDeProdutos);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(480, 140, 530, 180);

        jLabelValorTotal.setBackground(new java.awt.Color(204, 204, 204));
        jLabelValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel3.add(jLabelValorTotal);
        jLabelValorTotal.setBounds(890, 460, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Valor Total:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(790, 460, 100, 30);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonNovo.setText("Novo");
        jPanel3.add(jButtonNovo);
        jButtonNovo.setBounds(10, 440, 90, 30);

        jButtonCancelar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCancelar1.setText("Cancelar");
        jPanel3.add(jButtonCancelar1);
        jButtonCancelar1.setBounds(110, 440, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NFE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NFE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private com.toedter.calendar.JDateChooser jDateChooserDataSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelDescricaoProduto;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNomeCliente1;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableListaDeNFE;
    private javax.swing.JTable jTableListaDeProdutos;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}