package p1;

import java.util.Arrays;

public class DesignHashSet {
    private static final int BUCKET_SIZE = 1000;
    static Node[] nodes;

    public DesignHashSet() {
        nodes = new Node[1000];
    }

    public void add(int key) {
        int bucketIndex = hashCode(key);
        if (nodes[bucketIndex] == null) {
            Node node = new Node();
            node.value = key;
            nodes[bucketIndex] = node;
        } else {
            Node iterator = nodes[bucketIndex];
            boolean isExist = false;
            while (iterator.next != null) {
                if (iterator.value == key) {
                    isExist = true;
                    break;
                }
                iterator = iterator.next;
            }
            if (!isExist) {
                Node node = new Node();
                node.value = key;
                iterator.next = node;
            }
        }
    }

    public void remove(int key) {
        if (contains(key)) {
            int bucketIndex = hashCode(key);
            Node iterator = nodes[bucketIndex];
            if (iterator.value == key && iterator.next == null) {
                nodes[bucketIndex] = null;
            }
            if (iterator.value == key && iterator.next != null) {
                nodes[bucketIndex] = iterator.next;
                return;
            }
            while (iterator != null && iterator.next != null) {
                if (iterator.value == key) {
                    iterator.next = iterator.next.next;
                    break;
                }
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
