package Controllers;

import ModelBeans.PessoaBeans;
import ModelBeans.PessoaFisicaBeans;
import ModelBeans.ProdutosBeans;
import View.BuscarPessoaFisica;
import View.BuscarProdutos;
import View.PDV;
import View.Pagamento;


/**
 * @createdAt 22/02/2019
 * @internal Controla requisições geradas pela view, carregando os models 
 * necessários e retornando para a view novamente.
 * @author José Henrique Gregorio <henriquegreg45@gmail.com>
 */
public class PDVController {
    static PDV pdv;
    
    /*
    * Método cria uma instância única da tela PDV por clique na tela principal
    * @see View.TelaPrincipal LINHA 170
    * @author José Henrique Gregorio <henriquegreg45@gmail.com>
    */
    public static void openPDV(){
        if(pdv == null)
            pdv = new PDV();
        
        pdv.setVisible(true);
    }
    /*
    * Abre Janelinha com a tabela de produtos
    * @author José Henrique Gregorio <henriquegreg45@gmail.com>
    */
    public static void openSelectionProducts(){
        new BuscarProdutos().setVisible(true);
    }
    
    /*
    * Aplica dados recebidos na view (PDV) 
    * @see View.BuscarProdutos - LINHA 65
    * @author José Henrique Gregorio <henriquegreg45@gmail.com>
    */
    public static void setInfoProd(ProdutosBeans model){
        pdv.recebeProduto(model);
    }
    
    public static void setInfoPessoa(PessoaBeans modelPessoa, PessoaFisicaBeans modelPessoaFisica){
        pdv.recebeDadosPessoaFisica(modelPessoa,modelPessoaFisica);
    }
    
    public static void setInfoPag(String FormaDePagamento, String valorTotal){
        pdv.finalizacaoDeCompra(FormaDePagamento, valorTotal);
    }
}
