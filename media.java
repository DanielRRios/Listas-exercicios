import java.util.Scanner;

public class Media {
    public static void mediaVetores(int[] v){
        Double media = 0.0;
        Double total = 0.0;
        for (int i = 0; i < v.length; i++) {
            total += v[i];
        }
        media = total / v.length;

        System.out.println(String.format("A média final foi : %.1f", media));

        System.out.println("\nNumeros maiores que a media ");
        for (int i = 0; i < v.length; i++) {
            if(v[i] > media){
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] lts = new int[10];
        for (int i = 0; i < lts.length; i++) {
            lts[i] = sc.nextInt();
        }

        mediaVetores(lts);
    }

}
