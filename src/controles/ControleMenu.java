package controles;

import visoes.VisaoGasto;

import java.io.File;
import java.io.IOException;

public class ControleMenu {
    private int op;
    public ControleMenu (){

    }
    public ControleMenu (int op){
        this.op = op;
    }

    public void trataOpcao (int op) throws IOException {
        switch (op){
            case 1:
                //Inserir despesa
                VisaoGasto visaoGasto = new VisaoGasto();
                //File arquivo = new File("Teste.txt");
                visaoGasto.preencheDados();

                break;
            case 2:
                System.out.println("Entrei");
                break;
            case 3:
                System.out.println("Entrei");
                break;
            default:
                System.out.println("Ops... Opção invalida tente novamente");



        }//Fim switch
    }
}
