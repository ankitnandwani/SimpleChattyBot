import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int numOfParts = s.nextInt();
        int ready = 0;
        int large = 0;
        int small = 0;

        for(int i=0 ;i<numOfParts; i++){
            int input = s.nextInt();
            if(input ==0 ) ready++;
            else if(input == 1) large++;
            else if(input == -1) small++;
        }

        System.out.println(ready + " " + large + " " + small);
    }
}