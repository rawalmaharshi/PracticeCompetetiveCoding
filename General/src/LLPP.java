import java.util.Scanner;

public class LLPP {

    public static class LLNode {
        int value;
        LLNode next;

        public LLNode(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LLNode getValue (LLNode head, int targetVal) {
        while (head != null) {
            if (head.value == targetVal) {
                return head;
            }
        }
        return null;
    }

    public static void insert(LLNode head, int value) {
        LLNode newNode = new LLNode(value);
        LLNode prev = null;

        while(head != null) {
            if (value < head.value) {
                //if new node is smallest
                if (prev == null) {
                    newNode.next = head;
                    return;
                } else {
                    // if the new node is inserted in the middle
                    prev.next = newNode;
                    newNode.next = head;
                    return;
                }
            }
            prev = head;
            head = head.next;
        }
        //reached the end (here the head = null), newNode is largest
        prev.next = newNode;
        return;
    }

    public static void main(String[] args) {
        LLNode head = takeInput();
        print(head);
//        insert(head, 1);
        insert(head, 7);
//        insert(head, 15);
        print(head);
    }

    public static LLNode takeInput() {
        LLNode head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while (data != -1) {
            LLNode newNode = new LLNode(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        s.close();
        return head;
    }

    public static void print (LLNode head) {

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
}
