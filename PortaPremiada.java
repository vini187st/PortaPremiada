import java.util.Scanner;
import java.util.Random;

public class PortaPremiada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int portaPremiada = random.nextInt(3) + 1;
        int portaEscolhida;

        do {
            System.out.print("Escolha uma porta 1, 2 , 3");
            portaEscolhida = scanner.nextInt();
        } while (portaEscolhida < 1  || portaEscolhida > 3);

        int portaVazia;

        do {
            portaVazia = random.nextInt(3) + 1;
        }  while (portaVazia == portaPremiada || portaVazia == portaEscolhida  );

        System.out.println("O jogador abriu a porta " + portaVazia + " está vazia.");

        System.out.print("Você você gostaria de mudar de porta? (sim/não): ");
        String trocardeporta = scanner.next();

        if (trocardeporta.equalsIgnoreCase("s")) {
            int novaPortaEscolhida;

            do {
                novaPortaEscolhida = random.nextInt(3) + 1;
            } while (novaPortaEscolhida == portaEscolhida || novaPortaEscolhida == portaVazia);
            portaEscolhida = novaPortaEscolhida;
        }

        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! Parabéns!");
        } else {
            System.out.println("Você perdeu. A porta premiada é a " + portaPremiada + ".");
        }

        scanner.close();
    }
}

