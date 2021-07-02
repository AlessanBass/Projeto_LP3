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
        Scanner ler = new Scanner(System.in);
        ModeloGastos modeloGastos = new ModeloGastos();
        int op = 0;
        System.out.println("Informe o nome da despesa:");
        modeloGastos.setNome(ler.next());
        System.out.println("Informe o nome valor");
        modeloGastos.setValor( ler.next() );
        System.out.println("Foi parcelado? 1-Sim/ 2-Não");
        op = ler.nextInt();
        if(op == 1){
            ModeloGastoParcelado modeloGastoParcelado = new ModeloGastoParcelado();
            modeloGastoParcelado.preenche();
            ControleEscrita controleEscrita = new ControleEscrita();
            controleEscrita.escreveNoArquivo(modeloGastos.getNome(), modeloGastos.getValor(), modeloGastoParcelado.getNumDeParcelas(), modeloGastoParcelado.getParcelasPagas());
        }else if(op == 2){
            System.out.println("Chama ai1");
            ControleEscrita controleEscrita = new ControleEscrita();
            controleEscrita.escreveNoArquivo(modeloGastos.getNome(), modeloGastos.getValor(), "1","1");
        }else{
            System.out.println("Opção não existe! Por favor tente outra vez");
        }

    }


}
