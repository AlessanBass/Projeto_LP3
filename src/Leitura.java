import java.io.*;

public class Leitura {
    //Classe ainda deve ser especificada
    //Por enquanto so faz a leitura do arquivo
    //Devo implementar um metodo para converter String -> Double
    // Para assim fazer a soma do total gasto
    public void teste(File arq) throws IOException {
         FileReader fr = new FileReader(arq);
         BufferedReader br = new BufferedReader(fr);
            double soma = 0;
         while (br.ready()){
            String linha = br.readLine();
            String [] separador = linha.split(";");
            //Convertendo String para Double
             double valor = Double.parseDouble(separador[1]);
             double parcelasPagas = Double.parseDouble(separador[3]);
             double numeroDeParcelas = Double.parseDouble(separador[2]);
             double  valorParcela=0;

             System.out.println("Nome do gasto: "+separador[0]);
             System.out.println("Valor do Gasto: "+ separador[1]);
             System.out.printf("Parcelas: %.0f/%.0f\n", parcelasPagas, numeroDeParcelas);
             if (parcelasPagas == numeroDeParcelas){
                 System.out.printf("Valor da %.0f parcela: %.2f\n", numeroDeParcelas, valorParcela = valor/numeroDeParcelas);
             } else {
                 System.out.printf("Valor da %.0f parcela: %.2f\n", parcelasPagas+1, valorParcela = valor/numeroDeParcelas);
             }
             valor = valorParcela;
             soma += valor;
             System.out.println("-----------------------------");
         }
             System.out.printf("=== Valor Total: R$ %.2f ===\n\n",soma);
         br.close();
     }


}
