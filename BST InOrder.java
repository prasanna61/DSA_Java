class Node{
    int data;
    Node left,right;
    public Node(int data) {
        this.data=data;
        left=right=null;
    }
}
public class BstInOrder {
    Node root;
    public BstInOrder() {
        root=null;
    }
    public void insert(int data) {
        root=insertRecursive(root,data);
    }
    public Node insertRecursive(Node root, int data) {
        if(root==null) {
            root=new Node(data);
            return root;
        }
        if(data<root.data) {
            root.left=insertRecursive(root.left,data);
        }
        else if(data>root.data) {
            root.right=insertRecursive(root.right,data);
        }
        return root;
    }
    public void InOrder(Node root) {
        if(root!=null) {

            postOrder(root.left);
            System.out.print(root.data+" ");
            postOrder(root.right);
            
        }
    }
    public static void main(String[] args) {
        BstInOrder b=new BstInOrder();
        b.insert(5);
        b.insert(3);
        b.insert(8);
        b.insert(2);
        b.insert(4);
        b.insert(7);
        b.insert(9);//5,3,2,4,8,7,9
        b.InOrder(b.root);
    }
}
