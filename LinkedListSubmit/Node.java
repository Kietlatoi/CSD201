public class Node {
    private int data;
    public Node next;
    public Node(int data) {
        this.next = null;
        this.data = data;
    }
    public Node() {
    }
    public int ShowData(){
        return data;
    }
}