import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex03ClasseFruta {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List <String> listaFrutas = new ArrayList<>();
        listaFrutas.add("maça");
        listaFrutas.add("pera");
        listaFrutas.add("melancia");
        listaFrutas.add("manga");
        listaFrutas.add("uva");

        System.out.println("Escreva o nome de uma fruta : ");
        String fruta = leia.nextLine().toLowerCase();

        Integer x = 0;
        for (int i = 0; i < listaFrutas.size(); i++) {
            if(listaFrutas.get(i).equals(fruta)){
                x ++;
            }
        }
        if(x.equals(1)){
            System.out.println(String.format("A fruta %s existe na lista", fruta));
        }else{
            System.out.println(String.format("NÃO existe a fruta %s na lista :( ", fruta));
        }
    }
}
