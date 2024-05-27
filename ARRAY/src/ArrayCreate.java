import java.util.Scanner;

public class ArrayCreate {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int size, loc, item, i;

        // Enter Size of Array
        System.out.println("Enter Array Size : ");
        size = r.nextInt();

        // Size Increment After array input
        int[] a = new int[size + 1];

        // Enter Element of Array
        System.out.println("Enter Element : ");
        for (i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }

        // Enter Location of Element
        System.out.println("Enter Location : ");
        loc = r.nextInt();

        // Enter New Element
        System.out.println("Enter New Item : ");
        item = r.nextInt();

        if(loc <= 0 || loc > size+1)
        {
            System.out.println("Invalid Position");
        }
        else
        {
            for (i = size-1; i > loc-1; i--) {
                 a[i + 1] = a[i] ;
            }
            a[loc-1] = item;
            size++;
        }
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
