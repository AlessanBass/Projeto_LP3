import controles.ControleMenu;
import visoes.VisaoMenu;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        /*Menu menu = new Menu();
        Scanner ler = new Scanner(System.in);
        int op;
        do{
            menu.exibeMenu();
            op = ler.nextInt();
            menu.exibeSubMenu(op);
        }while (op != 3);*/

        /*Daqui começa o projeto em MVC - Salientando que não foi necessário a implemetação de 3 classes para cada pacote
          Temos a criação de dois objetos que darão partida ao programa
        */
        VisaoMenu visaoMenu = new VisaoMenu();
        ControleMenu controleMenu = new ControleMenu();
        Scanner ler = new Scanner(System.in); //Usado para capturar a opção inserida pelo usuário
        int op; // Onde será armazenada a informação inserida pelo usuário
        do{
            visaoMenu.exibeMenu(); //Mostra ao usuário um menu com opções
            op = ler.nextInt(); //Captura a opção informada pelo usuário
            controleMenu.trataOpcao(op);//Passa essa opção para o controle do Menu onde será tratada
                                        // de acordo com a opção escoliha.
        } while (op != 3);

    }

}
