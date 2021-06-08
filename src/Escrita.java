import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita {

    Gastos gastos = new Gastos();
    GastoParcelado gp = new GastoParcelado();
    Scanner ler = new Scanner(System.in);
   public void preenche (){
       gastos.preencheDados();
       int op = ler.nextInt();
       if (op == 1){
            gp.preenche();
        }else{
           gp.setNumDeParcelas("1");
           gp.setParcelasPagas("1");
       }
   }
   public void testando (){ //Deve ser retirado, apenas para fins de testes
       System.out.println(">>>> Dados Cadastrados <<<");
       System.out.println("Nome do gasto: "+ gastos.getNome());
       System.out.println("Valor do gasto: "+ gastos.getValor());
       System.out.println("Numero de parcelas: "+ gp.getNumDeParcelas());
       System.out.println("Parcelas pagas: "+gp.getParcelasPagas());

   }


    //Escreve no arquivo, utilizei ";" para tentar achar os valores após
    // que serão convertidos para Double + tarde
    public void escreveNoArquivo(File arq) throws IOException {
        FileWriter fw = new FileWriter(arq, true);
        fw.write(gastos.getNome());
        fw.write(";");
        fw.write(gastos.getValor());
        fw.write(";");
        fw.write(gp.getNumDeParcelas());
        fw.write(";");
        fw.write(gp.getParcelasPagas());
        fw.write(";");
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
