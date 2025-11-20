package BFS;

import java.io.*;
import java.util.*;

public class boj_14248 {
    static int n;
    static int check[], stoneBridge[];
    static int dir[] = {1, -1};
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        stoneBridge = new int[n+1];
        check = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            stoneBridge[i] = Integer.parseInt(st.nextToken());
        }

        int start = Integer.parseInt(br.readLine());
        System.out.println(bfs(start));
    }

    public static int bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        check[start] = 1;
        while (!queue.isEmpty()){
            start = queue.poll();
            int jump = stoneBridge[start];
            for (int d : dir) {
                int direction = (d * jump) + start;
                if(direction > 0 && direction <= n && check[direction] == 0){
                    check[direction] = 1;
                    queue.offer(direction);
                    count++;
                }
            }
        }
        return count;
    }
}

