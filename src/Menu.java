import java.io.File;
import java.io.IOException;

public class Menu {


    public Menu (){
    }

    //Cria o menu principal da aplicação
    public void exibeMenu(){
        System.out.println(">>> Bem-vindo(a) ao menu inicial <<<");
        System.out.println("[1] Para Inserir Despesa");
        System.out.println("[2] Para Verificar Gastos");
        System.out.println("[3] Para Sair");
    }

    //Metodo que recebe a opção digitada pelo usuário
    // e encaminha para a manipulação de outras classes
    public void exibeSubMenu(int op) throws IOException {
        switch (op){
            case 1: //Opção que escreve no arquivo
                //System.out.println("Entrou 1");
                //Gastos gastos = new Gastos();
               // gastos.preencheDados();
                File t = new File("Teste.txt");
                Escrita escreve = new Escrita();
                escreve.preenche();
                escreve.testando(); //Metodo para teste será retirado depois
                escreve.escreveNoArquivo(t);

                break;
            case 2:
                File f = new File("Teste.txt");
                Leitura esc = new Leitura();
                esc.teste(f);
                break;
            case 3:
                System.out.println("Obrigado por utilizar o app");
                break;
            default:
                System.out.println("Ops... Opção invalida tente novamente");
        }
    }
}
