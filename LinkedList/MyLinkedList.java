import java.util.Scanner;

public class MyLinkedList {

    public Node head;
    public void removeFirst(){
        head = head.next;
    }
    public void removeLast(){
        if(head.next == null){
            head = null;
            return;
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        Node tmpNewLast = head;
        while (tmpNewLast.next != tmp) {
            tmpNewLast =tmpNewLast.next;
        }
        tmpNewLast.next = null;
    }
    public int removeNode () {
        if (head == null){
            System.out.println("vo li roi");
            return 0;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban muon xoa node nao? 1. removeFirst  2.removeLast");
        int a;
        for(;;) {
            a = sc.nextInt();
            if(a == 1 || a== 2)
            break;
            System.out.println("Gion mat ha? Nhap lai di");
        }
        if(a == 1){
           int tmp = head.returnData();
            removeFirst();
            return tmp;
        }
        if(a==2){
            int tmp = head.returnData();
            removeLast();
            return tmp;
        }
        
    }


}