package CrackingTheCodingInterview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BFSGraph {
	
	
    public static class Graph {
        

    	int size;
    	Vertex[] vertices;
    	
    	public static class Vertex
    	{
    		int id;
    		List<Integer> edges;
    		Vertex(int id)
    		{
    			this.id=id;
    			edges=new ArrayList<>();
    		}
    	}
    	
    	
        public Graph(int size) {
            this.size=size;
            vertices=new Vertex[size];
            for(int i=0;i<size;i++)
            	vertices[i]=new Vertex(i);
        }

        public void addEdge(int first, int second) {
        	
           /* if(vertices[first]==null)
            	vertices[first]=new Vertex(first);
            */
            vertices[first].edges.add(second);
            
          /*  if(vertices[second]==null)
            	vertices[second]=new Vertex(second);*/
            
            vertices[second].edges.add(first);
        }
        
        public int[] shortestReach(int startId) { // 0 indexed
            
        	int[] dist=new int[size];

        	for(int i=0;i<size;i++)
        	{
        		if(i==startId)
        			dist[i]=0;
        		else
        			dist[i]=-1;
        	}
        	
        	Queue<Vertex> queue=new LinkedList<>();
        	queue.add(vertices[startId]);
        	
        	while(!queue.isEmpty())
        	{
        		Vertex vertex=queue.remove();
        		
        		List<Integer> edge=vertex.edges;
        		if(edge!=null)
	        		for(int node:edge)
	        		{
	        			if(dist[node]==-1)
	        			{
		        			dist[node]=dist[vertex.id]+6;
		        			queue.add(vertices[node]);
	        			}
	        		}
        		
        	}
        	return dist;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);
 
            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();            
        }
        
        scanner.close();
    }
}
