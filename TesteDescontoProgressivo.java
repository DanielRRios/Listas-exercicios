import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        DescontoProgressivo desconto = new DescontoProgressivo();


        System.out.println("Bem-vindo ao sistema de desconto progressivo ");
        System.out.println("Digite o valor unitario do produto : R$");
        Double valor = leia.nextDouble();
        System.out.println("Digite a quantidade : ");
        Integer qtd = leia.nextInt();

        Double valorFinal = desconto.conta(valor, qtd);
        String nota = desconto.notaFiscal(valor, qtd, valorFinal);
        System.out.println(nota);

    }
}
