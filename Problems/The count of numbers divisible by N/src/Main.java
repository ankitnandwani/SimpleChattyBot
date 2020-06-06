import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int n = s.nextInt();
        int count = 0;

        for (int i = a; i <= b; i++){
            if (i%n == 0) count++;
        }

        System.out.println(count);
    }
}