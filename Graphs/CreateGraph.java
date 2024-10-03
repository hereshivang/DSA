package Graphs;

import java.util.ArrayList;

public class CreateGraph {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[]  graph = new ArrayList[V];
        for(int i=0; i<V; i++){
            graph[i] = new ArrayList<>();
        }
        // 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        //2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //6
        graph[6].add(new Edge(6,5,1));

        //4's Neighbors
        for(int i=0;i<graph[4].size();i++){
            Edge e = graph[4].get(i);
            System.out.println(e.dest);
        }

    }
}
