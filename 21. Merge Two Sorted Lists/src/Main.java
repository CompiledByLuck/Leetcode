/*
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
 */

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(-9);
        list1.next = new ListNode(-7);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(-8);
        list2.next = new ListNode(-5);
        list2.next.next = new ListNode(6);

        printList(mergeTwoLists(list1, list2));
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    // in place! inserting into list2 :)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {
            ListNode current = list1;
            ListNode compare = list2;
            while (current != null){
                if (current.val < compare.val){
                    if (compare.next !=null) {
                        list2 = new ListNode(current.val, list2);
                        compare = list2;
                    } else {
                        ListNode tmp = new ListNode(list2.val);
                        list2 = new ListNode(current.val, tmp);
                        compare = list2;
                    }
                    current = current.next;
                } else if (current.val == compare.val) {
                    if (compare.next != null) {
                        ListNode curr = list2;
                        ListNode last = compare;
                        while (curr != null){
                            if (curr.val == compare.val && curr.val <= compare.next.val){
                                last = curr;
                            }
                            curr = curr.next;
                        }
                        ListNode tmp = new ListNode(current.val);
                        tmp.next = last.next;
                        last.next = tmp;
                        current = current.next;
                        compare = compare.next;
                    } else {
                        ListNode curr = list2;
                        while (curr.next != null){
                            curr = curr.next;
                        }
                        curr.next = new ListNode(current.val);
                        current = current.next;
                    }
                } else if (compare.next != null && current.val < compare.next.val){
                    ListNode curr = list2;
                    ListNode last = compare;
                    while (curr != null && current.next != null){
                        if (curr.val == compare.val && curr.next.val != compare.next.val){
                            last = curr.next;
                        }
                        curr = curr.next;
                    }
                    ListNode tmp = new ListNode(current.val);
                    tmp.next = last.next;
                    last.next = tmp;
                    current = current.next;
                    compare = compare.next;
                } else if (compare.next != null){
                    compare = compare.next;
                } else {
                    ListNode curr = list2;
                    while (curr.next != null){
                        curr = curr.next;
                    }
                    curr.next = new ListNode(current.val);
                    current = current.next;
                }
            }
        }
        return list2;
    }
}