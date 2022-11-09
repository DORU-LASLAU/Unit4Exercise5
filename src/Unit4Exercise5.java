
import java.util.Scanner;
public class Unit4Exercise5 {
    public static void main(String[] args) {
        int [] array = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");

        for ( int i = 0; i< array.length; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            array[i] = sc.nextInt();
        }

        for (int i = array.length-1; i>= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
