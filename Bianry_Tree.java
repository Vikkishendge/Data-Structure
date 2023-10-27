package DSA;
import java.util.Scanner;
//class Node 
//{
//	int data;
//	Node left,right;
//	public Node(int data)
//	{
//		this.data=data;
//		this.left=null;
//		this.right=null;
//	}
//}

public class Bianry_Tree 
{
	static class Node 
	{
		int data;
		Node left,right;
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	static Node create()
	{
		
		Scanner sc=new Scanner(System.in);
		Node root=null;
		int data;
		System.out.println("Enter the value:");
		data=sc.nextInt();
		root=new Node(data);
		if(data==-1)
			return null;
		
		System.out.println("Enter the left child of "+data);
		root.left=create();
		System.out.println("Enter the right child of "+data);
		root.right=create();
		return root;
		
	}
	static void inorder(Node root)
	{
		
		if(root==null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+"\t");
		inorder(root.right);
	}
	static void preorder(Node root)
	{
		
		if(root==null)
			return;
		System.out.print(root.data+"\t");
		inorder(root.left);
		
		inorder(root.right);
	}
	static void postorder(Node root)
	{
		
		if(root==null)
			return;
		
		inorder(root.left);
		
		inorder(root.right);
		System.out.print(root.data+"\t");
	}
	
	static int count(Node root)
	{
		if(root==null)
		{
				return 0;
		}
		int left=count(root.left);
		int right=count(root.right);
		return left + right + 1;
	}
	static int sumNode(Node root)
	{
		if(root==null)
			return 0;
		
		int leftSum=sumNode(root.left);
		int rightSum=sumNode(root.right);
		
		return leftSum +rightSum + root.data;
	}
	static int height(Node root)
	{
		if(root==null)
			return 0;
		
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		int total_height=Math.max(leftheight, rightheight)+1;
		return total_height;
	}
	public static void main(String[] args) 
	{
		Node root=create();
		System.out.println("Inorder:");
		inorder(root);
		System.out.println("\nPreorder");
		preorder(root);
		System.out.println("\nPostorder");
		postorder(root);
		
		System.out.println("\nNumber of Nodes:");
		int totalcount=count(root);
		System.out.println(totalcount);
		
		System.out.println("Sum of Nodes:");
		System.out.println(sumNode(root));
		
		// height of tree calculate using Math.max( , ) function
        System.out.println("Height of Tree");
        System.out.println(height(root));
	}

}
