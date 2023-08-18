import java.util.Scanner;

public class Ex01CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota : ");
        Double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota : ");
        Double nota2 = sc.nextDouble();
        Double media = (nota1 * 0.4) + (nota2 * 0.6);

        System.out.printf("Sua média final foi : %.1f", media);
    }
}
