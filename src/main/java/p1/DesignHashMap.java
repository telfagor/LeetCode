package p1;

public class DesignHashMap {
    private static final int BUCKET_SIZE = 1000;
    private final Node[] nodes;

    public DesignHashMap() {
        nodes = new Node[BUCKET_SIZE];
    }

    public void put(int key, int value) {
        int bucketIndex = hashCode(key);
        if (!containsKey(key)) {
            Node node = new Node();
            node.key = key;
            node.value = value;
            if (nodes[bucketIndex] == null) {
                nodes[bucketIndex] = node;
            } else {
                Node currentNode = nodes[bucketIndex];
                while (currentNode.next != null) {
                    currentNode = currentNode.next;
                }
                currentNode.next = node;
            }
        } else {
            Node currentNode = nodes[bucketIndex];
            while (currentNode != null) {
                if (currentNode.key == key) {
                    currentNode.value = value;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public int get(int key) {
        if (containsKey(key)) {
            int bucketIndex = hashCode(key);
            Node currentNode = nodes[bucketIndex];

            while (currentNode != null) {
                if (currentNode.key == key) {
                   return currentNode.value;
                }
                currentNode = currentNode.next;
            }
        }
        return -1;
    }

    public void remove(int key) {
        if (containsKey(key)) {
            int bucketIndex = hashCode(key);
            Node currentNode = nodes[bucketIndex];
            if (currentNode.key == key && currentNode.next == null) {
                nodes[bucketIndex] = null;
                return;
            }

            if (currentNode.key == key) {
                nodes[bucketIndex] = nodes[bucketIndex].next;
                return;
            }

            while (currentNode.next != null) {
                if (currentNode.next.key == key) {
                    currentNode.next = currentNode.next.next;
                    return;
                }
                currentNode = currentNode.next;
            }
        }
    }

    private boolean containsKey(int key) {
        int bucketIndex = hashCode(key);
        if (nodes[bucketIndex] == null) {
            return false;
        }

        Node currentNode = nodes[bucketIndex];
        while (currentNode != null) {
            if (currentNode.key == key) {
                return true;
            }
            currentNode = currentNode.next;
        }

        return false;
    }

    private int hashCode(int key) {
        return key % BUCKET_SIZE;
    }

    private class Node {
        private int key;
        private int value;
        private Node next;
    }
}
