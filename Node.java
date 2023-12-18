public class Node {
    Node nextNode;
    int value;

    public Node(Node node, int value) {
        nextNode = node;
        this.value = value;
    }
}