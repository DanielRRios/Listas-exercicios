public class App {
    public static void main(String[] args) {

        // Professora criei um novo projeto para a resolução desse exercicio, mantendo o mesmo tema.

        Bebida[] bebidas = new Bebida[8];
        bebidas[0] = new Bebida(1, "Expresso", "Arabica");
        bebidas[1] = new Bebida(2, "Pingado", "Robusta");
        bebidas[2] = new Bebida(3, "Port", "Tinto");
        bebidas[3] = new Bebida(4, "Duplo Malte", "Pilsen");
        bebidas[4] = new Bebida(5, "Zero absoluto", "Pilse");
        bebidas[5] = new Bebida(6, "vinho", "Rose");
        bebidas[6] = new Bebida(7, "Chá de Pessego", "Mate");
        bebidas[7] = new Bebida(8, "Lipton", "Mate");



        bubbleSort(bebidas);
        exibeVetor(bebidas);

        System.out.println("");
        System.out.println("------------------------------------------------------------");

        selectionSort(bebidas);
        exibeVetor(bebidas);

        System.out.println("");
        System.out.println("------------------------------------------------------------");

        int posicao = pesquisaBinaria(bebidas, "Lipton");
        if (posicao != -1) {
            System.out.println("Bebida encontrada na posição " + posicao);
        } else {
            System.out.println("Bebida não encontrada.");
        }

        System.out.println("");
        System.out.println("------------------------------------------------------------");

        posicao = pesquisaBinaria(bebidas, "Cerveja"); // valor que não existe
        if (posicao != -1) {
            System.out.println("Bebida encontrada na posição " + posicao);
        } else {
            System.out.println("Bebida não encontrada");
        }
    }

    public static void bubbleSort(Bebida[] bebidas) { //Odenando pelo tipo da bebida
        for (int i = 0; i < bebidas.length - 1; i++) {
            for (int j = 0; j < bebidas.length - 1 - i; j++) {
                if (bebidas[j].getTipo().compareTo(bebidas[j + 1].getTipo()) > 0) {
                    Bebida temp = bebidas[j];
                    bebidas[j] = bebidas[j + 1];
                    bebidas[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(Bebida[] bebidas) { //Ordenando pelo nome da bebida
        for (int i = 0; i < bebidas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < bebidas.length; j++) {
                if (bebidas[j].getNome().compareTo(bebidas[minIndex].getNome()) < 0) {
                    minIndex = j;
                }
            }
            Bebida temp = bebidas[minIndex];
            bebidas[minIndex] = bebidas[i];
            bebidas[i] = temp;
        }
    }

    public static int pesquisaBinaria(Bebida[] bebidas, String nome) {
        int esq = 0;
        int dir = bebidas.length - 1;
        while (esq <= dir) {
            int meio = esq + (dir - esq) / 2;
            int comp = bebidas[meio].getNome().compareTo(nome);
            if (comp == 0) {
                return meio;
            }
            if (comp < 0) {
                esq = meio + 1;
            } else {
                dir = meio - 1;
            }
        }
        return -1;
    }

    public static void exibeVetor (Bebida[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.println(String.format("Vetor[%d] = %s", i, v[i]));
        }

    }


}
