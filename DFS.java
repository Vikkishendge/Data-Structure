package DSA;
import java.util.*;
public class DFS 
{
	public static class Edge
	{
		int src;
		int dest;
		
		Edge(int src,int dest)
		{
			this.src=src;
			this.dest=dest;
		}
	}
public static void create(ArrayList<Edge>graph[])
{
	for(int i=0;i<graph.length;i++)
	{
		graph[i]=new ArrayList<Edge>();
	}
		
	graph[0].add(new Edge(0,1));
	graph[0].add(new Edge(0,2));
	graph[1].add(new Edge(1,3));
	graph[2].add(new Edge(2,4));
	graph[3].add(new Edge(3,4));
	graph[3].add(new Edge(3,5));
	graph[4].add(new Edge(4,5));
	graph[5].add(new Edge(5,6));
	
}
public static void dfs(ArrayList<Edge>graph[],int curr,boolean visite[])
{
	System.out.print(curr+" ");
	visite[curr]=true;
		for(int i=0;i<graph[curr].size();i++)
		{
			Edge e=graph[curr].get(i);
			if(visite[e.dest]==false)
			dfs(graph,e.dest,visite);
		}
	
}
	public static void main(String[] args) 
	{
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		create(graph);
		
/*		for(int i=0;i<graph[0].size();i++)
		{
			Edge e=graph[0].get(i);
			System.out.println(e.dest);*/
		// DFS traversal
		boolean visit[]=new boolean[v];
		dfs(graph,0,visit);
		}

}
