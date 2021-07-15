package controles;

import visoes.VisaoGasto;
import visoes.VisaoLeitura;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ControleMenu {
    private int op;
    public ControleMenu (){

    }
    public ControleMenu (int op){
        this.op = op;
    }

    public void trataOpcao (int op) throws IOException {
            switch (op) {
                case 1:
                    //Caso o usuário tenha escolhido 1 como opção entra nesse case
                    //Responsável pela inserção de despesas no arquivo
                    VisaoGasto visaoGasto = new VisaoGasto(); //Temos a criação desse objeto
                    visaoGasto.preencheDados(); //Mostra ao usuário as informações que devem ser preenchidas
                                                //para a inserção dos dados no arquivo.
                    break;
                case 2:
                    //Caso o usuário tenha escolhido 2 como opção entra nesse case
                    //Responsável pela leitura e exibição de dados para o usuário
                    VisaoLeitura visaoLeitura = new VisaoLeitura(); //Criação do objeto
                    visaoLeitura.leituraDeArquivo(); //Chama o método que irá ler o arquivo
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Ops... Opção invalida tente novamente");


            }//Fim switch

    }
}
