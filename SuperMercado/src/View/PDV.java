package View;

import Controllers.PDVController;
import Controllers.PagamentoControllers;
import Controllers.PessoaFisicaControllers;
import ModelBeans.ModelTabela;
import ModelBeans.PessoaBeans;
import ModelBeans.PessoaFisicaBeans;
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
    ArrayList lista = new ArrayList();    
    String descricao, id, valor, quantidade;
    double total =0;
      
    public PDV() {
        initComponents();
        jTextFieldCodigo.requestFocus();
        //System.out.println("Criou nova View PDV");
    }
    
    public void recebeProduto(ProdutosBeans model){   
        jTextFieldCodigo.setText(Integer.toString(model.getId()));
        jLabelDescricao.setText(model.getDescricao());
        jTextFieldValorUnitario.setText(Double.toString(model.getValorVenda()));
        jTextFieldQuantidade.setText(Integer.toString(1));
        getContentPane().repaint();   
    }

    public void recebeDadosPessoaFisica(PessoaBeans modelPessoa, PessoaFisicaBeans modelPessoaFisica){
        jLabelNome.setText(modelPessoa.getNome());
        jLabelCpf.setText(modelPessoaFisica.getCpf());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDeProdutos = new javax.swing.JTable();
        jButtonConfirmar = new javax.swing.JButton();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonFinalizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jLabelInformarCliente = new javax.swing.JLabel();

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
        jScrollPane1.setBounds(240, 90, 540, 280);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConfirmar);
        jButtonConfirmar.setBounds(120, 300, 110, 30);

        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setEnabled(false);
        jPanel1.add(jTextFieldTotal);
        jTextFieldTotal.setBounds(629, 380, 150, 40);

        jButtonFinalizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonFinalizar.setText("Finalizar");
        jButtonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFinalizar);
        jButtonFinalizar.setBounds(670, 430, 150, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 380, 50, 20);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabelNome);
        jLabelNome.setBounds(50, 380, 190, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 380, 30, 20);

        jLabelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabelCpf);
        jLabelCpf.setBounds(280, 380, 190, 20);

        jLabelInformarCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInformarCliente.setText("Informar o cliente");
        jLabelInformarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInformarClienteMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelInformarCliente);
        jLabelInformarCliente.setBounds(60, 350, 110, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 820, 480);

        setSize(new java.awt.Dimension(838, 518));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if(evt.getKeyCode() == 113){
          PDVController.openSelectionProducts(); // Abre Lista dos produtos cadastrados
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        //Chama a função para preencher a lista (Tabela)
        preencherTabela();
        jTextFieldCodigo.setText("");
        jLabelDescricao.setText("");
        total += Double.parseDouble(jTextFieldValorUnitario.getText());
        jTextFieldTotal.setText(Double.toString(total));
        jTextFieldValorUnitario.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldCodigo.requestFocus();        
        
        
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarActionPerformed
        PagamentoControllers.openPagamento();
        PagamentoControllers.setValorTotal(total);//transferir o valor total para a tela de pagamento
    }//GEN-LAST:event_jButtonFinalizarActionPerformed

    private void jLabelInformarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInformarClienteMouseClicked
       PessoaFisicaControllers.openBuscarPessoaFisica();
    }//GEN-LAST:event_jLabelInformarClienteMouseClicked
    
    /*Função Incrementa a lista de produtos na view*/
    public void preencherTabela() {
           
           String id = jTextFieldCodigo.getText();
           String descricao = jLabelDescricao.getText(); 
           String valor = jTextFieldValorUnitario.getText();
           String quantidade = jTextFieldQuantidade.getText();
          
           
        String[] colunas = new String[]{"ID", "Descrição", "Quantidade", "Valor"};

        lista.add(new Object[]{id, descricao, quantidade, valor});            

        ModelTabela modelo = new ModelTabela(lista, colunas);

        jTableListaDeProdutos.setModel(modelo);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableListaDeProdutos.getColumnModel().getColumn(0).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setPreferredWidth(325);
        jTableListaDeProdutos.getColumnModel().getColumn(1).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableListaDeProdutos.getColumnModel().getColumn(2).setResizable(false);
        jTableListaDeProdutos.getColumnModel().getColumn(3).setPreferredWidth(78);
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
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelInformarCliente;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaDeProdutos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValorUnitario;
    // End of variables declaration//GEN-END:variables

  
    
}
