public class Insertion {

    public static void main(String[] args) {
        int[] lts = {2,6,1,9,34,76,25,3,6,3,8};
        insertionSort(lts);
        for (int num : lts){
            System.out.println(num);
        }

    }

    public static void insertionSort(int lts[]){
        int j, x;
        for (int i = 0; i < lts.length; i++) {
            x = lts[i];
            j = i -1;
            while (j >= 0 && (lts[j]) > x){
                lts[j + 1] = lts[j];
                j = j - 1;
            }
            lts[j + 1] = x;
        }
    }



}
