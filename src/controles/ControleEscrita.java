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

    /*
    * Método resposável por salvar os dados no arquivo.
    * Recebe os dados vindos da class VisaoGasto e os manipula.
    */
    public void escreveNoArquivo(String nomeDoGasto, String valorDoGasto, String numParcelas, String parcelasPgas) throws IOException {
        File arq = new File("Teste.txt"); //Abre o arquivo onde será o nosso "Banco de Dados"
        FileWriter fw = new FileWriter(arq, true); //Objeto que contém o método de escrita
        fw.write(nomeDoGasto); //Escreve os dados recebidos
        fw.write(";"); //Paramêtro usado para recuperar dados salvos no arquivo na class "Leitura"
        fw.write(valorDoGasto);
        fw.write(";");
        fw.write(numParcelas);
        fw.write(";");
        fw.write(parcelasPgas);
        fw.write(";");
        fw.write("\n");
        fw.flush(); //Descarrega o fluxo de dados
        fw.close(); //Fecha os arquivo
        System.out.println("Despesa cadastrada com sucesso!");
    }

}
