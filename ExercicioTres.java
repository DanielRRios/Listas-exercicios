public class ExercicioTres {
    public static void main(String[] args) {
        Double valorUnitario = 5.0;
        Integer quantVendida = 4;
        Double valorPago = 50.0;

        Double troco = valorPago - (valorUnitario * quantVendida);
        System.out.println("Seu troco será de R$ " + troco);
    }
}
