/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        printList(head);
        printList(reverseList(head));
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        ListNode new_head = null;
        while (head != null){
            new_head = new ListNode(head.val, new_head);
            head = head.next;
        }
        return new_head;
    }
}