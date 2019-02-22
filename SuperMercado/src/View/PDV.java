package View;

import ModelBeans.ProdutosBeans;
import ModelBeans.VendaBeans;
import ModelConection.ConexaoBD;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class PDV extends javax.swing.JFrame {
    private volatile static PDV pdv;
    ConexaoBD conexaoBD = new ConexaoBD();
    VendaBeans vendaBeans = new VendaBeans();
    
    public PDV() {
        initComponents();
        System.out.println("Entrou");
    }
    
    static PDV getInstance() {
        synchronized (PDV.class) {
            if (pdv == null) {
                synchronized (PDV.class) {
                    pdv = new PDV();
                }

            }
        }

        return pdv;
    }
    public PDV(ProdutosBeans model){
        initComponents();
        System.out.println("Entrou 2");
        this.jTextFieldCodigo.setText(Integer.toString(model.getId()));
        this.jLabelDescricao.setText("este qualqer"); //(model.getDescricao()
        this.jTextFieldValorUnitario.setText(Double.toString(model.getValorVenda()));
        this.jTextFieldQuantidade.setText(Integer.toString(1));
       
    }
    
    public void recebeProduto2(ProdutosBeans model){
        
        jTextFieldCodigo.setText(Integer.toString(model.getId()));
        jLabelDescricao.setText("este qualqer"); //(model.getDescricao()
        jTextFieldValorUnitario.setText(Double.toString(model.getValorVenda()));
        jTextFieldQuantidade.setText(Integer.toString(1));
        getContentPane().repaint();
        JOptionPane.showMessageDialog(null, model.getDescricao());
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);
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

        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(20, 100, 170, 40);
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

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 11, 800, 460);

        setSize(new java.awt.Dimension(838, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if(evt.getKeyCode() == 113){
           
        BuscarProdutos n = new BuscarProdutos(this);
        n.setVisible(true);
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        BuscarProdutos n = new BuscarProdutos(this);
        n.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
 
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
              //  new PDV().setVisible(true);
            
                pdv.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables

  
    
}
