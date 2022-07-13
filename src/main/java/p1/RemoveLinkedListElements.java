package p1;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode last = new ListNode(6, null);
        ListNode node6 = new ListNode(5, last);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode first = new ListNode(1, node2);
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.value == val) {
            head = head.next;
        }

        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.value == val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
