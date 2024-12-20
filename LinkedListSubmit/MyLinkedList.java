
public class MyLinkedList {
    public Node heaNode;

    public void addFist(int data){
        Node newNode = new Node(data);
        if (heaNode == null) {
            heaNode = newNode;
        }
        else {
            newNode.next = heaNode;
            heaNode = newNode;
        }
    }

    public void showFullData(){
        if(heaNode == null) {
            System.out.println("Linked List của bạn chưa có gì cả");
            return;
        }
        Node tmp = heaNode;
        while (tmp != null) {
           System.out.println("Data : " + tmp.ShowData());
           tmp = tmp.next;
        } 
    }

    public void getNodeByPosition (int index) {
        if(index  < 0){
            System.out.println("Khung ha may");
            return;
        }
        Node tmp = heaNode;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            if(tmp == null){
                System.out.println("Khung ha may");
                return;
            }
        }
        System.out.println(tmp.ShowData());
        
    }
}
