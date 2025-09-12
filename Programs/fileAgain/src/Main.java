//import java.io.FileReader;
//import java.io.IOException;
//public class Main {
//    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt");
//            int data=reader.read();
//            while(data!=-1){
//                System.out.print((char)data);
//                data=reader.read();
//            }
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}




//QUESTION 2:
//How to determine if the file is not opened?

//import java.io.FileNotFoundException;
//import java.io.FileReader;
//public class Main {
//    public static void main(String[] args) {
//        try {
//            FileReader reader = new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt");
//            System.out.println("File Opened");
//        }catch (FileNotFoundException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}


//QUESTION 4: How to keep on reading one line from the opened file and print each line. When all line are read, prints the message "END OF THE FILE HAS REACHED"
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.Buffer;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//           BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt"));
//            String line = reader.readLine();
//            while(line!=null){
//                System.out.println(line);
//               line=reader.readLine();
//            }
//            System.out.println("END OF THE FILE HAS REACHED");
//            reader.close();
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}







//QUESTION 3: How to read one line from the opened file?

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt"));
//            String line = reader.readLine();
//            System.out.println(line);
//            reader.close();
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//    }
//}

//QUESTION 5:
//How to clos`we the file if it was opened other wise print the message "File was not opened".

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        BufferedReader reader = null; // declare outside try so we can access in finally
//
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt"));
//            String line;
//
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//        } catch (IOException e) {
//            System.out.println("File not found or cannot be opened");
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();  // only close if it's opened
//                    System.out.println("File closed successfully");
//                } else {
//                    System.out.println("File was not opened");
//                }
//            } catch (IOException e) {
//                System.out.println("Error closing the file");
//            }
//        }
//    }
//}


//QUESTION 6:
//Suppose the line that you read from the file contains TAB delimited data; how to convert that line into fields.

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//           BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt"));
//            String line = reader.readLine();
//            while(line!=null){
//                for (int i = 0; i <line.length() ; i++) {
//                    if (line.charAt(i) == '\t') {
//                        System.out.println(); // newline for each field
//                    } else {
//                        System.out.print(line.charAt(i)); // print characters of the field
//                    }
//                }
//
//               line=reader.readLine();
//            }
//            System.out.println("END OF THE FILE HAS REACHED");
//            reader.close();
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}




//QUESTION 7:
//Write a loop that prints all the fields extracted from the line.

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.Buffer;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//           BufferedReader reader = new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\menue.txt.txt"));
//            String line = reader.readLine();
//            while(line!=null){
//                for (int i = 0; i <line.length() ; i++) {
//                    if (line.charAt(i) == ' ') {
//                        System.out.println(); // newline for each field
//                    } else {
//                        System.out.print(line.charAt(i)); // print characters of the field
//                    }
//                }
//
//               line=reader.readLine();
//            }
//            System.out.println("END OF THE FILE HAS REACHED");
//            reader.close();
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}


//QUESTION 8:
//Suppose that each splitted line contains following SIX  fields
//
//ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonID
//
//Write code that prints the amount that the buyer has to pay for the item described in the line.








//Q-9 Write a loop to read each line from the file and print the total of all the items purchased.
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        BufferedReader reader=null;
//        double total=0;
//        try {
//            reader = new BufferedReader( new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"));
//
//            String line=reader.readLine();
//            line= reader.readLine();
//            while(line!=null){
//                String[]fields=line.split("\t");
//                double uP= Double.parseDouble(fields[2]);
//                int qty= Integer.parseInt(fields[3]);
//                double amount = uP * qty;
//                total += amount;
//                line = reader.readLine();
//            }
//            System.out.println("Total of all items purchased: " + total);
//
//
//        }catch(IOException e){
//            System.out.println("ERROR FOUND");
//        }
//    }
//}
//

//
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        BufferedReader reader = null;
//        double totalAmount = 0;
//
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"));
//            String line = reader.readLine(); // Skip the header
//
//            line = reader.readLine(); // Read the first data line
//            while (line != null) {
//                String[] fields = line.split("\t");
//
//                // Assuming: ItemCode, Product, UnitPrice, Qty, Date, RepID
//                double unitPrice = Double.parseDouble(fields[2]);
//                int qty = Integer.parseInt(fields[3]);
//
//                double amount = unitPrice * qty;
//                totalAmount += amount;
//                System.out.println("Total of all items purchased: " + totalAmount);
//                line = reader.readLine(); // Read next line
//            }
//
//
//        } catch (IOException e) {
//            System.out.println("File not found or error reading file.");
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch (IOException e) {
//                System.out.println("Error closing file.");
//            }
//        }
//    }
//}




//QUESTION 8:
//Suppose that each splitted line contains following SIX  fields
//
//ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonID
//
//Write code that prints the amount that the buyer has to pay for the item described in the line.

//
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String [][] arr=new String[5][6];
//        int r=0;
//
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\price.txt"));
//
//            String line= reader.readLine();
//            line= reader.readLine();
//            while(line!=null && r<5){
//                String [] val= line.split("\t");
//                for (int col = 0; col < val.length && col < 6; col++) {
//                    arr[r][col] = val[col];
//                }
//                r++;
//                line= reader.readLine();
//            }
//            reader.close();
//            System.out.print("Enter Item Code: ");
//            String c= sc.nextLine();
//
//            boolean found = false;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[i].length ; j++) {
//
//                    if (arr[i][j] != null && arr[i][j].equals(c))
//                    {
//                        System.out.println("Item Found!");
//                        System.out.println("Price: " + arr[i][2]); // Price is in column 2
//                        found = true;
//                        break;
//                    }
//                }
//            }
//            if (!found) {
//                System.out.println("Item Code not found.");
//            }
//        }catch (IOException e){
//            System.out.println("NOT FOUND");
//        }
//
//    }
//}


//QUESTION 9:
//Write a loop to read each line from the file and print the total of all the items purchased.
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String [][] arr=new String[5][6];
//        int r=0;
//
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\price.txt"));
//
//            String line= reader.readLine();
//            line= reader.readLine();
//            while(line!=null && r<5){
//                String[] val = line.trim().split("\\t");
//                for (int col = 0; col < val.length && col < 6; col++) {
//                    arr[r][col] = val[col];
//                }
//                r++;
//                line= reader.readLine();
//            }
//            reader.close();
//            int p=0;
//            int qty=0;
//            int t=0;
//            boolean found = false;
//            System.out.println("To Stop Purchasing Item enter s");
//            System.out.print("Enter Item Code: ");
//            String c= sc.nextLine();
//            while (!c.equals("s")) {
//                found =false;
//
//                for (int i = 0; i < arr.length; i++) {
//
//                    if (arr[i][0] != null && arr[i][0].trim().equals(c)) {
//                           p= Integer.parseInt(arr[i][2].trim()); // Price is in column 2
//                         qty = Integer.parseInt(arr[i][3].trim());
//                          t += p * qty;
//                            found = true;
//                    }
//                }
//
//                System.out.println("Enter Item Code for purchasing more");
//                c= sc.nextLine();
//
//                if (!found) {
//                    System.out.println("Item Code not found.");
//                }
//            }
//            System.out.println("TOTAL Price is"+t);
//
//
//            }catch (IOException e){
//                System.out.println("NOT FOUND");
//            }
//
//        }
//    }



//QUESTION 10:
//Write code that asks the user for an itemCode and prints the total of the quantity of that item purchased by any of the customer.



//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        BufferedReader reader;
//        System.out.print("Enter Item Code to get total quantity sold: ");
//        String inputCode = sc.nextLine().trim();
//        int totalQty = 0;
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"));
//
//            String line= reader.readLine();
//            line= reader.readLine();
//            while(line!=null){
//                String[] val = line.trim().split("\\t");
//               if(val.length>=4) {
//                   String itemCode = val[0].trim();
//                   int qty = Integer.parseInt(val[3].trim());
//
//                   if (itemCode.equalsIgnoreCase(inputCode)) {
//                       totalQty += qty;
//                   }
//               }
//                line= reader.readLine();
//            }
//            reader.close();
//            System.out.println("total amount is"+totalQty);
//
//            }catch (IOException e){
//                System.out.println("NOT FOUND");
//            }
//
//        }
//    }


//QUESTION 11:
//Write java code to display month wise sales

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        BufferedReader reader;
//        System.out.print("Enter Month to get Month wise Sales:");
//        int m = sc.nextInt();
//        int t = 0;
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"));
//
//            String line= reader.readLine();
//            line= reader.readLine();
//            while(line!=null){
//                String[] val = line.trim().split("\\t");
//               if(val.length>=4) {
//                   String[] dateParts = val[4].trim().split("/");
//                   int month = Integer.parseInt(dateParts[0]);
//                   int UP= Integer.parseInt(val[2].trim());
//                   int qty=Integer.parseInt(val[3].trim());
//                   if(m==month){
//                        t+=UP*qty;
//                   }
//               }
//                line= reader.readLine();
//            }
//            System.out.println("Your Total month Sale is "+t);
//            reader.close();
//
//            }catch (IOException e){
//                System.out.println("NOT FOUND");
//            }
//
//        }
//    }


//QUESTION 12
//Write java code that prints all the record sorted in descending order with respect to sales amount



//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        BufferedReader reader;
//        int UP,qty;
//        int c=0;
//        int[] a_sale=new int[10000];
//        try {
//            reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"));
//
//            String line= reader.readLine();
//            line= reader.readLine();
//            while(line!=null){
//                String[] val = line.trim().split("\\t");
//               if(val.length>=2) {
//                    UP= Integer.parseInt(val[2]);
//                    qty=Integer.parseInt(val[3]);
//                    a_sale[c++]=UP*qty;
//               }
//                line= reader.readLine();
//            }
//            reader.close();
//            for (int i = 0; i < c - 1; i++) {
//                for (int j = i + 1; j < c; j++) {
//                    if (a_sale[i] < a_sale[j]) {
//                        int temp = a_sale[i];
//                        a_sale[i] = a_sale[j];
//                        a_sale[j] = temp;
//                    }
//                }
//            }
//            for(int i = 0; i < c; i++) {
//                System.out.println("Sale: " + a_sale[i]);
//            }
//
//
//            }catch (IOException e){
//                System.out.println("NOT FOUND");
//            }
//
//        }
//    }




//q9



//Q9
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\price.txt"))) {
//            String line;
//            reader.readLine();
//            int sum = 0;
//            int quantity;
//            while ((line = reader.readLine()) != null) {
//                String[] lines = line.split("(\\s+)");
//                quantity = Integer.parseInt(lines[4]);
//                sum = sum + quantity;
//            }
//            System.out.println("work done!");
//            System.out.println(sum);
//        } catch (IOException e) {
//            System.out.println("input error");
//        }
//    }
//}


////Write code that asks the user for an itemCode and prints the total of the quantity of that item purchased by any of the customer.
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\syeda\\OneDrive\\Documents\\amount.txt"))) {
//
//            String inputcode=sc.nextLine().trim();
//            int t=0;
//            String itemCode;
//
//            String line = reader.readLine();
//            line = reader.readLine();
//
//            while(line!=null){
//                String []val=line.split("\\t");
//                if(val.length>=3){
//                    itemCode=val[0].trim();
//                    int qty= Integer.parseInt(val[3].trim());
//                    if(inputcode.equalsIgnoreCase(itemCode)) {
//                        t = t + qty;
//                    }
//                }
//                line= reader.readLine();
//            }
//            System.out.println("Total qty "+t);
//
//        } catch (IOException e) {
//            System.out.println("input error");
//        }
//    }
//}