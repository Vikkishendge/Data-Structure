package DSA;

public class Trie_count_unique_substring 
{
		static class Node       // create trie node class
		{
			Node child[];     // it store the charater
			boolean eow;      // if word is end the value is true
			
			public Node()  
			{
				child=new Node[26];  //size of node 26 
				for(int i=0;i<26;i++)
				{ 
					child[i]=null;       // initially null of all array node
				}
				eow=false;       // and not any word
			}
		}
		static Node root=new Node();  // first root is always null
		
	    public static void insert(String str)
	    {
	    	Node newroot=root;
	    	for(int i=0;i<str.length();i++)
	    	{
	    		int index=str.charAt(i)-'a';  // find the index of that character
	    		if(newroot.child[index]==null)   // if not exit any character create new  
	    		{
	    			newroot.child[index]=new Node();  // create new node
	    		}
	    		if(i==str.length()-1)  // if str lenght is end then eow done
	    		{
	    			newroot.child[index].eow=true;
	    		}
	    		newroot=newroot.child[index];
	    		
	    	}
	    }
	   
	 	public static int count(Node root)
	 	{
	 		
	 		if(root==null)
	 		{
	 			return 0;
	 		}
	 		int count=0;
	 		for(int i=0;i<26;i++)
	 		{
	 			if(root.child[i]!=null)
	 			{
	 				count+=count(root.child[i]);
	 			}
	 		}
	 		return count+1;
	 	}
		public static void main(String[] args)
		{
			// count total no.of unique substring 
			   //first find suffix and store in a trie 
			String word="apple";
	        for(int i=0;i<word.length();i++)
	        {
	        	String suffix=word.substring(i);
	        	insert(suffix);
	        }
	        
		   System.out.println(count(root));
		}

	}
