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

        //Daqui começa
        VisaoMenu visaoMenu = new VisaoMenu();
        ControleMenu controleMenu = new ControleMenu();
        Scanner ler = new Scanner(System.in);
        int op;
        do{
            visaoMenu.exibeMenu();
            op = ler.nextInt();
            controleMenu.trataOpcao(op);

        } while (op != 3);

    }

}
