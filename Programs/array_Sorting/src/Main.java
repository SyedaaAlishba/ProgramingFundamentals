//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//5 12 4 3
//        System.out.println("Sorting an array");
//        int[] arr= {5,1,2,4,3};
//        int str=0;
//        int end= arr.length-1;
//        for (int i = str; i < arr.length; i++) {
//            for (int j = end; j >i; j--) {
//                if (arr[j] < arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//
//                }
//
//            }
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//        }


        //Maximum and minimum
//
//        int []arr= {8,2,6,5,1};
//        int max=arr[0];
//        int min=10000;
//        int str=0;
//        int end= arr.length-1;
//        for (int i = 1; i < arr.length; i++) {
//                if (arr[i] > max) {
//                    max = arr[i];
//                }
//                if(arr[i]<min){
//                    min=arr[i];
//                }
//        }
//        System.out.println(max);
//        System.out.println(min);


//        Write a Java program to remove a specific element from an array.


        int[] rem={1,2,3,4,5};
        int x=4;

        for (int i = 0; i < rem.length; i++) {
            if(rem[i]==x){
                rem[i]=0;
            }
        }
        for (int i = 0; i <rem.length ; i++) {
            System.out.print(rem[i]);
        }
    }
}