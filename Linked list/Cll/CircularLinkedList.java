import javax.lang.model.element.Element;

public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int len;

    public Node Create(int num) {
        head = new Node();
        head.data = num;
        head.next = head;
        tail = head;
        len = 1;
        return head;
    }

    public Node Insert(int data, int location) {
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;
        if (head == null) {
            Create(data);
        } else if (location > len) {
            tail.next = new_node;
            new_node.next = head;
            tail = new_node;
            len = len + 1;
        } else if (head != null && location == 0) {
            tail.next = new_node;
            new_node.next = head;
            head = new_node;
            len = len + 1;
        } else {
            int i = 0;
            Node temp = head;
            while (i < (location - 1)) {
                temp = temp.next;
                i++;
            }
            new_node.next = temp.next;
            temp.next = new_node;
            len = len + 1;
        }
        return head;
    }

    public Node Delete(int location) {
        if (head == null) {
            System.out.println("No Cll created");
            return null;
        } else if (location == 0) {
            tail.next = head.next;
            head = head.next;
            return head;
        } else if (location == (len - 1)) {
            Node temp = head;
            while (temp.next.next != head) {
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
            return head;
        } else {
            int i = 0;
            Node temp = head;
            while (i < (location - 1)) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            return head;
        }
    }

    public void printAll() {
        Node temp = head;
        while (temp.next != head) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}