import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex04DesafioNumeros {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        List<Integer> listaNum = new ArrayList<>();
        List<Integer> listaPares = new ArrayList<>();
        List<Integer> listaImpares = new ArrayList<>();

        Integer total = 0;

        System.out.println("Informe um número inteiro [0 para parar] : ");
        Integer num = leia.nextInt();
        if (num != 0){
            listaNum.add(num);
        }
        while (num != 0){
            System.out.println("Informe um número inteiro [0 para parar] : ");
            num = leia.nextInt();
            if(num != 0){
                listaNum.add(num);
            }
        }
        for (int i = 0; i < listaNum.size(); i++) {
            total += listaNum.get(i);
            if(listaNum.get(i) % 2 == 0){
                listaPares.add(listaNum.get(i));
            }else{
                listaImpares.add(listaNum.get(i));
            }
        }
        Integer menor = listaNum.get(0);
        Integer maior = listaNum.get(0);
        for (int i = 0; i < listaNum.size(); i++) {
            if(listaNum.get(i) > maior){
                maior = listaNum.get(i);
            }else if(listaNum.get(i) < menor){
                menor = listaNum.get(i);
            }
        }
        System.out.println(String.format("Número pares : %s", listaPares));
        System.out.println(String.format("Número Impares : %s", listaImpares));
        System.out.println(String.format("Soma da lista : %d", total));
        System.out.println(String.format("Menor valor da lista : %d", menor));
        System.out.println(String.format("Maior valor da lista : %d", maior));
    }
}
