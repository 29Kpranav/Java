
//Bellman Ford Algorithm

// Dynamic programme  
// dijkstra's algorithms fail when weight or distance is negative but its time complexity is less than bellman ford

import java.util.*;
public class graph15 {
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
graph[1].add(new Edge(1, 2, -4));
graph[2].add(new Edge(2, 3, 2));
graph[3].add(new Edge(3, 4, 4));
graph[4].add(new Edge(4, 1, -1));
}
public static void bellmanFord(ArrayList<Edge> graph[], int src) {
int dist[] = new int[graph.length];
for(int i=0; i<dist.length; i++) {
if(i != src)
dist[i] = Integer.MAX_VALUE;
}
//O(V)
for(int i=0; i<graph.length-1; i++) {   //v-1 times
//edges - O(E)
for(int j=0; j<graph.length; j++) {
for(int k=0; k<graph[j].size(); k++) {
Edge e = graph[j].get(k);
int u = e.src;
int v = e.dest;
int wt = e.wt;
if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {       // dis[u] should not equal to infinity beacause it leads no. to smaller no. in java
dist[v] = dist[u] + wt;
}
}
}
}
//Detecting Negative Weight Cycle

for(int j=0; j<graph.length; j++) {
for(int k=0; k<graph[j].size(); k++) {
Edge e = graph[j].get(k);
int u = e.src;
int v = e.dest;
int wt = e.wt;
if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]) {
System.out.println("negative weight cycle exists");
break;
}
}
}
for(int i=0; i<dist.length; i++) {
System.out.print(dist[i]+" ");
}
System.out.println();
}
public static void main(String args[]) {
int V = 5;
ArrayList<Edge> graph[] = new ArrayList[V];
createGraph(graph);
int src = 0;
bellmanFord(graph, src);
}
}

 

/*
 The outer loop executes N-1 times, because the shortest path can not contain more edges, otherwise the shortest path will contain a loop which can be avoided.
*/

 /*
 The algorithm unlike Djkstra, is not greedy, but dynamic. In the first iteration of the loops it builds one possible path between two vertex and then at each iteration it improves the path by at least one edge. As the shortest path can use maximum n-1 edges, the iteration of the loop continues that much to find the shortest path.
 For negative cycle, algorithm at nth iteration checks one more time to see if an edge exists to decrease the weight of the shortest path having n-1 edges. If yes, then that edge must be negative as the shortest path with all positive edges should be consisted of n-1 not n edges.
 */