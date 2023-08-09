import java.util.concurrent.ThreadLocalRandom;

public class loteria {
    public static void main(String[] args) {

        Integer numero = 7;
        Integer numeroALeatorio = ThreadLocalRandom.current().nextInt(1, 11);
        Integer jogadas = 0;
        while(numeroALeatorio != numero){
            jogadas += 1;
            numeroALeatorio = ThreadLocalRandom.current().nextInt(1, 11);
        }
        if(jogadas <= 3){
            System.out.println("Você é muito sortudo");
        }else if(jogadas <= 10){
            System.out.println("Você é sortudo");
        }else{
            System.out.println("É melhor você para de apostar e ir trabalhar");
        }

    }
}
