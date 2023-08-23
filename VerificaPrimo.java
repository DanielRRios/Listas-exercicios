public class VerificaPrimo {
    String primo(Integer num){
        Integer divisores = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                divisores ++;
            }
        }
        if(divisores == 2){
            return "É um Número PRIMO";
        }else{
            return "NÃO é um número primo";
        }

    }
}
