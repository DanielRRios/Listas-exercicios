import java.util.Scanner;

public class Ex02Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a operação desejada : \n1 - soma \n2 - multiplicação \n3 - Divisão \n4 - Subtração \n5 - potência \n6 - resto\n0 - sair");
        Integer operacao = leia.nextInt();

        if(operacao.equals(0)){
            System.out.println("Obrigado por utilizar o programa :D");
        }else{
            System.out.println("Digite um número inteiro : ");
            Integer numero = leia.nextInt();
            if(operacao.equals(1)){
                for (int i = 1; i <= 10; i++) {
                    System.out.println(String.format("%d + %d = %d ", i, numero, numero + i));
                }
            }else if(operacao.equals(2)){
                for (int i = 1; i <= 10; i++) {
                    System.out.println(String.format("%d * %d = %d ", i, numero, numero * i));
                }
            }else if(operacao.equals(3)){
                for (int i = 1; i <= 10 ; i++) {
                    System.out.println(String.format("%d / %d = %d ", i, numero, numero / i));
                }
            }else if(operacao.equals(4)){
                for (int i = 1; i < 10; i++) {
                    System.out.println(String.format("%d - %d = %d", i, numero, i - numero));
                }
            }else if(operacao.equals(5)){
                for (int i = 1; i < 10; i++) {
                    Double op = Math.pow(numero, i);
                    System.out.println(String.format("%d ^ %d = %.1f", numero, i, op));
                }
            }else if(operacao.equals(6)){
                for (int i = 1; i < 10; i++) {
                    Double rest = (double) numero % i;
                    System.out.println(String.format("%d %% %d = %.1f", numero, i, rest));
                }
            }
        }




    }
}

