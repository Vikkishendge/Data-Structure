package DSA;
import java.util.*;
public class Bellman_ford_Algorithm 
{
	public static class Edge
	{
		int src;
		int dest;
		int wt;
		
		Edge(int src,int dest,int wt)
		{
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	public static void creation(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		graph[1].add(new Edge(1,2,-4));
		graph[2].add(new Edge(2,3,2));
		graph[3].add(new Edge(3,4,4));
		graph[4].add(new Edge(4,1,-1));
	}
	public static void bellman(ArrayList<Edge>graph[],int src,int v)
	{
		int dist[]=new int[v];
		for(int i=0;i<v;i++)
		{
			if(i!=src)
			{
				dist[i]=Integer.MAX_VALUE;
			}
		}
		for(int k=0;k<v-1;k++)
		{
			for(int i=0;i<v;i++)
			{
				for(int j=0;j<graph[i].size();j++)
				{
					Edge e=graph[i].get(j);
					int u=e.src;
					int V=e.dest;
					
					if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.wt <dist[V])
					{
						dist[V]=dist[u]+e.wt;
					}
				}
			}
		}
		for(int i=0;i<v;i++)
		{
			System.out.print(dist[i]+" ");
		}
	}
  // same as dijkstra algo .find the sortest distance but it works on negative weight
	// but it doesn't work on negative cycle 
	public static void main(String[] args) 
	{
       int v=5;
       ArrayList<Edge> graph[]=new ArrayList[v];
       creation(graph);
       
       bellman(graph,0,v);
	}

}
