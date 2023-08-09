public class ExercicioDois {
    public static void main(String[] args) {
        Integer aquecimento = 20;
        Integer aerobicos = 30;
        Integer musculacao = 45;

        Integer perda = (aquecimento * 12) + (aerobicos * 20) + (musculacao*25);
        Integer tempo = aquecimento + aerobicos + musculacao;

        System.out.println("Olá jorge, você fez um total de " + tempo + " minutos de exercicíos e perder cerca de " +
                perda + " Calorias");

    }
}
