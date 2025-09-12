public class Main {
    public static void Recursion(int n) {
        if (n == 0 ) {
            return;
        }
        System.out.println(n);
        Recursion(n - 1);
    }
    public static void main(String[] args) {
        int n =5;
        Recursion(n);
    }
}