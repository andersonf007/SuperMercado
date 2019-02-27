/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author ander
 */
public class ItensNFBeans {

    private int id_Produtos;
    private int id_NotaFiscalCompra;
    private String nome;
    private double ValorUnitario;
    private double ValorTotal;
    private int quantidade;
    private int pesquisar;

    /**
     * @return the id_Produtos
     */
    public int getId_Produtos() {
        return id_Produtos;
    }

    /**
     * @param id_Produtos the id_Produtos to set
     */
    public void setId_Produtos(int id_Produtos) {
        this.id_Produtos = id_Produtos;
    }

    /**
     * @return the id_NotaFiscalCompra
     */
    public int getId_NotaFiscalCompra() {
        return id_NotaFiscalCompra;
    }

    /**
     * @param id_NotaFiscalCompra the id_NotaFiscalCompra to set
     */
    public void setId_NotaFiscalCompra(int id_NotaFiscalCompra) {
        this.id_NotaFiscalCompra = id_NotaFiscalCompra;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ValorUnitario
     */
    public double getValorUnitario() {
        return ValorUnitario;
    }

    /**
     * @param ValorUnitario the ValorUnitario to set
     */
    public void setValorUnitario(double ValorUnitario) {
        this.ValorUnitario = ValorUnitario;
    }

    /**
     * @return the ValorTotal
     */
    public double getValorTotal() {
        return ValorTotal;
    }

    /**
     * @param ValorTotal the ValorTotal to set
     */
    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
