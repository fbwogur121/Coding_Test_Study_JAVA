import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_11066 {

    public static int T;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int res = 0;

            int K = sc.nextInt();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] original = new int[K];

            for (int j = 0; j < K; j++) {
                original[i] = Integer.parseInt(st.nextToken());
            }

            Integer[] arr = new Integer[K+1];
            
            for (int j = 0; j < K-1; j++) {

            }

        }
    }

}
