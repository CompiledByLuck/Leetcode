/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */
public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        deleteDuplicates(head);
        printList(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if (head == null) return null;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else current = current.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}