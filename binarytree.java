class TreeNode{ 
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int value){
		this.value = value;
		right = left = null;
	}
}

public class binarytree{
    static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }
    static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2); 
        root.right = new TreeNode(3); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5); 

        System.out.println("Preorder traversal of binary tree is "); 
        preOrder(root); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        inOrder(root); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        postOrder(root); 
    }
}