package DSA;
import java.util.ArrayList;
import java.util.Scanner;
public class BST 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
public static Node insert(Node root,int data)
{
	if(root==null)
	{
		root=new Node(data);
	}
	if(root.data>data)
	{
		root.left=insert(root.left,data);
	}else
		if(root.data<data)
	{
		root.right=insert(root.right,data);
	}
	return root;
	
}
public static void inorder(Node root)
{
	if(root==null)
		return;
	
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}
public static void preorder(Node root)
{
	if(root==null)
		return;
	System.out.print(root.data+" ");	
	inorder(root.left);

	inorder(root.right);
}
public static boolean search(Node root,int key)
{
	if(root==null)
	return false;
	
	if(root.data>key)
	{
		return search(root.left,key);
	}
	else
		if(root.data==key)
		{
			return true;
		}
		else
		{
			return search(root.right,key);
		}
	
}
public static Node delete(Node root,int del)
{
	if(root.data>del)
	{
		root.left=delete(root.left,del);
	}else
		if(root.data<del)
		{
			root.right=delete(root.right,del);
		}
		else
		{
			if(root.left==null && root.right==null)
			{
				return null;
			}else
			if(root.left==null)
			{
				return root.right;
			}else
			if(root.right==null)
			{
				return root.left;
			}
			
			Node ISuccessor=InorderSuccessor(root.right);
			root.data=ISuccessor.data;
			root.right=delete(root.right,ISuccessor.data);
			
		}

	return root;
	
	
}
	public static Node InorderSuccessor(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
    }
	
	public static void PrintRange(Node root,int x,int y)
	{
		if(root==null)
		{
			return;
		}
		if(root.data>=x && root.data<=y)
		{
			PrintRange(root.left,x,y);
			System.out.print(root.data+" ");
			PrintRange(root.right,x,y);
		}
		else
			if(root.data>=y)
			{
				PrintRange(root.left,x,y);
			}else
			{
				PrintRange(root.right,x,y);
			}
	}
	
	// print the all path in tree
	public static void PrintPath(ArrayList<Integer>item)
	{
		System.out.print("Path:");
		for(int i=0;i<item.size();i++)
		{
			System.out.print("-->"+item.get(i));
		}
		System.out.println();
	}
	public static void Path(Node root,ArrayList<Integer>item)
	{
		if(root==null)
		{
			return;
		}
		item.add(root.data);
		if(root.left==null && root.right==null)
		{
			PrintPath(item);
		}else
		{
			Path(root.left,item);
			Path(root.right,item);
		}
		item.remove(item.size()-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int data = 0,ch;
		Node root=null;
		do
		{
			System.out.println("\n----------------------------");
			System.out.println("1)Insert \t2)Traverse \n3)Search \t4)Delete \n5)Range \t6)Path");
			System.out.println("----------------------------");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("\nEnter the Node data:");
				data=sc.nextInt();
				root=insert(root,data);
				break;
				
			case 2:
				inorder(root);
				System.out.println("");
				preorder(root);
				break;
			case 3:
				System.out.println("Enter the key to be search:");
				int key=sc.nextInt();
				if(search(root,key))
				{
					System.out.println("Found");
				}else
				{
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter the node delete:");
				int del=sc.nextInt();
				root=delete(root,del);
				break;
				
			case 5:
				System.out.println("Enter the Range of x & y:");
				int x=sc.nextInt();
				int y=sc.nextInt();
				PrintRange(root,x,y);
				break;
				
			case 6:
				Path(root,new ArrayList<Integer>());
			}
		}while(data!=-1);

		
	}

}
