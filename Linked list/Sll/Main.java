import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList sll = new SingleLinkedList();
        while (true) {
            System.out.println("Enter 1 for Insert, 2 for Delete and 3 for display");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    int val, l;
                    System.out.println("Enter value and location to insert");
                    val = sc.nextInt();
                    l = sc.nextInt();
                    sll.Insert(val, l);
                    break;
                case 2:
                    int l1;
                    System.out.println("Enter location to delete");
                    l1 = sc.nextInt();
                    sll.Delete(l1);
                    break;
                case 3:
                    sll.display();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}