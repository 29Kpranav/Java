// undirected and weighted graph
// ArrayList<Edge> graph[]
// Edge =(src,dest,weight)
import java.util.*;

public class graph1 {
    static class Edge{
        int src;
        int dest;
        int wt;
        
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
         graph[i] = new ArrayList<Edge>();   
         // we create empty arraylist at every index of graph beacause we can't store element directly on null 

        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));
         
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));

 }
    public static void main(String args[]){
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        //print 2's neighbours
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" , "+e.wt);
        }
    }
}



/* Adjacency Matrix   - use to represent graph
     
       0  1  2  3
                              this matrix shows neibours or edge between nodes from last graph 
   0 | 0  0  1  0             such as 0 t0 2 we have edge so represent 1
   1 | 0  0  1  1             you can put wt instead of 0 & 1 for weighted graph
   2 | 1  1  0  1             it contains extra space O(v^2) & time to find neibour O(v) because unwanted 0's
   3 | 0  1  1  0
 */


/* Edge List       - another method to represent graph
   
   Edges = {(0,2),(1,2),(1,3),(2,3)}    
*/

/* Implicit graph - represent graph
   2D array
   n*m 
   (i, j) - (n-1, m-1) shortest path
   u can move in 4 directions
   i, j-1 --> i, j --> i,j+1
*/

 // MST using Edge List
