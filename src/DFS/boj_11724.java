package DFS;

import java.io.*;
import java.util.*;


public class boj_11724 {

    static boolean[] visited;
    static ArrayList<Integer>[] Array;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        Array = new ArrayList[N+1];
        for (int i = 1; i <= N ; i++) {
            Array[i] = new ArrayList<Integer>();
        }

        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            Array[start].add(end);
            Array[end].add(start);
        }

        for (int i = 1; i <= N; i++) {
            if(!visited[i]){
                result++;
                DFS(i);
            }
        }

        System.out.println(result);
    }

    public static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : Array[v]){
            if(!visited[i]){
                DFS(i);
            }
        }

    }
}