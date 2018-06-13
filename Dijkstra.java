package com.hackercode.utilities;

public class Dijkstra {

    public static void dij(int[][] graph ,int src , int[] visited){

        int inf=999,v=0;
        int[] distance=new int[5];
        distance=graph[src];
        visited[src]=1;
        distance[src]=0;
        for(int i=0; i<5;i++){
            inf=999;
            for(int j=0;j<5;j++){
                if(inf>distance[j] && visited[j]!=1){
                    inf=distance[j];
                    v=j;
                }
            }
            visited[v]=1;
            for(int j=0;j<5;j++) {
                if((inf+graph[j][v] < distance[j]) && visited[j]!=1) {
                    distance[j]= inf + graph[j][v];
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(" "+distance[i]);
        }
        System.out.println();
    }
}
