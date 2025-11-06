package DP;
//골드 5

import java.io.*;

public class boj_2011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int len = str.length();
        int div = 1000000;

        int[] dp = new int[len+1];
        dp[0] =dp[1] = 1;

        if(str.charAt(0) == '0'){
            dp[len] = 0;
        }else {
            for (int i = 2; i <= len; i++) {
                int preChar = Character.getNumericValue(str.charAt(i-2));
                int curChar = Character.getNumericValue(str.charAt(i-1));

                if(curChar == '0'){

                }
            }
        }


    }
}
