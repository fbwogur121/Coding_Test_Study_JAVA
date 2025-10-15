// Bronze

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);
        int M = Integer.parseInt(input[3]);

        int a = 0;
        int b = 0;

        while(true){
            if(W <= 0){
                break;
            }
            ++a;
            W -= (M+1);

        }
        while(true){
            if(H <= 0){
                break;
            }
            ++b;
            H -= (N+1);
        }

        System.out.println(a*b);

    }
}
