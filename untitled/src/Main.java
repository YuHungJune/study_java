import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int A, B, V;
        A = input.nextInt();
        B = input.nextInt();
        V = input.nextInt();

        double day = (V - B)/(A - B);


        if((V - B)%(A - B) != 0)
            System.out.println((int)(++day));
        else {
            System.out.println((int)day);
        }
    }
}