package modelos;

import java.util.Scanner;

public class ModeloGastoParcelado extends ModeloGastos{
    private String numDeParcelas = "";
    private String parcelasPagas = "";

    public ModeloGastoParcelado(){

    }
    public ModeloGastoParcelado(String nome, String valor, String numDeParcelas, String parcelasPagas){
        super(nome,valor );
        this.numDeParcelas = numDeParcelas;
        this.parcelasPagas = parcelasPagas;

    }
    public void preenche (){
        Scanner ler = new Scanner(System.in);
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
}
