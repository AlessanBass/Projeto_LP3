package visoes;

import controles.ControleEscrita;
import modelos.ModeloGastoParcelado;
import modelos.ModeloGastos;

import java.io.IOException;
import java.util.Scanner;

public class VisaoGasto {


    public VisaoGasto (){

    }

    public void preencheDados() throws IOException {
        Scanner ler = new Scanner(System.in); //Método para leitura de dados via teclado
        ModeloGastos modeloGastos = new ModeloGastos(); //Criação de objeto
        int op = 0; //Variável que vai conter uma opção informada pelo usuário

        System.out.println("=== CADASTRO DE DESPESA ===");
        System.out.println("Informe o nome da despesa:"); //Informes sobre o que o usuário precisa informar
        modeloGastos.setNome(ler.nextLine()); //Captura de dados do usuário
        System.out.println("Informe o nome valor:");
        modeloGastos.setValor( ler.next() );
        System.out.println("Foi parcelado? 1-Sim/ 2-Não");
        op = ler.nextInt();
        if(op == 1){ // Caso a opção tenha sido 1 entra nesse bloco de código
            ModeloGastoParcelado modeloGastoParcelado = new ModeloGastoParcelado(); //Criação desse objeto
            modeloGastoParcelado.preenche(); //Mostra ao usuário o que deve ser preenchido
            ControleEscrita controleEscrita = new ControleEscrita(); //Criação de objeto
            controleEscrita.escreveNoArquivo(modeloGastos.getNome(), modeloGastos.getValor(), modeloGastoParcelado.getNumDeParcelas(), modeloGastoParcelado.getParcelasPagas());
            //Após ser preenchido com os dados, esses dados são passados para a classe que controle a escrita no arquivo
            //para serem salvos no arquivo.
        }else if(op == 2){
            //O mesmo ocorre nesse bloco, com a diferença que se algo não foi parcelado então é pago de uma única vez
            // por isso passamos 1 no lugar de "numParcelas" e "parcelasPagas".
            ControleEscrita controleEscrita = new ControleEscrita();
            controleEscrita.escreveNoArquivo(modeloGastos.getNome(), modeloGastos.getValor(), "1","1");
        }else{
            //Caso nenhuma opção válida tenha sido escoliha, informa essa mensagem de erro.
            System.out.println("Opção não existe! Por favor tente outra vez");
        }

    }


}
