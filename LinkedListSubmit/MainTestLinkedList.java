public class MainTestLinkedList {
    public static void main(String[] args) {
        // tạo nốt theo thứ tự 1 > 2> 3
        // tạo nốt 3 trước vì 3 là đuôi sau đó thêm 1 2 vào đầu bằng Fistadd
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFist(3);
        myLinkedList.addFist(2);
        myLinkedList.addFist(1);
        myLinkedList.showFullData();

        myLinkedList.getNodeByPosition(3);

        myLinkedList.showFullData();//printListNdoe
        
    }
}
