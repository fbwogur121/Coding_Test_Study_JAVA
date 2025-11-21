////
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class boj_10830 {
//
//    // N 선언
//    public static int N;
//
//    // 처음 입력받는 A행렬
//    public static int[][] origin;
//
//    final static int THOUSAND = 1000;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        N = Integer.parseInt(st.nextToken());
//        long B = Long.parseLong(st.nextToken());
//
//        origin = new int[N][N];
//
//        for(int i=0; i<N; i++){
//            st = new StringTokenizer(br.readLine(), " ");
//            for(int j=0; j<N; j++){
//                origin[i][j] = Integer.parseInt(st.nextToken()) % THOUSAND;
//            }
//        }
//
//        int[][] result = pow(origin, B);
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                sb.append(result[i][j]).append(' ');
//            }
//            sb.append('\n');
//        }
//        System.out.println(sb);
//
//    }
//
//    public static int[][] pow(int[][] A, long B){
//        // 지수가 1이면 재귀루프 끝.
//        if(B == 1L){
//            return A;
//        }
//
//        // 지수를 절반으로 분할하여 재귀호출
//        int[][] ret = pow(A, B/2);
//
//        // 하위 재귀에서 얻은 행렬을 제곱
//        ret = mul(ret, ret);
//
//        // 지수가 홀수라면 origin 한번 더 곱한다
//        if(B%2 == 1L){
//            ret = mul(ret, A);
//        }
//
//        return ret;
//    }
//
//    public static int[][] mul(int[][] o1, int[][] o2){
//        int[][] ret = new int[N][N];
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                for (int k = 0; k < N; k++) {
//                    ret[i][j] += o1[i][k] * o2[k][j];
//                    ret[i][j] %= THOUSAND;
//                }
//            }
//        }
//        return ret;
//    }
//
//
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10830{

    public static int[][] origin;
    public static int N;
    final static int THOUSAND = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        origin = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                origin[i][j] = Integer.parseInt(st.nextToken());
                origin[i][j] %= THOUSAND;
            }
        }

        int[][] res = pow(origin, B);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] pow(int[][] origin, long b){
        if(b == 1L){
            return origin;
        }

        int[][] ret = pow(origin, b/2);

        ret = mul(ret, ret);

        if(b%2 == 1L){
            ret = mul(ret, origin);
        }

        return ret;
    }

    public static int[][] mul(int[][] o1, int[][] o2){
        int[][] ret = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    ret[i][j] += o1[i][k] * o2[k][j];
                    ret[i][j] %= THOUSAND;
                }
            }
        }
        return ret;
    }
}