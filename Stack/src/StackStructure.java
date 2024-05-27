public class StackStructure {

    int[] a;
    int top;

    StackStructure(int size) {
        if (size < 0) {
            System.out.println("Invalid Size");
        } else {
            a = new int[size];
            top = 0;
        }
    }

    void push(int val) {
        if (top == a.length) {
            System.out.println("Stack is Full");
        } else {
            a[top] = val;
            top++;
            System.out.println("Insert Successfully");
            peek();
        }
    }

    void pop() {
        if (top == 0) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            System.out.println("Delete Successfully");
            peek();
        }
    }

    void peek() {
        if (top == 0) {
            System.out.println("Stack is Empty");
        } else if (top == a.length) {
            System.out.println("Stack is Full");
        } else {
            for (int i = 0; i < top; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
