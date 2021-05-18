import java.util.Scanner;

public class Gastos {
    private String nome;
    private String valor; // Mais tarde será convertido para Double

    public Gastos (){

    }

    public Gastos(String nome, String valor) {
        this.nome = nome;
        this.valor = valor;
    }


    public void preencheDados(){ //Metodo incompleto, deverá ainda ter uma relçao com  outra classe
        Scanner ler = new Scanner(System.in);
        int op;
        System.out.println("Informe o nome da divida");
        this.nome = ler.next();
        System.out.println("Informe o nome valor");
        this.valor = ler.next();
        System.out.println("Foi parcelado? 1-Sim/ 2-Não");
        op = ler.nextInt();
        if (op == 1){

        }else System.out.println("Brabo compra na marra");

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
