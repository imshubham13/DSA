public class ArrayStructure {

    int[] a;
    int size;

    ArrayStructure(int arrSize) {
        if (arrSize < 0) {
            System.out.println("Invalid Array Size");
        } else {
            a = new int[arrSize];
            size = 0;
        }
    }

    void insert_continue(int val) {
        if (size == a.length) {
            System.out.println("Array is Full");
        } else {
            a[size] = val;
            size++;
            System.out.println("Insert Successfully");
            display();
        }
    }

    void insert_position(int pos, int val) {
        if (size == a.length) {
            System.out.println("Array is Full");
        } else {
            for (int i = size - 1; i >= pos - 1; i--) {
                a[i + 1] = a[i];
            }
            a[pos - 1] = val;
            size++;
            System.out.println("Insert successfully");
            display();
        }
    }

    void delete() {
        if (size == 0) {
            System.out.println("Array is Empty");
        } else {
            size--;
            System.out.println("Delete successfully");
            display();
        }
    }

    void delete_first() {
        if (size == 0) {
            System.out.println("Array is Empty");
        } else {
            for (int i = 0; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;
            System.out.println("Delete successfully");
            display();
        }

    }

    void delete_index(int ind) {
        if (size == 0) {
            System.out.println("Array is Empty");
        } else {
            for (int i = ind; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;
        }
    }

    void delete_position(int pos) {
        if (size == 0) {
            System.out.println("Array is Empty");
        } else {
            for (int i = pos - 1; i < size - 1; i++) {
                a[i] = a[i + 1];
            }
            size--;
        }
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
