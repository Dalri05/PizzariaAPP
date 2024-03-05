import java.util.Scanner;

public class Main {

    public static void pedido() {
        System.out.println("pedido");
        mainMenu();
    }

    public static void meusPedidos() {
        System.out.println("meus pedidos");
        mainMenu();
    }

    public static void contato() {
        System.out.println("contato");
        mainMenu();
    }

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        System.out.println(
                "Essa é a Dalri pizzaria o que deseja?\n" +
                        "[1] - Fazer pedido\n" +
                        "[2] - Meu pedido\n" +
                        "[3] - Informações para contato"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da opção desejada: ");
        int op = scanner.nextInt();
        System.out.println("Você escolheu a opção " + op);
    }
}
