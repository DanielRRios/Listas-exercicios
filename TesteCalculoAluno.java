import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

         CalculoALuno media = new CalculoALuno();


        System.out.println("Informe a primeira nota do aluno : ");
        Double n1 = leia.nextDouble();

        System.out.println("Informe a segunda nota do aluno : ");
        Double n2 = leia.nextDouble();

        Double mediaFInal = media.calculoMedia(n1, n2);
        System.out.println(String.format("A média final do aluno foi %.1f", mediaFInal));

    }
}
