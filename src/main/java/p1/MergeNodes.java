package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeNodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        final ListNode first = head;

        for (int i = 0; i < 9; i++) {
            head.next = new ListNode(new Random().nextInt(5));
            head = head.next;
        }

        ListNode last = new ListNode(0);
        head.next = last;
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

        List<ListNode> nodes = new ArrayList<>();
        List<ListNode> sumNodes = new ArrayList<>();

        int start = 0;
        int end = 0;
        int sum = 0;
        while (head != null) {
            if (head.value != 0) {
                nodes.add(head);
                end++;
            } else {
                while (start < end) {
                    sum += nodes.get(start).value;
                    start++;
                }
                if (sum > 0) {
                    sumNodes.add(new ListNode(sum));
                }
            }
            sum = 0;
            head = head.next;
        }

        for (int i = 0; i < sumNodes.size() - 1; i++) {
            sumNodes.get(i).next = sumNodes.get(i + 1);
        }

        head = sumNodes.get(0);
        return head;
    }
}
