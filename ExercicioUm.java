public class ExercicioUm {
    public static void main(String[] args) {
        Integer filhos03 = 2;
        Integer filhos_0416 = 1;
        Integer filhos17_18 = 1;

        Double valor01 = (filhos03 * 25.12);
        Double valor02 = (filhos_0416 * 15.88);
        Double valor03 = (filhos17_18 * 12.44);

        Integer filhos = filhos03 + filhos_0416 + filhos17_18;
        Double total = valor01 + valor02 + valor03;

        System.out.println("Você tem um total de " + filhos +  " Filhos e vai receber R$ " + total + " de bolsa");

    }
}
