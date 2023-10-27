package DSA;

import java.util.*;

public class BFS
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
        graph[1].add(new edge(1,3));
        graph[2].add(new edge(2,4));
        graph[3].add(new edge(3,5));
        graph[3].add(new edge(4,5));
        graph[5].add(new edge(5,6));
        


    }
    // BSF traversal
    public static void BFSTraversal(ArrayList<edge> graph[],int v)
    {
    	Queue<Integer>queue=new LinkedList();
    	boolean visited[]=new boolean[v];
    	
    	queue.add(0);
    	while(!queue.isEmpty())
    	{
    		int curr=queue.remove();
    		if(visited[curr]==false)
    		{
    		System.out.print(curr+" ");
    		visited[curr]=true;
    		
    		for(int i=0;i<graph[curr].size();i++)
    		{
    			edge e=graph[curr].get(i);
    			queue.add(e.dest);
    		}
    	}
    	}
    }
    public static void main(String args[])
    {
        int vertex=7;
         ArrayList<edge> graph[]=new ArrayList[vertex]; 
         create(graph);

         for(int i=0;i<graph[0].size();i++)
         {
             edge e=graph[0].get(i);
             System.out.print(e.dest+" ");
         }
         System.out.println();
         BFSTraversal(graph,vertex);
    }
}