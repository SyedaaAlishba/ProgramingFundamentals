import java.util.Scanner;

public class Strings {
   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n");
       int n = sc.nextInt();
       int FactorialN = 1;
       for (int i = 1; i <= n; i++) {
           FactorialN = FactorialN * i;
       }
       System.out.println("n!"+FactorialN);

       System.out.println("Enter r");
       int r = sc.nextInt();
       int FactorialR = 1;
       for (int j = 1; j <= r; j++) {
           FactorialR = FactorialR * j;
       }
       System.out.println("r!"+FactorialR);
       //n!/r!(n-r)!
       System.out.println("its for (n-r)!");
       int FactoNR = 1;
       for (int j = 1; j <= (n-r); j++) {
           FactoNR = FactoNR * j;
       }
       System.out.println("(n-r)!"+FactoNR);
       int nCr = FactorialN / (FactorialR * FactoNR);
       System.out.println(nCr);
   }
}
