import java.util.ArrayList;

/*Qs - Find Eventual Safe States (Amazon/Adobe)

There is a directed graph of n nodes with each node labeled from 0 to n - 1. The
graph is represented by a 0-indexed 2D integer array graph where graph[i] is an
integer array of nodes adjacent to node i, meaning there is an edge from node i to
each node in graph[i].
A node is a terminal node if there are no outgoing edges. A node is a safe node if
every possible path starting from that node leads to a terminal node (or another
safe node).
Return an array containing all the safe nodes of the graph. The answer should be
sorted in ascending order.
Example 1
Input: graph = [[1,2],[2,3],[5],[0],[5],[],[]]
Output: [2,4,5,6]
Explanation: The given graph is shown above.
Nodes 5 and 6 are terminal nodes as there are no outgoing edges from either of
them.
Every path starting at nodes 2, 4, 5, and 6 all lead to either node 5 or 6.
Example 2
Input: graph = [[1,2,3,4],[1,2],[3,4],[0,4],[]]
Output: [4]
Explanation:
Only node 4 is a terminal node, and every path starting at node 4 leads to node 4.

Practice online :
https://leetcode.com/problems/find-eventual-safe-states/description/ */


class Solution2 {
    public ArrayList<Integer> eventualSafeNodes(int[][] graph) {
        
        //This question is totally same as "Detect a cycle in directed graph"
        
        //We just need to make a minor change, to add check list, 
        //"if the node is node a part of cycle, that means it's safe node"
        
        boolean[] vis = new boolean[graph.length];
        boolean[] pathvis = new boolean[graph.length];
        boolean[] check = new boolean[graph.length];
        for(int i=0;i<graph.length; i++){
            if(vis[i]!=true){
                dfs(i,graph,vis,pathvis,check); //DON"T BREAK OUT IF YOU FIND A CYCLE, MAKE CHECKS FOR ALL NODES
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<check.length; i++){
            if(check[i]==true){                     //CHECK IF IT"S A SAFE NODE
                list.add(i);
            }
        }
        return list;
    }
    
    public boolean dfs(int node, int[][] graph, boolean[] vis, boolean[] pathvis,boolean[] check){
        vis[node] = true;
        pathvis[node] = true;
        
        for(int e: graph[node]){
            if(vis[e]!=true){
                if(dfs(e,graph,vis,pathvis,check)==true){
                    check[node] = false;
                    return true;
                }
            } else if(pathvis[e]==true){
                check[node] = false;
                return true;
            }
        }
        
        check[node] = true;             // MARKING CHECK ONLY IF IT"S NOT A PART OF CYCLE
        pathvis[node] = false;          //
        return false;
    }
}







/* 
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        int[] indegree = new int[V];
        
        for(int i=0; i<V; i++)
            adj.add(new ArrayList<>());
        
        // Reverse the directed edges of the graph
        // Because we want here the outdegree int this question
        
        for(int i=0; i<graph.length; i++){
            for(int it: graph[i]){
                adj.get(it).add(i);
                indegree[i]++;
            }
        }
        
        // After reversing the graph we will simply return the topological sort for all the indegrees zero
        // If any node doesn't reaches indegree zero 
        // that means it has another indegree as well and it can't be safe node
        
        return topo(adj,indegree);
    }
    
    public List<Integer> topo(List<List<Integer>> adj, int[] indegree){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<adj.size(); i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            res.add(node);
            
            for(Integer adjacent: adj.get(node)){
                indegree[adjacent]--;
                if(indegree[adjacent]==0){
                    queue.offer(adjacent);
                }
            }
        }
        
        Collections.sort(res);
        return res;
    }
}
 */