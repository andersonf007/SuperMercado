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
public class Pagamento extends javax.swing.JFrame {
    private volatile static Pagamento pagamento;
    
    /** Creates new form Pagamento */
    public Pagamento() {
        initComponents();
    }
    
    public void receberValor(double valor){
        jTextFieldValorTotal.setText(Double.toString(valor));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldValorTotal = new javax.swing.JTextField();
        jComboBoxFormaPagamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jPanel2.add(jButtonCancelar);
        jButtonCancelar.setBounds(340, 310, 130, 40);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(200, 310, 130, 40);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Valor Total:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 100, 20);

        jTextFieldValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldValorTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorTotal.setEnabled(false);
        jPanel1.add(jTextFieldValorTotal);
        jTextFieldValorTotal.setBounds(20, 40, 200, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(230, 10, 240, 110);

        jComboBoxFormaPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão De Credito", "Cartão De Debito" }));
        jPanel2.add(jComboBoxFormaPagamento);
        jComboBoxFormaPagamento.setBounds(20, 110, 180, 40);

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 80, 180, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 480, 360);

        setSize(new java.awt.Dimension(493, 396));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboBoxFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldValorTotal;
    // End of variables declaration//GEN-END:variables

}
