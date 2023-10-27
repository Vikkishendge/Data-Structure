package DSA;

import java.util.ArrayList;
import java.util.*;

public class KosarajuAlgo 
{
	
  // kosaraju's algorithm to find out the strongly connected component 
	// graph is directed ,
	public static class Edge
	{
		int src;
		int dest;
		public Edge(int s,int d)
		{
			this.src=s;
			this.dest=d;
		}
	}
	
	public static void creation(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,3));
		graph[0].add(new Edge(0,2));
		graph[1].add(new Edge(1,0));
		graph[2].add(new Edge(2,1));
		graph[3].add(new Edge(3,4));

	}
	public static void tsort(ArrayList<Edge> graph[],int curr,boolean vis[],Stack<Integer>stack)
	{
		vis[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(!vis[e.dest])
			{
				tsort(graph,e.dest,vis,stack);
			}
		}
		stack.add(curr);
		System.out.println(curr);
	}
	
	public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[])
	{
		vis[curr]=true;
		System.out.print(curr+" ");
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(!vis[e.dest])
			{
				dfs(graph,e.dest,vis);
			}
				
		}
	}
	public static void kosarajuAlgo(ArrayList<Edge>graph[],int v)
	{
		
		// 1) perform topological sort
		Stack<Integer> stack=new Stack<Integer>();
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!vis[i])
			{
				tsort(graph,i,vis,stack);
			}
		}
		
		//2) transpose the graph means change direction of edges
		// create another graph
		// put the all nodes graph to transponse change direction of edges
		 ArrayList<Edge> transpose[]=new ArrayList[v];
		 for(int i=0;i<v;i++)
			{
				transpose[i]=new ArrayList<Edge>();
			}
		 for(int i=0;i<v;i++)
		 {
			 vis[i]=false;
			 for(int j=0;j<graph[i].size();j++)
			 {
				 Edge e=graph[i].get(j);
				 transpose[e.dest].add(new Edge(e.dest,e.src)); 
			 }
		 }
		 
		 // step 3) pop the stack and perform the dfs on transpose graph
		 
		 while(!stack.isEmpty())
		 {
			 int p=stack.pop();
			 if(!vis[p])
			 {
				 System.out.print("scc:");
				 dfs(transpose,p,vis);
				 System.out.println();
			 }
		 }
		
	}
	
	public static void main(String[] args) 
	{
		int v=5;
	   	 ArrayList<Edge> graph[]=new ArrayList[v];
	   	 creation(graph);
	   	 
	   	 // call kosaraju's algo
	   	 
	   	 kosarajuAlgo(graph,v);
	}

}
