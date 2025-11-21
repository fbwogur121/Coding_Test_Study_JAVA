package DFS;

import java.io.*;
import java.util.*;

public class boj_1260 {

    static StringBuilder sb = new StringBuilder();

    // DFS, BFS 돌면서 방문했는지 여부 체크
    static boolean visited[];

    // DFS에 쓸 연결리스트
    static ArrayList<Integer>[] Array;

    // BFS에 쓸 큐
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

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

        // 각 노드의 인접리스트를 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(Array[i]);
        }

        DFS(V);

        sb.append("\n");
        visited = new boolean[N+1];

        BFS(V);

        System.out.println(sb);
    }

    public static void DFS(int v){
        visited[v] = true;
        sb.append(v).append(" ");

        for (int next : Array[v]) {
            if(!visited[next]){
                DFS(next);
            }
        }
    }

    public static void BFS(int v){
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int current = queue.poll();
            sb.append(current).append(" ");

            for(int next : Array[current]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
