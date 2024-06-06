import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        int n,i,item,count=0;
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many element do u want to enter ");
        n =sc.nextInt();
        a= new int[n];

        System.out.println("Enter Element : ");
        for (i =0; i<a.length;i++)
            a[i] =sc.nextInt();

        System.out.println("Enter Item to find");
        item = sc.nextInt();

        for (i =0; i<a.length;i++)
        {
            if (a[i] == item){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("Item Exist At" + i);
        }else {
            System.out.println("Item does not Exist");
        }
    }
}
