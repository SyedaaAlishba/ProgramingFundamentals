public class Main {
    public static void main(String[] args) {
        int [] arr={4,1,3,5,2};
        for (int i = 0; i < 5; i++) {
            int j;
            for (j = 0; j < 5 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }
        for (int i = 0; i < 5; i++) {
            System.out.print (arr[i]);
        }


    }
}