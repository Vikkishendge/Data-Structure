package DSA;

public class Trie_data_structure
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
    public static boolean search(String key)
    {
    	Node newroot=root;
    	for(int i=0;i<key.length();i++)
    	{
    		int index=key.charAt(i)-'a';
    		Node node=newroot.child[index];
    	    
    		if(node==null)
    		{
    			return false;
    		}else
    		if(i==key.length()-1 && node.eow==false)
    		{
    			return false;
    		}
    		newroot=newroot.child[index];
    	}
    	return true;
    }
    
    public static boolean breakword(String key)
    {
    	if(key.length()==0)
    	{
    		return true;
    	}
    	for(int i=1;i<=key.length();i++)
    	{
    		String firstpart=key.substring(0,i);
    		String secondpart=key.substring(i);
    		
    		if(search(firstpart) && breakword(secondpart))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean Prefix(String prefix)
    {
    	Node curr=root;
    	for(int i=0;i<prefix.length();i++)
    	{
    		int indx=prefix.charAt(i)-'a';
    		if(curr.child[indx]==null)
    		{
    			return false;
    		}
    		curr=curr.child[indx];
    	}
    	return true;
    }
	public static void main(String[] args)
	{
		String word[]= {"hello","any","head","not"};
        for(int i=0;i<word.length;i++)
        {
        	insert(word[i]);
        }
        // search the words
        System.out.println(search("hello"));
        System.out.println(search("head"));
        System.out.println(search("sfj"));
        
        // break words  word[]= {"hello","any","head","not"};
        //key=helloanynot     break:'hello any not' is there return true 
        String key="hellonotany";
        System.out.println("Check key is given or not:"+breakword(key));  
	   
        // prefix check if the prefix is exits or not
        // ex prefix=heal ; is exits in trie 
	
	   String prefixkey="hel";
	   System.out.println("Prefix Exits:"+Prefix(prefixkey));
	
	    
	   
	}

}
