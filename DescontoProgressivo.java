public class DescontoProgressivo {
    Double conta(Double valor, Integer qtd){
        Double total = valor * qtd;
        if(qtd.equals(1)){
            return total * 0.9;
        }else if(qtd.equals(2)){
            return total * 0.8;
        }else{
            return total * 0.7;
        }
    }

    String notaFiscal(Double valor, Integer qtd, Double valorFinal){
        return"""
                    ----------------------------------------------------------
                    Valor do produto : R$ %.2f
                    Quantidade : %d
                    ----------------------------------------------------------
                    Valor com desconto : R$ %.2f 
                """.formatted(valor, qtd, valorFinal);
    }
}
