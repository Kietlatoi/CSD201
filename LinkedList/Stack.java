import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stack; 

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1); 
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            throw new IllegalStateException("Stack is empty");
        }
    }

    public int size() {
        return stack.size();
    }
}
