package DSA;
import java.util.*;

public class Topological_sort 
{
	public static class Edge
	{
		int src;
		int dest;
		public Edge(int src,int dest)
		{
		   this.src=src;
		   this.dest=dest;
		}
	}
	public static void creation(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(2,3));
		graph[0].add(new Edge(3,1));
		graph[1].add(new Edge(4,1));
		graph[2].add(new Edge(4,0));
		graph[3].add(new Edge(5,0));
		graph[4].add(new Edge(5,2));
	}
	
	public static void topological(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>stack)
	{
		vis[curr]=true;
		
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(!vis[e.dest])
			{
				topological(graph,e.dest,vis,stack);
			}
		}
		stack.add(curr);
		
	}
	public static void tlogical(ArrayList<Edge>graph[],int v)
	{
		boolean vis[]=new boolean[v];
		Stack<Integer>stack=new Stack();
		for(int i=0;i<v;i++)
		{
			if(!vis[i])
			{
				topological(graph,i,vis,stack);
			}
		}
		
		while(!stack.isEmpty())
		{
			
			System.out.print(stack.pop()+" ");
		}
	}
	public static void main(String[] args) 
	{
		// topological sort is always directed acyclic graph with no cycle
		// it is linear order sort its dependency u--->v
		//u comes after v 
		//ex- 1)buy laptop-->install os--> install code editor-->write code
		int v=6;
		ArrayList<Edge>graph[]=new ArrayList[v];
		creation(graph);
		// using dfs we perform topological sort
		
       tlogical(graph,v);
	}

}
