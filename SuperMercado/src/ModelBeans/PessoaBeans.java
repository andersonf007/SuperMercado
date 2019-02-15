/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ander
 */
public class PessoaBeans {
    
    private int codigo;
    private String nome;
    private Date dataNasc;
    private String tipo;
    private String sexo;
    private int end_cod;

    public PessoaBeans(int codigo,String nome,Date dataNasc,String tipo,String sexo,int end_cod
    ){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.tipo= tipo;
        this.sexo = sexo;
        this.end_cod = end_cod;
    }

    public PessoaBeans() {
        throw new UnsupportedOperationException("Erro dentro do Beans de Pessoa"); //To change body of generated methods, choose Tools | Templates.

    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
     * @return the dataNasc
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the end_cod
     */
    public int getEnd_cod() {
        return end_cod;
    }

    /**
     * @param end_cod the end_cod to set
     */
    public void setEnd_cod(int end_cod) {
        this.end_cod = end_cod;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
