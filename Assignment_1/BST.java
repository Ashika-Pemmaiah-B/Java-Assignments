package java_training;

public class BST
{
	 class Node 
	 { 
	        int key; 
	        Node left, right; 
	        Node(int data)
	        { 
	            key = data; 
	            left = right = null; 
	        } 
	   } 
	   Node root; 
	   BST()
	   { 
	        root = null; 
	   } 

	   void insert(int key)  
	   { 
	       root = insert_Recursive(root, key); 
	   } 
	   Node insert_Recursive(Node root, int key) 
	   { 
	       if(root == null) 
	           root = new Node(key); 
	       else if(key < root.key)
	            root.left = insert_Recursive(root.left, key); 
	       else
	            root.right = insert_Recursive(root.right, key); 
	       return root; 
	    } 
	   
	   void display() 
	   { 
		   System.out.print("Inorder Traversal:  ");
		   inorder(root);
		   System.out.print("\nPreorder Traversal:  ");
		   preorder(root);
		   System.out.print("\nPostorder Traversal:  ");
		   postorder(root);
	   }
	   
	   void inorder(Node root) 
	   {
	        if(root !=  null) 
	        {
	            inorder(root.left);
	            System.out.print(root.key+" ");
	            inorder(root.right);
	        }
	    }
	   
	   void preorder(Node root) 
	   {
	        if(root !=  null) 
	        {
	        	System.out.print(root.key+" ");
	            preorder(root.left);
	            preorder(root.right);
	        }
	    }
	   
	   void postorder(Node root) 
	   {
	        if(root !=  null) 
	        {
	            postorder(root.left);
	            postorder(root.right);
	            System.out.print(root.key+" ");
	        }
	    }
	   
	   public static void main(String[] args)  
	    { 
	        BST bst = new BST(); 
	        bst.insert(45); 
	        bst.insert(10); 
	        bst.insert(7); 
	        bst.insert(12); 
	        bst.insert(90); 
	        bst.insert(50); 
	        System.out.println("Created Binary Search tree:"); 
	        bst.display(); 
	     } 
}