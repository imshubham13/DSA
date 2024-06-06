import java.util.Scanner;

public class binary_search {
    public static void main(String[] args) {
        int n, i, item, count = 0, begin, end, mid = 0;
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do u want to enter ");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter Element : ");
        for (i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter Item to find");
        item = sc.nextInt();

        begin = 0;
        end = n - 1;

        while (begin <= end) {
            mid = (begin + end) / 2;
            if (item == a[mid]) {
                count++;
                break;
            } else if (item > a[mid]) {
                begin = mid + 1;
            } else if (item < a[mid]) {
                end = mid - 1;
            }
        }
        if (count > 0) {
            System.out.println("Item found at " + mid);
        }else{
            System.out.println("Item does not Exist");
        }
    }
}
