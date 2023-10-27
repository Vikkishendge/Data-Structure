package DSA;
import java.util.*;
public class Cycle_Deletection_Undirected_Graph 
{

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
			graph[0].add(new Edge(0,1));
			graph[1].add(new Edge(1,2));
			
			graph[1].add(new Edge(1,3));
			graph[2].add(new Edge(2,0));
			
			
			
				}
		
		public static boolean isCycleDetection(ArrayList<Edge>graph[],boolean vis[],int curr,int par)
		{
			vis[curr]=true;
			for(int i=0;i<graph[curr].size();i++)
			{
				Edge e=graph[curr].get(i);
				if(vis[e.dest] && e.dest!=par)
				{
					return true;
				}
				else
					if(!vis[e.dest])
					{
						if(isCycleDetection(graph,vis,e.dest,curr))
						{
							return true;
						}
					}
			}
			return false;
		}
		public static void main(String[] args) 
		{
			int v=4;
			ArrayList<Edge> graph[]=new ArrayList[v]; // array as arraylist
			create(graph);
			
			// print the destination of any source(vertex)
			
			System.out.println(isCycleDetection(graph,new boolean[v],0,-1));
		}

	}

