import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_Element;
        System.out.println("Enter Element : ");
        total_Element = sc.nextInt();

        StackStructure stack = new StackStructure(total_Element);

        int val, choice;
        boolean check = true;

        while (check) {
            System.out.println("1 ====> Push");
            System.out.println("2 ====> Pop");
            System.out.println("3 ====> Peek");
            System.out.println("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter values : ");
                    val = sc.nextInt();
                    stack.push(val);
                    break;

                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }
}
