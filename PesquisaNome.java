import java.util.Scanner;

public class PesquisaNome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.next();
        }

        System.out.println("\nDigite um nome para ver se ele existe na lista\n");
        String nome = sc.next();

        Boolean existe = false;
        for (int i = 0; i < nomes.length; i++) {
            if(nomes[i].equals(nome)){
                existe = true;
                System.out.println(String.format("O nome %s existe na lista e está na posição %d", nome, i + 1));
                break;
            }
        }
        if(!existe){
            System.out.println("O nome não existe na lista");
        }

    }
}
