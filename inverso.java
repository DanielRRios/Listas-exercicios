import java.util.Scanner;

public class VetorInverso {
    public static void vetorReverso(int[] v){
        System.out.println("Revertendo a lista: ");
        for (int i = v.length -1; i >= 0; i--) {
            System.out.println(v[i]);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lts = new int[7];
        for (int i = 0; i < lts.length; i++) {
            lts[i] = sc.nextInt();
        }

        vetorReverso(lts);
    }
}
