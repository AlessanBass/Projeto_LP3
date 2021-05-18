import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Scanner ler = new Scanner(System.in);
        int op;
        do{
            menu.exibeMenu();
            op = ler.nextInt();
            menu.exibeSubMenu(op);
        }while (op != 3);
    }
}
