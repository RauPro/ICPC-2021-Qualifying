import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Distress {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int w = fs.nextInt();
		int[] dp = new int[n+1];
		dp[0] = w;
		for (int i = 1; i < n+1; i++) {
			int d= fs.nextInt();
			int c= fs.nextInt();
			int u= fs.nextInt();
			dp[i] = c-u + Math.max(dp[d]-c, 0);
		}
		System.out.println(Arrays.stream(dp).min().getAsInt());
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
