public class Main {
    public static void main(String[] args) {
        int []arr={4,1,5,2,3};
        int prev;
        int cur;
        int i;
        for ( i = 1; i < arr.length; i++) {
             cur=arr[i];
             prev=i-1;
             while(prev>=0&& arr[prev]>cur){
                 arr[prev+1]=arr[prev];
                 prev--;
             }
             arr[prev+1]=cur;
            System.out.print("Sorted array: ");
            for (int k : arr) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}