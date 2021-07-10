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
                    //Inserir despesa
                    VisaoGasto visaoGasto = new VisaoGasto();
                    visaoGasto.preencheDados();

                    break;
                case 2:
                    //Leitura/Exibição de Gastos
                    VisaoLeitura visaoLeitura = new VisaoLeitura();
                    visaoLeitura.leituraDeArquivo();
                    break;
                case 3:
                    System.out.println("Entrei");
                    break;
                default:
                    System.out.println("Ops... Opção invalida tente novamente");


            }//Fim switch

    }
}
