 
// Dijkstra's Algorithm  - Shortest Distance from the source of all vertices..

// Relaxation 

/*   s               if(dist[u] + wt < dist[v]){
   1 /  \ 5                 dist[v] = dist[u] + wt    ...update
    /    \
   u ---- v            dis[0, 1, 3]
      2                    s  u  v
  
      priority queue - sort queue on the basis of priority

*/
 
import java.security.Permissions;
import java.util.*;
public class graph14{
       static class Edge {
                int src;
                int dest;
                int wt;
        public Edge(int s, int d, int w) {
                this.src = s;
                this.dest = d;
                this.wt = w;
                }
}
static void createGraph(ArrayList<Edge> graph[]) {
                for(int i=0; i<graph.length; i++) {
                graph[i] = new ArrayList<>();
}
                graph[0].add(new Edge(0, 1, 2));
                graph[0].add(new Edge(0, 2, 4));
                graph[1].add(new Edge(1, 3, 7));
                graph[1].add(new Edge(1, 2, 1));
                graph[2].add(new Edge(2, 4, 3));
                graph[3].add(new Edge(3, 5, 1));
                graph[4].add(new Edge(4, 3, 2));
                graph[4].add(new Edge(4, 5, 5));
}
    static class Pair implements Comparable<Pair> {  // due to comparable pair class compaire on the basis of dist
        int n;
        int path;
        public Pair(int n, int path) {
        this.n = n;
        this.path = path;
}
        @Override
        public int compareTo(Pair p2) {    // this helps our priority queue to arrange in ascending order on the basis of dist 
        return this.path - p2.path;
        // return p2.path - this.path;  - descending
        }
        }
public static int[] dijkstra(ArrayList<Edge> graph[], int src) {     // dijkstra's algorithms fail when weight or distance is negative
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<dist.length; i++) {
        if(i != src) {
        dist[i] = Integer.MAX_VALUE;     // if node is not directly connected to each other consider their distance as int.max for furthur comparision
        }
}
        pq.add(new Pair(src, 0));
        while(!pq.isEmpty()) {
        Pair curr = pq.remove(); // remove shortest dis node due to priority queue  curr.n -curr is pair where n is their node 
        if(!vis[curr.n]) {
        vis[curr.n] = true;
        for(int i=0; i<graph[curr.n].size(); i++) {
        Edge e = graph[curr.n].get(i);
        int u = e.src;
        int v = e.dest;
        if(!vis[v] && dist[u]+e.wt < dist[v]) {
        dist[v] = dist[u] + e.wt;      //relaxation
        pq.add(new Pair(v, dist[v]));
        }
     }
   }
}
   return dist;
}
public static void main(String args[]) {
    int V = 6;
    ArrayList<Edge> graph[] = new ArrayList[V];    // <> not use in array of arrayList
    createGraph(graph);
    int src = 0;
    int dist[] = dijkstra(graph, src);
    for(int i=0; i<dist.length; i++) {
    System.out.print(dist[i]+" ");
    }
    System.out.println();
    }
} 