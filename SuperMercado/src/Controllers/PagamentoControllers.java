/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.Pagamento;

/**
 *
 * @author ander
 */
public class PagamentoControllers {
    
    static Pagamento pagamento;
    
    public static void openPagamento(){
        if(pagamento == null)
            pagamento = new Pagamento();
            
        pagamento.setVisible(true);
        
    }
    
    public static void setValorTotal(double valor){
        pagamento.receberValor(valor);
    }
}
