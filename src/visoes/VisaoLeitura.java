package visoes;

import java.io.*;
import java.util.Scanner;

public class VisaoLeitura {
    public VisaoLeitura (){

    }

    public void leituraDeArquivo() throws IOException {
        File arq = new File("Teste.txt"); //Abre o arquivo
        FileReader fr = new FileReader(arq); //Objeto com métodos para auxiliar na leitura
        BufferedReader br = new BufferedReader(fr); //Objeto com métodos para auxiliar na leitura
        double soma = 0; //Variável que será usada para somar o valor final (total)

        /*
        * Começo da leitura do arquivo.
        * Todos os procedimentos de leitura já foram explicados em um issue no Github.
        */
        System.out.println("===================================");
        System.out.println(">>> EXIBINDO LISTA DE DESPESAS <<<<");
        System.out.println("===================================");
        while (br.ready()){
            String linha = br.readLine();
            String [] separador = linha.split(";");
            //Convertendo String para Double
            double valor = Double.parseDouble(separador[1]);
            double parcelasPagas = Double.parseDouble(separador[3]);
            double numeroDeParcelas = Double.parseDouble(separador[2]);
            double  valorParcela=0;

            System.out.println("Nome do gasto: "+separador[0]);
            System.out.println("Valor do Gasto: R$ "+ separador[1]);
            System.out.printf("Parcelas: %.0f/%.0f\n", parcelasPagas, numeroDeParcelas);
            if (parcelasPagas == numeroDeParcelas){
                System.out.printf("Valor da %.0f parcela:R$ %.2f\n", numeroDeParcelas, valorParcela = valor/numeroDeParcelas);
            } else {
                System.out.printf("Valor da %.0f parcela:R$ %.2f\n", parcelasPagas+1, valorParcela = valor/numeroDeParcelas);
            }
            valor = valorParcela;
            soma += valor;
            System.out.println("-----------------------------");
        }
        System.out.printf("=== Valor Total: R$ %.2f ===\n\n",soma);
        br.close(); //Fecha o arquivo
    }
}
