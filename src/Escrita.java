import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita {

    Gastos gastos = new Gastos();
   public void preenche (){
       //Gastos gastos = new Gastos();
       gastos.preencheDados();
   }
   public void testando (){ //Deve ser retirado, apenas para fins de testes
       System.out.println(">>>> Dados em transitorio <<<");
       System.out.println("Nome do gasto"+ gastos.getNome());
       System.out.println("Valor do gasto"+ gastos.getValor());

   }

    //Escreve no arquivo, utilizei ";" para tentar achar os valores após
    // que serão convertidos para Double + tarde
    public void escreveNoArquivo(File arq) throws IOException {
        FileWriter fw = new FileWriter(arq, true);
        fw.write(gastos.getNome());
        fw.write(";");
        fw.write(gastos.getValor());
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
