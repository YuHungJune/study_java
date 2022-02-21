import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int num1, num2;
        int[] array = new int[100];
        int count = 0;
        int i = 0;

        Scanner input = new Scanner(System.in);
        do{
            num1 = input.nextInt();
            num2 = input.nextInt();
            array[i++] = (num1+ num2);
            count++;
        }while(input.hasNextInt());
        input.close();

        for(int j = 0; j < count; j++){
            System.out.println(array[j]);
        }

    }
}