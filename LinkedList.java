public class LinkedList {
    Node head;

    public void append(int value){
        Node current = head;
        Node previous = head;
        while (current != null) {
            previous = current;
            current = current.nextNode;
        }
        Node newNode = new Node(current, value);
        if (previous == null) {
            head = newNode;
        } else {
            previous.nextNode = newNode;
        }
    }
    public void insertOnTop(int value) {
        Node newNode = new Node(head, value);
        head = newNode;
    }

    @Override
    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result = result + current.value + " -> ";
            current = current.nextNode;
        }
        return result;
    }
}