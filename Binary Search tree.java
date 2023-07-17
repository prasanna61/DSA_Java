class Node{
    int data;
    Node left,right;
    public Node(int data) {
        this.data=data;
        left=right=null;
    }
}
public class BST {
    Node root;
    int data;
    public BST leftchild,rightchild;
    public BST(int value) {
        root=null;
        this.data=value;
        this.leftchild=null;
        this.rightchild=null;
    }
    public void insert(int data) {
        root=insertRecursive(root,data);
    }
    public Node insertRecursive(Node root,int data) {
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
    public void preOrder(Node root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }
    public  boolean search(int data,BST current) {
        boolean b = false;
        if (current == null) {
            return false;
        } else {
            if (current.data == this.data) {
                return true;
            } else if (data < current.data) {
                return search(data, current.leftchild);
            } else {
                return search(data, current.rightchild);
            }
        }
    }
    public static void main(String[] args) {
        BST b=new BST(1);
        b.insert(5);
        b.insert(3);
        b.insert(8);
        b.insert(2);
        b.insert(4);
        b.insert(7);
        b.insert(9);
        System.out.println(b.search(2,b));//5,3,2,4,8,7,9
        b.preOrder(b.root);
    }
}
