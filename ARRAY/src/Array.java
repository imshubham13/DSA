import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalElement;
        System.out.println("Enter Array Size : ");
        totalElement = sc.nextInt();

        ArrayStructure array = new ArrayStructure(totalElement);

        int val, pos, choice;
        boolean check = true;

        while (check) {
            System.out.println("1 =====> Insert Continue");
            System.out.println("2 =====> Insert Specific Position");
            System.out.println("3 =====> Delete At End");
            System.out.println("4 =====> Delete At Front");
            System.out.println("5 =====> Delete Index");
            System.out.println("6 =====> Delete Position");
            System.out.println("7 =====> Display");
            System.out.println("8 =====> Exit");
            System.out.println("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Value : ");
                    val = sc.nextInt();
                    array.insert_continue(val);
                    break;

                case 2:
                    System.out.print("Enter Position : ");
                    pos = sc.nextInt();
                    System.out.print("Enter New Value : ");
                    val = sc.nextInt();
                    array.insert_position(pos, val);
                    break;

                case 3:
                    array.delete();
                    break;

                case 4:
                    array.delete_first();
                    break;

                case 5:
                    System.out.print("Enter Index : ");
                    pos = sc.nextInt();
                    array.delete_index(pos);
                    break;

                case 6:
                    System.out.println("Enter Position : ");
                    pos = sc.nextInt();
                    array.delete_position(pos);
                    break;

                case 7:
                    array.display();
                    break;

                case 8:
                    check = false;
                    break;
            }
        }
    }
}
