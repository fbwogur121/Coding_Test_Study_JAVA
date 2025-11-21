package BFS;

import java.io.*;
import java.util.*;

public class boj_16953 {

    static long a, b; // a를 b로 만들기
    static int count; // 연산의 최소 횟수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        System.out.println(bfs());
    }

    static int bfs(){
        Queue<Long> queue = new LinkedList<>();
        queue.add(a);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                long tmp = queue.poll();
                if(tmp == b)
                    return count+1;
                if(tmp*2 <= b)
                    queue.add(tmp*2);
                if(tmp*10 + 1 <= b)
                    queue.add(tmp*10+1);
            }
            count++;
        }
        return -1;
    }
}
