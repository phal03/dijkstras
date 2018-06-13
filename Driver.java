package com.hackercode.controller;
import com.hackercode.utilities.*;

import java.util.Scanner;
public class Driver {
    public static void main(String argv[]){
        Scanner sc=new Scanner(System.in);
        int n=5,inf=999;
        int[]  visited=new int[5];
        int[][] graph=new int[n][n];
        System.out.println("Enter graph:");
        for(int i=0;i<n;i++) {
            visited[i]=0;
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
                if(graph[i][j]<=0)
                    graph[i][j]=inf;
            }
        }


        for(int i=0;i<5;i++) {
            visited=new int[]{0,0,0,0,0};
            Dijkstra.dij(graph,i,visited);
        }

    }
}
