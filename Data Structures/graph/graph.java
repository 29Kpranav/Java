 /*Graph is network of nodes
   every node is known as vertex, connection between two nodes is known as edge

   edge have two types based on direction 
   i) uni-directional....0 to 1
   ii) bi-directional / undirectional....0 t0 1 & 1 to 0 or no fix direction

   edge have two types based on weight
   i)weighted graph - every edge have weight, weight can be distance,time also can be undirected weighted graph or directed weighted graph 
   ii)un-weighted graph - no weight also can be undirected unweighted graph or directed unweighted graph 

   application of graph are as follows.. Map for shortest path, Social Network for connection betn followers , Delivery Network shortest cyclic path

   Graph can make or Storing by 4 ways..

   1)Adjecency List - also known as list of lists  it's list of edge
                      size of graph is total no. of vertexes, to store every vertex we use thier neibhours
                      we will store graph in form of array of arrayList


                      0                           here v = 4,  vertex wise      its undirected unweighted graph
                              3                   0 --> {0, 2}     1-->{1, 2}, {1, 3}     2-->{2, 0},{2, 1},{2, 3}    3-->{3, 1}, {3, 2}
                         2         1                    source-0 
                                                        des-2
                    
                    ArrayList<edge> graph[v] --> edges are stored in arrayList and arrayList is stored in array named as graph having size v                                   
 */
import java.util.*;
 public class graph{
    static class Edge{
        int src;
        int dest;
        
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
           for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();   
            // we create empty arraylist at every index of graph beacause we can't store element directly on null 

           }

           graph[0].add(new Edge(0, 2));

           graph[1].add(new Edge(1, 2));
           graph[1].add(new Edge(1, 3));

           graph[2].add(new Edge(2, 0));
           graph[2].add(new Edge(2, 1));
           graph[2].add(new Edge(2, 3));
            
           graph[3].add(new Edge(3, 1));
           graph[3].add(new Edge(3, 2));

    }
    public static void main(String args[]){        
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //print 2's neighbours
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest+" ");
        }

    }
    public int orangesRotting(int[][] grid) {
        return 0;
    } 
 }


 /* 
   2)Adjecency Matrix
   3)Edge List
   4)2D Matrix (Implicit graph)




  */