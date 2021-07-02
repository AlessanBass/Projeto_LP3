package controles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ControleEscrita {

    /*public void teste(String nome, String valor, String np, String pp){
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+ valor);
        System.out.println("Numero de Parcelas: "+np);
        System.out.println("Parcelas pagas: "+ pp);
    }*/

    public void escreveNoArquivo(String nomeDoGasto, String valorDoGasto, String numParcelas, String parcelasPgas) throws IOException {
        File arq = new File("Teste.txt");
        FileWriter fw = new FileWriter(arq, true);
        fw.write(nomeDoGasto);
        fw.write(";");
        fw.write(valorDoGasto);
        fw.write(";");
        fw.write(numParcelas);
        fw.write(";");
        fw.write(parcelasPgas);
        fw.write(";");
        fw.write("\n");
        fw.flush();
        fw.close();
    }

}
