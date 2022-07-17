package p1;

import java.util.Random;

public class MergeNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        final ListNode first = head;

        for (int i = 0; i < 9; i++) {
            head.next = new ListNode(new Random().nextInt(5));
            head = head.next;
        }

        head.next = new ListNode(0);
        head = first;

        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }

        head = first;

        MergeNodes obj = new MergeNodes();
        ListNode result = obj.mergeNodes(head);

        System.out.println();
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }

    public ListNode mergeNodes(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode currentNode = head.next;
        ListNode newNodeList = new ListNode(0);
        ListNode newNodeList2 = newNodeList;

        while (currentNode != null && currentNode.value == 0) {
            currentNode = currentNode.next;
        }

        ListNode modifyNode = currentNode;
        while (currentNode != null) {
            if (currentNode.value != 0) {
                currentNode = currentNode.next;
            } else {
                while (modifyNode != currentNode) {
                    newNodeList.value += modifyNode.value;
                    modifyNode = modifyNode.next;
                }

                if (currentNode.next != null) {
                    newNodeList.next = new ListNode(0);
                }

                currentNode = currentNode.next;
                newNodeList = newNodeList.next;
            }
        }
        head = newNodeList2;
        return head;
    }
}
