package p1;

public class ConvertBinaryNumber {
    public static void main(String[] args) {
        ListNode last = new ListNode(1, null);
        ListNode node2 = new ListNode(0, last);
        ListNode head = new ListNode(1, node2);

        int result = getDecimalValue(head);
        System.out.println(result);
    }

    public static int getDecimalValue(ListNode head) {
        int result = head.value;
        while (head.next != null) {
            result = result * 2 + head.next.value;
            head = head.next;
        }
        return result;
    }
}
