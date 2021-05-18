public class Usuario {
    private String nome;
    private String orcamento; //Mais tarde será convertido para Double

    public Usuario(){

    }

    public Usuario(String nome, String orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }
}
