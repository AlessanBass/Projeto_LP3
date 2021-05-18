public class GastoParcelado extends Gastos{
    private String numDeParcelas;
    private String parcelasPagas;
    private String valorDaParcela;

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

}
