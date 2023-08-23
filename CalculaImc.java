public class CalculaImc {
    Double calculo(Double altura, Double peso){
        Double imc = peso / (altura * altura);
        return imc;
    }
}
