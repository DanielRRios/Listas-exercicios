import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
        Integer contador = 0;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        while(contador < 10){
            Integer numeroALeatorio = ThreadLocalRandom.current().nextInt(1, 4);
            if(numeroALeatorio.equals(1)){
                mussarela += 1;
            }else if(numeroALeatorio.equals(2)){
                calabresa += 1;
            }else{
                quatroQueijos += 1;
            }
            contador += 1;
        }
        System.out.println("Votação encerrada ");
        System.out.println("Mussarela : " + mussarela + " Calabresa : " + calabresa + " Quatro queijos " + quatroQueijos);
    }
}
