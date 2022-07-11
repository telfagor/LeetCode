package p1;

import java.util.ArrayList;
import java.util.List;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode last = new ListNode(6, null);
        ListNode node6 = new ListNode(5, last);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(6, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode first = new ListNode(1, node2);


    }

    public static ListNode removeElements(ListNode head, int val) {
        List<ListNode> nodeList = new ArrayList<>();
        while (head.next != null) {
            if (head.value != val) {
                nodeList.add(new ListNode(head.value));
            }
            head = head.next;
        }

        for (int i = 0; i < nodeList.size(); i++) {
            nodeList.get(i).next = nodeList.get(i + 1);
        }

        head = nodeList.get(0);
        return head;
    }
}
