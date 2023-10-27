package DSA;
import java.util.*;

import DSA.Dijkstra.Pair;
public class PrimsAlgo 
{
	public static class Edge
	{
		int src;
		int dest;
		int wt;
		
		public Edge(int s,int d,int w)
		{
			this.src=s;
			this.dest=d;
			this.wt=w;
		}
	}
	public static void create(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)
		{
			graph[i]=new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,2,15));
		graph[0].add(new Edge(0,3,30));
		graph[1].add(new Edge(1,3,40));
		graph[2].add(new Edge(2,3,50));
	}
	
	public static void primsAlgo(ArrayList<Edge>[] graph,int src,int v)
	{
	   PriorityQueue<Pair> pq=new PriorityQueue<Pair>(v);
	   boolean vis[]=new boolean[v];
	   pq.add(new Pair(0,0));
	   int cost=0;
	   while(!pq.isEmpty())
	   {
		 Pair p=pq.remove();
		 if(!vis[p.node])
		 {
			 vis[p.node]=true;
			 cost+=p.dist;
			 for(int i=0;i<graph[p.node].size();i++)
			 {
				 Edge e=graph[p.node].get(i);
				  if(!vis[e.dest])
				  {
				     pq.add(new Pair(e.dest,e.wt));
				  }
			 }
		 }
	   }
	   System.out.println("Minimum Spanning Tree is:"+cost);
	}
	public static void main(String[] args) 
	{
		// prims algorithm use to find the minimum spanning tree
        // that all nodes are connect but minimum edge weight
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v];
		create(graph);
		for(int i=0;i<graph[0].size();i++)
		{
			Edge e=graph[0].get(i);
			System.out.println(e.src+"--_"+e.wt+"_--> "+e.dest);
		}
		
		primsAlgo(graph,0,v);
	}

}
