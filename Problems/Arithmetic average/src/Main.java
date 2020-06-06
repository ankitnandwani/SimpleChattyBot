import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;
        int count = 0;

        for(int i=a; i<=b; i++){
            if(i%3==0){
                sum += i;
                count++;
            }
        }

        System.out.println((double) sum/count);
    }
}