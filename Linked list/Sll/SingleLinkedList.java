public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int len;

    public Node createLinkedList(int val) {
        head = new Node();
        head.data = val;
        head.next = null;
        tail = head;
        return head;
    }

    public Node Insert(int val, int location) {
        if (head == null) {
            createLinkedList(val);
        } else if (location >= len) {
            Node new_node = new Node();
            new_node.data = val;
            new_node.next = null;
            tail.next = new_node;
            tail = new_node;
        } else {
            int index = 0;
            Node temp = head;
            while (index < len) {
                if (index == (location - 1)) {
                    Node new_node = new Node();
                    new_node.data = val;
                    new_node.next = temp.next;
                    temp.next = new_node;
                }
                temp = temp.next;
                index++;
            }
        }
        len = len + 1;
        return head;
    }

    public Node Delete(int location) {
        if ((location - 1) == 0) {
            head = head.next;
        } else {
            int index = 0;
            Node temp = head;
            while (index < (len - 1)) {
                if (index == (location - 2)) {
                    temp.next = temp.next.next;
                    break;
                }

                temp = temp.next;
                index++;
            }
            if (location == (len - 1)) {
                tail = temp;
            }
        }
        len = len - 1;
        return head;

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}