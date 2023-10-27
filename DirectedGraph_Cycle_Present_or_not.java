package DSA;
import java.util.*;
public class DirectedGraph_Cycle_Present_or_not 
{
		
		    static class edge
		    {
		        int src;
		        int dest;

		        edge(int src,int dest)
		        {
		            this.src=src;
		            this.dest=dest;

		        }
		    }
		    public static void create(ArrayList<edge> graph[])
		    {
		        
		        for(int i=0;i<graph.length;i++)
		        {
		            graph[i]=new ArrayList<edge>();
		        }

		        graph[0].add(new edge(0,1));
		        graph[0].add(new edge(0,2));
		       
		        graph[2].add(new edge(2,3));
		        graph[3].add(new edge(3,4));
		        		        


		    }
		    // Directed graph cycle present or not check
		    public static boolean isCycle(ArrayList<edge> graph[],boolean vis[],int curr,boolean stack[])
		    {
		    vis[curr]=true;
		    stack[curr]=true;
		    for(int i=0;i<graph[curr].size();i++)
		    {
		    	edge e=graph[curr].get(i);
		    	if(stack[e.dest])
		    	{
		    		return true;
		    	}
		    	else
		    		if(!vis[e.dest])
		    		{
		    			if(isCycle(graph,vis,e.dest,stack))
		    			{
		    				return true;
		    			}
		    		}
		    }
		    stack[curr]=false;
		    return false;
		    	
}
    public static void main(String args[])
     {
       int v=5;  
       ArrayList<edge> graph[]=new ArrayList[v]; 
        create(graph);
        
        if(isCycle(graph,new boolean[v],0,new boolean[v]))
        {
        	System.out.println("Cycle is present in Directed Graph");
        }else
        {
        	System.out.println("Cycle is not present in Directed Graph");
        }
        
          
    }
}
