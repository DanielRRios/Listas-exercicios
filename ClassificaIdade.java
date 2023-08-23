public class ClassificaIdade {

    String faixaEtaria(Integer idade){

        if(idade > 0 && idade <= 2){
            return "Bebê";
        }else if(idade <= 11){
            return "Criança";
        }else if(idade <= 19){
            return "Adolescente";
        }else if(idade <= 30){
            return "Jovem";
        }else if(idade <= 60){
            return "Adulto";
        }else{
            return "Idoso";
        }
    }

}
