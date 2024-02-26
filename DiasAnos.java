import java.util.Scanner;

public class DiasAnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Digite o dia  ");
        int dia = sc.nextInt();
        System.out.println("Digite o mês em numero");
        int mes = sc.nextInt();

        int diaNoAno = 0;

        for (int i = 0; i < mes - 1; i++) {
            diaNoAno += dias[i];
        }

        diaNoAno += dia;

        System.out.println(String.format("O dia %d/%d corresponde ao dia %d do ano", dia, mes, diaNoAno));
    }
}
