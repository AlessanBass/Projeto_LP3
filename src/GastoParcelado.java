import java.util.Scanner;

public class GastoParcelado extends Gastos{
    private String numDeParcelas = "";
    private String parcelasPagas = "";
    private String valorDaParcela = "";

    //Classe ainda deve ser especificada
    //Alguns testes deverão ser realizados

    public GastoParcelado (){

    }

    public GastoParcelado(String nome, String valor, String numDeParcelas, String parcelasPagas, String valorDaParcela){
        super(nome,valor );
        this.numDeParcelas = numDeParcelas;
        this.parcelasPagas = parcelasPagas;
        this.valorDaParcela = valorDaParcela;
    }

    public void preenche (){
            Scanner ler = new Scanner(System.in);
            Escrita  es = new Escrita();
            System.out.println("Em quantas parcelas:");
            this.numDeParcelas = ler.next();
            System.out.println("Quantas já foram pagas?");
            this.parcelasPagas = ler.next();

    }

    public String getNumDeParcelas() {
        return numDeParcelas;
    }

    public void setNumDeParcelas(String numDeParcelas) {
        this.numDeParcelas = numDeParcelas;
    }

    public String getParcelasPagas() {
        return parcelasPagas;
    }

    public void setParcelasPagas(String parcelasPagas) {
        this.parcelasPagas = parcelasPagas;
    }

    public String getValorDaParcela() {
        return valorDaParcela;
    }

    public void setValorDaParcela(String valorDaParcela) {
        this.valorDaParcela = valorDaParcela;
    }
}
