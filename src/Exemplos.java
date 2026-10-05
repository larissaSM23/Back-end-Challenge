import java.util.Scanner;

public class Exemplos {
    // Capitulo 1: O inventario (tipos primitivos)
    public static void tipos() {
        byte fantasmas = 3;                  // jaula minuscula: de -128 a 127
        int vidaLobisomem = 100;             // jaula media: numeros inteiros
        long milhasImpala = 3_000_000_000L;  // jaula enorme: nao cabe num int
        double danoCritico = 22.5;           // guarda ate a parte decimal
        char cacador = 'D';                  // uma unica letra: D de Dean
        boolean demonioPossuido = true;      // so true ou false

        System.out.println("Fantasmas avistados: " + fantasmas);
        System.out.println("Vida do lobisomem: " + vidaLobisomem);
        System.out.println("Milhas rodadas pelo Impala: " + milhasImpala);
        System.out.println("Dano de um golpe critico: " + danoCritico);
        System.out.println("Cacador da vez: " + cacador);
        System.out.println("Demonio possuido? " + demonioPossuido);
    }

    // Capitulo 2: O golpe critico (casting)
    public static void casting() {
        // Conversão Implícita: monstro pequeno em jaula grande. O Java faz sozinho.
        int ataques = 3;
        double ataquesDecimal = ataques;
        System.out.println("Conversao Implicita: int " + ataques + " virou double " + ataquesDecimal);

        // Conversão Explícita: monstro grande em jaula pequena. Forca com (tipo).
        double danoCritico = 22.5;
        int vidaLobisomem = 100;

        // vidaLobisomem = vidaLobisomem - danoCritico;  // NAO compila: double nao cabe em int
        vidaLobisomem = vidaLobisomem - (int) danoCritico;  // compila, mas perde o decimal
        System.out.println("Dano real aplicado: " + (int) danoCritico + " (o .5 sumiu)");
        System.out.println("Vida do lobisomem agora: " + vidaLobisomem);

        // Estouro - Valor maior que a capacidade.
        byte fantasmas = 127;
        fantasmas++;
        System.out.println("Bonus: byte 127 + 1 = " + fantasmas);
    }

    // Capitulo 3: A cacada (while)
    public static void whileComum() {
        int vidaLobisomem = 100;
        double danoCritico = 22.5;
        boolean lobisomemVivo = true;
        int rodada = 0;

        while (lobisomemVivo) {
            rodada++;
            vidaLobisomem = vidaLobisomem - (int) danoCritico;
            System.out.println("Rodada " + rodada + ": Dean ataca! Vida do lobisomem: " + Math.max(vidaLobisomem, 0));

            if (vidaLobisomem <= 0) {
                lobisomemVivo = false;
            }
        }

        System.out.println("O lobisomem caiu em " + rodada + " rodadas.");
    }

    // Capitulo 4: Continuar cacando? (do-while)
    public static void doWhile(Scanner teclado) {
        char resposta;
        int cidade = 0;

        do {
            cidade++;
            System.out.println("Os irmaos cacam na cidade " + cidade + ".");
            System.out.print("Continuar cacando? (S/N): ");
            String linha = teclado.nextLine().trim();
            resposta = linha.isEmpty() ? 'N' : Character.toUpperCase(linha.charAt(0));
            System.out.println("(O Java guardou '" + resposta + "' como o numero " + (int) resposta + ")");
        } while (resposta == 'S');

        System.out.println("Os irmaos encerram a viagem depois de " + cidade + " cidade(s).");
    }

    // Capitulo 5: Mystery Spot (while(true))
    public static void whileTrue() {
        byte tercas = 0;

        while (true) {
            // tercas = tercas + 1;       // NAO compila: a conta vira int e nao cabe no byte
            tercas = (byte) (tercas + 1);  // casting traz o resultado de volta pra byte
            System.out.println("Terca-feira repetida pela " + tercas + "a vez... Dean morre de novo.");

            if (tercas == 5) {
                System.out.println("Sam quebra o ciclo!");
                break;
            }
        }

        System.out.println("Finalmente chegou a quarta-feira.");
    }

    // Capitulo 6: Cacada completa
    public static void cacadaCompleta() {
        int vidaLobisomem = 100;
        double danoCritico = 22.5;
        char cacador = 'D';
        int rodada = 0;

        while (true) {
            rodada++;
            vidaLobisomem = vidaLobisomem - (int) danoCritico;
            String nome = (cacador == 'D') ? "Dean" : "Sam";
            System.out.println("Rodada " + rodada + ": " + nome + " ataca! Vida: " + Math.max(vidaLobisomem, 0));

            if (vidaLobisomem <= 0) {
                break;
            }
            cacador = (cacador == 'D') ? 'S' : 'D';
        }

        int conferencias = 0;
        do {
            conferencias++;
            System.out.println("Conferindo o corpo (vez " + conferencias + ")...");
        } while (conferencias < 2);

        System.out.println("Cacada encerrada. O Impala segue pra proxima cidade.");
    }
}