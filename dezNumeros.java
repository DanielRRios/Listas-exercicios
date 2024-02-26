import java.util.Scanner;

public class DezNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nDigite um número para ver quantas vezes aparece\n");
        int numPesquisa = sc.nextInt();
        int total = 0;
        for (int x = 0; x < numeros.length; x++) {
            if(numeros[x] == numPesquisa){
                total += 1;
            }
        }

        if(total > 0){
            System.out.println(String.format("O Numero %d aparece %d vezes", numPesquisa, total));
        }else{
            System.out.println(String.format("O numero %d não aparece nenhuma vez", numPesquisa));
        }

    }
}
