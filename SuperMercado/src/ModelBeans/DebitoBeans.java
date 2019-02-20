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
public class DebitoBeans {
    
    private int id_venda;
    private Date dataPagamento;
    private String tipoCartao;

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
     * @return the dataPagamento
     */
    public Date getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
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
    
    
}
