package p1;

import java.util.Arrays;

public class DesignHashSet {
    private static final int BUCKET_SIZE = 1000;
    static Node[] nodes;

    public DesignHashSet() {
        nodes = new Node[BUCKET_SIZE];
    }

    public void add(int key) {
        if (!contains(key)) {
            Node node = new Node();
            node.value = key;
            int bucketIndex = hashCode(key);
            if (nodes[bucketIndex] == null) {
                nodes[bucketIndex] = node;
            } else {
                Node currentNode = nodes[bucketIndex];
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = node;
            }
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            int bucketIndex = hashCode(key);
            Node currentNode = nodes[bucketIndex];

            if (currentNode.value == key && currentNode.next == null) {
                nodes[bucketIndex] = null;
                return;
            }

            if (currentNode.value == key) {
                nodes[bucketIndex] = currentNode.next;
                return;
            }

            while (currentNode.next != null) {
                if (currentNode.next.value == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }
    public boolean contains(int key) {
        int bucketIndex = hashCode(key);
        if (nodes[bucketIndex] == null) {
            return false;
        }

        Node iterator = nodes[bucketIndex];
        while (iterator != null) {
            if (iterator.value == key) {
                return true;
            }
            iterator = iterator.next;
        }
        return false;
    }

    private int hashCode(int key) {
        return key % BUCKET_SIZE;
    }

    class Node {
        private int value;
        private Node next;

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        String s = "abc";
        System.out.println(a + b + s);


        DesignHashSet obj = new DesignHashSet();
        System.out.println(obj.contains(5));
        obj.add(1);
        System.out.println(Arrays.toString(nodes));
        obj.add(2);
        System.out.println(Arrays.toString(nodes));
        System.out.println(obj.contains(1));
        System.out.println(obj.contains(3));
        obj.add(2);
        System.out.println(Arrays.toString(nodes));
        System.out.println(obj.contains(2));
        obj.remove(2);
        System.out.println(Arrays.toString(nodes));
    }
}
