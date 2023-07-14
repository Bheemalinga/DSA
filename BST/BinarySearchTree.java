package BST;

// package BST;


// //   All the programs are having their own Nodes so the program throws Exception paste it in other folder and run it.

//     class Node{
//     Node left,right;
//     int data;
//     public Node(int data){ // constructor
//         this.data = data;
//         left = right = null;
//     }
// }

// public class BinarySearchTree {

//     Node root; // root of BST

//     public BinarySearchTree(){ // constructor
//         root = null; // initialize new root to null
//     }

//     void insert(int data){ // inserting new node data
//         root = insertRecursive(root,data); // call insert method    
//     }

//     Node insertRecursive(Node root, int data){
//         if(root == null){
//             root = new Node(data); // if root is null, create new node

//             return root;
//         }
//         if(data < root.data){
//             root.left = insertRecursive(root.left,data); // if data is less than root, insert to left
//         }
//         else if(data > root.data){
//             root.right = insertRecursive(root.right,data);
//         }
//         return root;
//     }

//     void PreOrder(Node root){
//         if(root != null){
//             System.out.println(root.data + " " );
//             PreOrder(root.left);
//             PreOrder(root);
//             PreOrder(root.right);
//         }
//     }


//     public static void main(String[] args) {
//         BinarySearchTree bst = new BinarySearchTree();
//         bst.insert(5);
//         bst.insert(3);
//         bst.insert(8);
//         bst.insert(2);
//         bst.insert(4);
//         bst.insert(7);
//         bst.insert(9);

//         bst.PreOrder(bst.root);
//     }    
// }





class Node{
	Node left,right;
	int data;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class BinarySearchTree {
	Node root;
	public BinarySearchTree() {
		root=null;
	}
	void insert(int data) {
		root=insertRecursive(root,data);
		
	}
	Node insertRecursive(Node root,int data ) {
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
	void preorder(Node root) {
		if(root!=null) {
            //System.out.println();
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}

    void inorder(Node root){
        //System.out.println();
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void postorder(Node root){
        //System.out.println();
        if(root != null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);

        System.out.println("PreOrder : ");
		bst.preorder(bst.root);
		
		// preorder-5,3,2,4,8,7,9
        System.out.println();


        System.out.println("InOrder : ");
        bst.inorder(bst.root);
        System.out.println();


        System.out.println("PostOrder : ");
        bst.postorder(bst.root);
        System.out.println();
	}

}