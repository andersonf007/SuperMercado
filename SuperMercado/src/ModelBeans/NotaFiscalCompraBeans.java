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
public class NotaFiscalCompraBeans {

    private int notaFiscalCompra;
    private int id_Pessoa;
    private double valor;
    private Date hora;
    private Date dataEmissao;
    private int pesquisar;
    /**
     * @return the notaFiscalCompra
     */
    public int getNotaFiscalCompra() {
        return notaFiscalCompra;
    }

    /**
     * @param notaFiscalCompra the notaFiscalCompra to set
     */
    public void setNotaFiscalCompra(int notaFiscalCompra) {
        this.notaFiscalCompra = notaFiscalCompra;
    }

    /**
     * @return the id_Pessoa
     */
    public int getId_Pessoa() {
        return id_Pessoa;
    }

    /**
     * @param id_Pessoa the id_Pessoa to set
     */
    public void setId_Pessoa(int id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the dataEmissao
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao the dataEmissao to set
     */
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the pesquisar
     */
    public int getPesquisar() {
        return pesquisar;
    }

    /**
     * @param pesquisar the pesquisar to set
     */
    public void setPesquisar(int pesquisar) {
        this.pesquisar = pesquisar;
    }
    
   
}
