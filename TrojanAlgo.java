package DSA;

import java.util.ArrayList;

import DSA.Topological_sort.Edge;

public class TrojanAlgo 
{
     // trojan algorithm can be used to find out the bridge between two cmponent
	
	/*
	 *   1------0------3-----4
	 *   |     /   |    \    /
	 *   |    / bridge   \  /
	 *   |   /            \/
	 *    2/               5  
	        
		 
	                --vikas Shendge 
	 *
	 *
	 */
	
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
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		graph[0].add(new Edge(0,3));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,2));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		
		graph[3].add(new Edge(3,0));
		graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,3));
		graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		graph[5].add(new Edge(5,4));
		}
//	public static void dfs(ArrayList<Edge>graph[],int curr,boolean vis[])
//	{
//		vis[curr]=true;
//	    System.out.print(curr+" ");
//		for(int j=0;j<graph[curr].size();j++)
//		{
//			Edge e=graph[curr].get(j);
//			if(!vis[e.dest])
//			{
//				dfs(graph,e.dest,vis);
//			}
//		}
//	}

	public static void dfs(ArrayList<Edge>graph[],int curr,int parent,int dt[],
			int low[],int time,boolean vis[])
	{
		vis[curr]=true;
		dt[curr]=low[curr]=++time;
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			
			if(e.dest==parent)
			{
				continue;
			}
			else
			if(vis[e.dest])
			{
				low[curr]=Math.min(low[curr], dt[e.dest]);
			}
			else
			{
				dfs(graph,e.dest,curr,dt,low,time,vis);
				low[curr]=Math.min(low[curr],low[e.dest]);
				if(dt[curr]<low[e.dest])
				{
					System.out.println("Bridge :"+e.src+"----"+e.dest);
				}
			}
		}
	}
	
	public static void trojan(ArrayList<Edge>graph[],int v)
	{
		int dt[]=new int[v]; //discover array 
		int low[]=new int[v]; // lowest array
		int time=0;
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(!vis[i])
			{
				dfs(graph,i,-1,dt,low,time,vis);
			}
		}
	}
	public static void main(String[] args)
	{
		int v=6;
		ArrayList<Edge>graph[]=new ArrayList[v];
		creation(graph);	
		
//		boolean vis[]=new boolean[v];
//	for(int i=0;i<v;i++)
//	{
//		if(!vis[i])
//		{
//		dfs(graph,i,vis);
//		}
//	}
		
		trojan(graph,v);
	}
	

}
