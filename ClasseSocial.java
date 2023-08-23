public class ClasseSocial {
    Double renda(Double salario){
        Double qtdSalarios = salario / 1045;
        return qtdSalarios;
    }

    String classe(Double salario){
        Double qtdSalarios1 = salario / 1024;
        if(qtdSalarios1 <= 2){
            return  "Classe E";
        }else if(qtdSalarios1 <= 4){
            return  "CLasse D";
        }else if(qtdSalarios1 <= 10){
            return "Classe C";
        }else if(qtdSalarios1 <= 20){
            return  "CLasse B";
        }else{
           return  "CLasse A";
        }
    }
}
