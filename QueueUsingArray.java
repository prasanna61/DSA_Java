public class Queueds {
	private static Object[] queuearr;
	private static int size;
	private int rear;
	private int front=0;
	public Queueds(int size) {
		this.size=size;
		this.rear=-1;
		queuearr=new Object[size];
	}
	public void enqueue(Object i) {
		if(rear==size-1) {
			System.out.println("Queue is full");
			return;
		}
		rear+=1;
		queuearr[rear]=i;
		
	}
	public Object dequeue() {
		if(rear==-1) {
			System.out.println("queue is empty");
		}
		Object data=queuearr[front];
		queuearr[front]=null;
		front++;
		return data;
	}
	public Object peek() {
		return queuearr[front];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queueds q=new Queueds(6);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		System.out.println(q.dequeue());
		for(int i=0;i<size;i++) {
			System.out.println(queuearr[i]);
	}

}
}
