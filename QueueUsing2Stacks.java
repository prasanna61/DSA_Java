import java.util.*;
public class QueueUsingTwoStacks<T> {
    private Stack<T> insertionStack;
    private Stack<T> deletionStack;

    public QueueUsingTwoStacks() {
        insertionStack = new Stack<>();
        deletionStack = new Stack<>();
    }
    public void enqueue(T item) {
        insertionStack.push(item);
    }
    public T dequeue() {
        if(deletionStack.isEmpty()) {
            while(!insertionStack.isEmpty()) {
                deletionStack.push(insertionStack.pop());
            }
        }
        return deletionStack.pop();
    }
    public T peek() {
        if(deletionStack.isEmpty()) {
            while(!insertionStack.isEmpty()) {
                deletionStack.push(insertionStack.pop());
            }
        }
        return deletionStack.peek();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks q=new QueueUsingTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
