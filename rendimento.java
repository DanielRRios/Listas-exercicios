import java.util.Scanner;

public class RendimentoCarro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] carros = new String[5];
        for (int i = 0; i < carros.length; i++) {
            System.out.println(String.format("Digite o nome do %d° carro", i + 1));
            carros[i] = sc.next();
        }

        System.out.println("\n\n");

        int[] rendimentos = new int[5];
        for (int i = 0; i < rendimentos.length; i++) {
            System.out.println(String.format("Digite o rendimento do carro %s", carros[i]));
            rendimentos[i] = sc.nextInt();
        }

        int maiorRend = 0;
        for (int i = 1; i < rendimentos.length; i++) {
            if (rendimentos[i] > rendimentos[maiorRend]) {
                maiorRend = i;
            }
        }

        System.out.println(String.format("O Carro mais economico é %s com o rendimento de %d", carros[maiorRend], rendimentos[maiorRend]));
    }
}
