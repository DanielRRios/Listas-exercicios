import java.util.Scanner;

public class RotinaInvestimento {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Double valorTotal = 0.0;
        do {
            System.out.println(
                    "-----------------------------\n" +
                            "| Sptech  Investimentos      |\n" +
                            "-----------------------------\n" +
                            "| Olá, o que deseja fazer?   |\n" +
                            "-----------------------------\n" +
                            "| 1 - Depositar              |\n" +
                            "| 2 - Sacar                  |\n" +
                            "| 3 - Simular rendimentos    |\n" +
                            "| 0 - Sair                   |\n" +
                            "-----------------------------"
            );
            Integer opcao = leia.nextInt();

            if (opcao.equals(1)) {
                System.out.println("Digite o valor do depósito : R$");
                Double valorDeposito = leia.nextDouble();
                if (valorDeposito <= 0.0) {
                    System.out.println("Valor inválido");
                } else {
                    valorTotal += valorDeposito;
                    System.out.println(String.format("Depósito realizado - Saldo atual R$%.2f", valorTotal));
                }
            } else if(opcao.equals(2)){
                System.out.println("Digite o valor do saque: ");
                Double saque = leia.nextDouble();

                if(saque > valorTotal){
                    System.out.println("Valor inválido");
                }else{
                    valorTotal -= saque;
                    System.out.println(String.format("Saque realizado - Saldo atual R$%.2f", valorTotal));
                }
            }else if(opcao.equals(3)){
                System.out.println(String.format("Saldo atual R$%.2f", valorTotal));
                Double investimeto = valorTotal;
                for (int i = 1; i <= 12; i++) {
                    investimeto *= 1.10;
                    System.out.println(String.format("Mês %d | saldo R$ : %.2f", i, investimeto));
                }
            } else if (opcao.equals(4)) {
                System.out.println("O programa encerrou :)");
                break;
            }

        } while (true);
    }
}
