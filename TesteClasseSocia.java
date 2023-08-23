import java.util.Scanner;

public class TesteClasseSocia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ClasseSocial salarios = new ClasseSocial();

        System.out.println("Informe seu salario R$:");
        Double salarioMes = leia.nextDouble();

        Double totalSalarios = salarios.renda(salarioMes);
        String classePertencente = salarios.classe(salarioMes);

        System.out.println(String.format("Você recebe %.1f salarios minimos e sua classe é %s", totalSalarios, classePertencente));

    }
}
