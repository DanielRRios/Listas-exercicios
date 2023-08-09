import java.util.concurrent.ThreadLocalRandom;

public class acumulador {
    public static void main(String[] args) {
        Integer total = 0;
        Integer numeroALeatorio = ThreadLocalRandom.current().nextInt(0, 11);
        while(numeroALeatorio != 0){
            total += numeroALeatorio;
            numeroALeatorio = ThreadLocalRandom.current().nextInt(0, 11);
        }
        System.out.println("A soma dos números é " + total);
    }
}
