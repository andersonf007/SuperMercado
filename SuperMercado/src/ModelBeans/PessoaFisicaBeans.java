/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;

/**
 *
 * @author ander
 */
public class PessoaFisicaBeans extends PessoaBeans{
    
    private String cnpj;
    
    /*
    public PessoaFisicaBeans (int codigo,String nome,Date dataNasc,String tipo,String sexo,int end_cod,String cnpj){
        super(codigo,nome,dataNasc,tipo,sexo,end_cod);
        this.cnpj = cnpj;
    }*/

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
