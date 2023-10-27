package DSA;
import java.util.*;
public class Graph_Adjecency_List 
{
        // create class edge 
	static class Edge
	{
		int src;       //V-->(src,dest),(2,3)
		int dest;       //ex V(2)-->(2,1)-->(2,4)
		
		Edge(int src,int dest)
		{
			this.src=src;
			this.dest=dest;
		}
	}
	public static void create(ArrayList<Edge>graph[])
	{
		for(int i=0;i<graph.length;i++)  // null to empty
		{
			graph[i]=new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2));     //insert src to dest info
		graph[1].add(new Edge(1,2));
		graph[1].add(new Edge(1,3));
		graph[2].add(new Edge(2,3));
		
		
		
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
            System.out.println(e.src+"---"+e.dest);
		}

	}

}
