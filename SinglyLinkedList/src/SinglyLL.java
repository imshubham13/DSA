import java.util.Scanner;

public class SinglyLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LLStructure sll = new LLStructure();
        int val, pos, choice;
        boolean check = true;
        while (check) {
            System.out.println("1 ====> Insert At Front");
            System.out.println("2 ====> Insert At End");
            System.out.println("3 ====> Insert At Specific Position");
            System.out.println("4 ====> Delete At Front");
            System.out.println("5 ====> Delete At End");
            System.out.println("6 ====> Delete At Position");
            System.out.println("7 ====> Display");
            System.out.println("Enter Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Values : ");
                    val = sc.nextInt();
                    sll.insertFront(val);
                    break;
                case 2:
                    System.out.println("Enter Values : ");
                    val = sc.nextInt();
                    sll.insertEnd(val);
                    break;
                case 3:
                    System.out.println("Enter Position : ");
                    pos = sc.nextInt();
                    System.out.println("Enter Values : ");
                    val = sc.nextInt();
                    sll.insertPos(pos, val);
                    break;
                case 4:
                    sll.deleteFront();
                    break;
                case 5:
                    sll.deleteAtEnd();
                    break;
                case 6:
                    System.out.println("Enter Position : ");
                    pos = sc.nextInt();
                    sll.deleteAtPos(pos);
                    break;
                case 7:
                    sll.display();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
