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
public class CreditoBeans {
    
    private int id_venda;
    private int numeroParcelas;
    private String tipoCartao;
    private Date dataVencimento;

    /**
     * @return the id_venda
     */
    public int getId_venda() {
        return id_venda;
    }

    /**
     * @param id_venda the id_venda to set
     */
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    /**
     * @return the numeroParcelas
     */
    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    /**
     * @return the tipoCartao
     */
    public String getTipoCartao() {
        return tipoCartao;
    }

    /**
     * @param tipoCartao the tipoCartao to set
     */
    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    /**
     * @return the dataVencimento
     */
    public Date getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento the dataVencimento to set
     */
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
}
