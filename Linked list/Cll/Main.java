class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.Insert(4, 0);
        // System.out.println(cll.len);
        cll.Insert(5, 2);
        // System.out.println(cll.len);
        cll.Insert(3, 3);
        cll.Insert(2, 4);
        cll.printAll();
        System.out.println("\n");
        cll.Delete(2);
        cll.printAll();
    }
}