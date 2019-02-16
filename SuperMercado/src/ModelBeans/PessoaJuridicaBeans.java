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
public class PessoaJuridicaBeans{
    
    private String cnpj;
    private int pes_cod;
    
    /*
    public PessoaJuridicaBeans (int codigo,String nome,Date dataNasc,String tipo,String sexo,int end_cod,String cnpj){
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

    /**
     * @return the pes_cod
     */
    public int getPes_cod() {
        return pes_cod;
    }

    /**
     * @param pes_cod the pes_cod to set
     */
    public void setPes_cod(int pes_cod) {
        this.pes_cod = pes_cod;
    }
}
