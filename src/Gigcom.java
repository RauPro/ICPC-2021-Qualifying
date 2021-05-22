import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Gigcom {
	static long mod = 1000000007;
	public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		int n = fs.nextInt();
		int[] arr = fs.readArray(n);
		long a = 0;
		long b = 0;
		long aws = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1){
				a++;
			}
			if (arr[i] == 2){
				b = 2*b+a;
			}
			if (arr[i] == 3){
				aws += b;
			}
			a %= mod;b %= mod;aws %= mod;
		}
		System.out.println(aws);
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
