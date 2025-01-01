import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    private LinkedList<Integer> queue; // Sử dụng LinkedList để quản lý hàng đợi

    public MyQueue() {
        queue = new LinkedList<>();
    }

    // Thêm phần tử vào hàng đợi
    public void enqueue(int item) {
        queue.add(item); // Thêm vào cuối danh sách
    }

    // Lấy phần tử ra khỏi hàng đợi
    public int dequeue() {
        if (!isEmpty()) {
            return queue.remove(0); // Lấy và xóa phần tử đầu tiên
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    // Kiểm tra hàng đợi có rỗng hay không
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Trả về phần tử đầu tiên mà không xóa
    public int peek() {
        if (!isEmpty()) {
            return queue.getFirst();
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    // Trả về số lượng phần tử trong hàng đợi
    public int size() {
        return queue.size();
    }
}
