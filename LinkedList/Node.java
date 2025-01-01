public class Node {
    private int data;
    public Node next;
    public Node() {
        next  = null;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public int returnData (){
        return data;
    }
    
}
