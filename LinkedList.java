class Node {
	Object item;
	Node next;
}
public class LinkedList {
	private int size;
	private Node head;
	public LinkedList() {
		this.size=0;
		this.head=null;
	}
	public void insertingNode(String i) {
		Node node=new Node();
		node.item=i;
		if(head==null) {
			head=node;
			head.next=null;
			this.size=1;
			System.out.println(this.head.toString());
		}
		else {
			Node current=this.head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
			node.next=null;
			this.size++;
		}
	}
	public void addAtFirst(String i) {
		Node node=new Node();
		node.item=i;
		node.next=head;
		head=node;
		this.size++;
	}
	public void addAtLast(String i) {
		Node node=new Node();
		node.item=i;
		Node current=this.head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=node;
		node.next=null;
		this.size++;
	}
	public void addAtMiddle(String i,int pos) {
		Node node=new Node();
		node.item=i;
		Node current=this.head;
		Node prevnode=null;
		if (this.head != null && pos <= this.size) {
            for (int j = 0; j < pos; j++) {
                prevnode=current;
            	current = current.next;
               
            }
            node.next = prevnode.next;
            prevnode.next = node;
            this.size += 1;
        } else {
            System.out.println("position is greater than size");
        }
	}
	public void deleteAtFirst() {
		Node current=this.head;
		if(this.head==null) {
			System.out.println("List is empty");
			return;
		}
		this.head=null;
		head=current.next;
		
		this.size--;
	}
	public void deleteAtLast() {
          Node current=this.head;
          while(current.next!=null){
              current=current.next;
          }
          //System.out.println(current.item);
          current=null;
          this.size-=1;
	}
	public void deleteAtMiddle(int pos) {
		Node current=this.head;
		Node prevnode=null;
		//if (this.head != null && pos <= this.size) {
            for (int j = 0; j < pos; j++) {
                prevnode=current;
            	current = current.next;
               
            }
             prevnode.next = current.next;
            this.size -= 1;
		
	}
	public void display() {
		Node current=this.head;
		for(int i=0;i<this.size;i++) {
			System.out.print(current.item+"->");
			current=current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList L=new LinkedList();
		L.insertingNode("a");
		L.addAtFirst("this");
		L.addAtMiddle("is", 1);
		L.addAtLast("list");
		//L.deleteAtFirst();
		//L.deleteAtLast();
		L.deleteAtMiddle(2);
		L.display();
	}

}
