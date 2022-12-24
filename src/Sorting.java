import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Size of Array a: ");
        a = inp.nextInt();
        int[] list = new int[a];
        System.out.println("Enter The Numbers: ");

        for (int i = 0; i < a; i++) {
            System.out.print("Enter The " + (i+1) + "." + "Number : ");
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Sorting : " + Arrays.toString(list));
    }
}