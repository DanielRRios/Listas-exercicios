import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {
        Integer pares = 0;
        Integer impares = 0;
        Integer meuNumero = 99;
        Boolean foiSorteado = false;
        Integer contador = 0;
        while(contador <= 200) {
            Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
            if(numeroAleatorio.equals(meuNumero) && foiSorteado.equals(false)){
                System.out.println("O seu número foi sorteado na posição : " +  contador);
                foiSorteado = true;
            }else if(numeroAleatorio % 2 == 0){
                pares += 1;
            }else if(numeroAleatorio % 2 == 1){
                impares += 1;
            }
            contador += 1;
        }
        System.out.println("Foram sorteados " + pares + " Numeros pares");
        System.out.println("Foram sorteados " + impares + " Numeros impares");
    }

    }

