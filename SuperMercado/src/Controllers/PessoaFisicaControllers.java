/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.BuscarPessoaFisica;

/**
 *
 * @author ander
 */
public class PessoaFisicaControllers {
    
    static BuscarPessoaFisica pessoaFisica;
    
    public static void openBuscarPessoaFisica(){
        if(pessoaFisica == null)
            pessoaFisica = new BuscarPessoaFisica();
        
        pessoaFisica.setVisible(true);
    }
    
}
