 // Bridge in Graphs
 // Bridge is an edge whose deletion increases the graph's number of connected componenets 

 // Tarjan's Algorithms
 // used for find bride, articulation point, SSC, topology sorting

// undirected graph
// Concept - Discovery time & lowest discovery time of all neighbours  
// dt[u] < low[v]

/* 
public static void dfs(ArrayList<Edge> graph[], int curr, int par, boolean vis[], int
dt[], int low[], int time) {
vis[curr] = true;
dt[curr] = low[curr] = ++time;
for(int i=0; i<graph[curr].size(); i++) {
Edge e = graph[curr].get(i);
if(e.dest == par)
continue;
if(vis[e.dest]) {
low[curr] = Math.min(low[curr], dt[e.dest]);
} else {
dfs(graph, e.dest, curr, vis, dt, low, time);
low[curr] = Math.min(low[curr], low[e.dest]);
if(dt[curr] < low[e.dest]) {
System.out.println("BRIDGE : " + curr + "---" + e.dest);
}
}
}
}
public static void getBridge(ArrayList<Edge> graph[], int V) {
int dt[] = new int[V];
int low[] = new int[V];
int time = 0;
boolean vis[] = new boolean[V];
for(int i=0; i<V; i++) {
if(!vis[i]) {
dfs(graph, i, -1, vis, dt, low, time);
}
}
}
*/