import java.util.ArrayList;

/*Qs - Course Schedule (Facebook/Coinbase/Intuit)

There are a total of numCourses courses you have to take, labeled from 0 to
numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai,bi]
 indicates that you must take course bi first if you want to take course ai.
For example, the pair [0, 1], indicates that to take course 0 you have to first take
course 1.
Return true if you can finish all courses. Otherwise, return false.
Example 1
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0. So it is possible.
Example 2
Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you
should also have finished course 1. So it is impossible.

Practice online : https://leetcode.com/problems/course-schedule/ */


class Solution{
    ArrayList<Integer> adj[];
    boolean visited[];
    boolean marked[];
    public boolean canFinish(int numCourses, int prerequisites[][]){
        adj = new ArrayList[numCourses];
        for(int i=0; i< numCourses; i++){
            adj[i] = new ArrayList<>();           // making adjecency list
        }
        visited = new boolean[numCourses];
        marked = new boolean[numCourses];
        
        for(int i=0; i< prerequisites.length; i++){
            adj[prerequisites[i][0]].add(prerequisites[i][1]);   // created adjecency list
        }

        for(int i=0; i< numCourses; i++){
            if(!visited[i]){
                if(isCycle(i)){        // if isCyclic true return false
                    return false;
                }
            }
        }
        return true;
 }
    boolean isCycle(int i){
        visited[i] = true;
        for(Integer j : adj[i]){   // visiting adjecent vertex
            if(!visited[j]){
                if(isCycle(j)){
                    return true;
                }
            }
            else if(!marked[j]){  ////
                return true;
            }
        }
        marked[i] = true;
        return false;
    }
}


/* we need topology sort which tells dependency , if graph contains cycle topology invalid */