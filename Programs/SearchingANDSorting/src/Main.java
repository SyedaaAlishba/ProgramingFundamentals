//array[]=[1,2,3,4,5,6,7,8,9,10,11,12,13,14]
//public class Main {
//    public static void main(String[] args) {
//
//        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//        int m=-898989;
//        for (int i = 0; i < arr.length; i++) {
//           if(arr[i]>m){
//               m=arr[i];
//           }
//        }
//        System.out.println(m);
//    }
//}


//array[]=[1,2,3,4,5,6,7,8,9,10,11,12,13,14]
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Number you want to find the index");
//        int n=sc.nextInt();
//        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < arr.length; i++) {
//           if(arr[i]==n){
//               System.out.println("Number "+n+"Found at"+arr[i]);
//               break;
//           }
//        }
//
//    }
//}




//arr[]=[3,1,2,5,4]

//Bubble Sort
//public class Main {
//    public static void main(String[] args) {
//
//        int []arr={3,1,2,5,4};
//       int n=5;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <n-i-1 ; j++) {
//                if(arr[j]>arr[j+1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]);
//        }
//
//    }
//}

//s.o array 1..20

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int []arr={3,1,2,5,4,10,11,6,8,9,13,14,16,17,18,19,20};
//        boolean track=false;
//        System.out.println("Enter Your S.NO");
//        int sNO=sc.nextInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==sNO){
//                System.out.println("Student Found");
//                track=true;
//                break;
//            }
//        }
//        if (!track) {
//            System.out.println("Student Not Found");
//        }
//
//    }
//}


//find the random number using Binary Search!





///s.o array 1..20
//
//import java.io.BufferedReader;
//import java.util.Scanner;
//import java.io.IOException;
//import java.io.FileReader;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Number you want to find the Student");
//        int n=sc.nextInt();
//       try{
//           BufferedReader myFile= new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\serial number.txt"));
//
//            String line= myFile.readLine();
//            boolean track=false;
//            while(line!=null){
//                int sno= Integer.parseInt(line);
//                if(sno==n){
//                    System.out.println("Student found");
//                    track=true;
//                }
//                line= myFile.readLine();
//            }
//            if(!track){
//                System.out.println("NOT FOUND");
//            }
//       }catch (IOException e){
//           System.out.println("An error occurred.");
//
//       }
//    }
//}
