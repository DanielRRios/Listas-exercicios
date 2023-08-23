import java.util.Scanner;

public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        VerificaPrimo verPrimo = new VerificaPrimo();

        Integer num;
        do {
            System.out.println("Digite um valor inteiro (ou negativo para sair): ");
            num = leia.nextInt();

            if (num < 0) {
                System.out.println("Encerrando o programa.");
                break;
            }
            String ePrimo = verPrimo.primo(num);
            if (num >= 0) {
                System.out.println(String.format("%d : %s", num, ePrimo));
            }
        } while (true);




    }
}
