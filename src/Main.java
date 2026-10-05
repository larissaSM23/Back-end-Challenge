import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String opcao;

        do {
            System.out.println();
            System.out.println("=== SUPERNATURAL: while, casting e tipos primitivos ===");
            System.out.println("1 - Inventario (tipos primitivos)");
            System.out.println("2 - Golpe critico (casting)");
            System.out.println("3 - A cacada (while)");
            System.out.println("4 - Continuar cacando? (do-while)");
            System.out.println("5 - Mystery Spot (while(true))");
            System.out.println("6 - Cacada completa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = teclado.nextLine().trim();
            System.out.println();

            switch (opcao) {
                case "1":
                    Exemplos.tipos();
                    break;
                case "2":
                    Exemplos.casting();
                    break;
                case "3":
                    Exemplos.whileComum();
                    break;
                case "4":
                    Exemplos.doWhile(teclado);
                    break;
                case "5":
                    Exemplos.whileTrue();
                    break;
                case "6":
                    Exemplos.cacadaCompleta();
                    break;
                case "0":
                    System.out.println("Ate a proxima cacada!");
                    break;
                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        } while (!opcao.equals("0"));

        teclado.close();
    }
}