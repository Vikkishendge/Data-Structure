package DSA;
import java.util.*;
public class Dijkstra 
{
	public static class Edge
	{
		int src;
		int dest;
		int wt;
		
		public Edge(int src,int dest,int wt)
		{
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}

	public static void create(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1,4));
		graph[0].add(new Edge(0,2,4));
		graph[1].add(new Edge(1,2,2));
		graph[2].add(new Edge(2,3,3));
		graph[2].add(new Edge(2,4,1));
		graph[3].add(new Edge(3,5,2));
		graph[4].add(new Edge(4,5,3));
	}
	
	public static class Pair implements Comparable<Pair>
	{
		int node;
		int dist;
		
		public Pair(int node,int dest)
		{
			this.node=node;
			this.dist=dest;
		}
		public int compareTo(Pair p2)
		{
			return this.dist-p2.dist;
		}
		
	}
	public static void dijkstra(ArrayList<Edge>graph[],int src,int v)
	{
		PriorityQueue<Pair> pq=new PriorityQueue<Pair>(v);
		int dist[]=new int[v];
		boolean vis[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(i!=src)
			{
			dist[i]=Integer.MAX_VALUE;
			}
		}
		pq.add(new Pair(0,0));
		
		while(!pq.isEmpty())
		{
			Pair p=pq.remove();
			if(!vis[p.node])
			{
				vis[p.node]=true;
				
				for(int i=0;i<graph[p.node].size();i++)
				{
					Edge e=graph[p.node].get(i);
					int u=e.src;
					int V=e.dest;
					
					if(dist[u]+e.wt < dist[V])
					{
						dist[V]=dist[u]+e.wt;
						pq.add(new Pair(V,dist[V]));
					}
				}
			}
		}
		for(int i=0;i<v;i++)
		{
			System.out.print(dist[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int v=6;
		ArrayList<Edge>graph[]=new ArrayList[v];
		create(graph);
		for(int i=0;i<graph[0].size();i++)
		{
			Edge e=graph[0].get(i);
			System.out.println(e.src+"->"+e.dest);
		}
		
		dijkstra(graph,0,v);
		
	}

}
