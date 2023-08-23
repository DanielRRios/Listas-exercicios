import java.util.Scanner;
public class TesteIdade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ClassificaIdade classIdade = new ClassificaIdade();

        System.out.println("Digite sua idade : ");
        Integer idade = leia.nextInt();
        String faixa = classIdade.faixaEtaria(idade);

        System.out.println(String.format("Com base na sua faixa etária você é : %s", faixa));


    }
}
