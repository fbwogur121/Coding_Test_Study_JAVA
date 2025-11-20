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

            }
        }


        return -1;
    }
}
