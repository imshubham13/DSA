import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size, loc, i;

        // Enter Size of Array
        System.out.println("Enter Array Size : ");
        size = r.nextInt();

        int[] a = new int[size];

        // Enter Element of Array
        System.out.println("Enter Element : ");
        for (i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }

        // Enter Location of Element
        System.out.println("Enter Location : ");
        loc = r.nextInt();

        for (i = loc; i < size - 1; i++) {
            a[i] = a[i + 1];
        }
        size--;

        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
