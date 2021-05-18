import java.io.*;

public class Leitura {
    //Classe ainda deve ser especificada
    //Por enquanto so faz a leitura do arquivo
    //Devo implementar um metodo para converter String -> Double
    // Para assim fazer a soma do total gasto
    public void teste(File arq) throws IOException {
         FileReader fr = new FileReader(arq);
         BufferedReader br = new BufferedReader(fr);

         while (br.ready()){
            String linha = br.readLine();
             System.out.println(linha);
         }
         br.close();
     }


}
