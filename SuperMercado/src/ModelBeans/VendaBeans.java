/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;
import java.util.Date;

public class VendaBeans {
    
    private int id_pessoa;
    private Date dataVenda;
    private double valor;

    /**
     * @return the id_pessoa
     */
    public int getId_pessoa() {
        return id_pessoa;
    }

    /**
     * @param id_pessoa the id_pessoa to set
     */
    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
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
    
    
    
}
