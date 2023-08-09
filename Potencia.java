public class Potencia {
    public static void main(String[] args) {
        Integer base = 2;
        Integer expoente = 5;
        Integer contador = 1;
        Integer exp = 1;
        while(contador <= expoente){
            exp = exp * base;
            contador ++;
        }

        System.out.println(exp);
    }
}
