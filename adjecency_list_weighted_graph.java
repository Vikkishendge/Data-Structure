package DSA;
import java.util.*;
public class adjecency_list_weighted_graph
{
        // create class edge 
	static class Edge
	{
		int src;       
		int dest;      
		int weight;
		
		Edge(int src,int dest,int weight)
		{
			this.src=src;
			this.dest=dest;
			this.weight=weight;
		}
	}
	public static void create(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)  // null to empty
		{
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2,10));     //insert src to dest info
		graph[1].add(new Edge(1,2,5));
		graph[1].add(new Edge(1,3,12));
		graph[2].add(new Edge(2,1,5));
		graph[2].add(new Edge(2,3,9));
		graph[2].add(new Edge(2,0,10));
		graph[3].add(new Edge(3,2,9));
		graph[3].add(new Edge(3,1,12));
			}
	public static void main(String[] args) 
	{
		int v=4;
		ArrayList<Edge> graph[]=new ArrayList[v]; // array as arraylist
		create(graph);
		
		// print the destination of any source(vertex)
		
		for(int i=0;i<graph[2].size();i++)
		{
			Edge e=graph[2].get(i);  // in graph 2nd index get all arraylist 
            System.out.println(e.src+"---"+e.dest+",weight:"+e.weight);
		}

	}

}
