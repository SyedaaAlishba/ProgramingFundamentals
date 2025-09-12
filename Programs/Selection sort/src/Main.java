public class Main {
    public static void main(String[] args) {
        int temp;
        int[] arr =  {4,3,2,5,1};
        for (int i = 0; i <arr.length; i++) {
            int SM= i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[SM]){
                SM=j;
                }
            }
            temp = arr[i];
            arr[i] = arr[SM];
            arr[SM] = temp;
            System.out.print(arr[i]);
        }

    }
}