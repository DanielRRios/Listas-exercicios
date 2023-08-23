import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        CalculaImc imc = new CalculaImc();

        System.out.println("Informe a sua altura : ");
        Double altura = leia.nextDouble();

        System.out.println("Informe seu peso : ");
        Double peso = leia.nextDouble();

        Double imcFinal = imc.calculo(altura, peso);
        System.out.println(String.format("Com base nas informações passadas seu IMC é %.1f", imcFinal));

    }
}
