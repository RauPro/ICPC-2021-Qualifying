import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Rating {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		int n =  fs.nextInt();
		int k = fs.nextInt();
		int[] arrMin = new	int[n];
		int[] arrMax = new	int[n];
		for (int i = 0; i < k; i++) {
			arrMin[i]= fs.nextInt();
			arrMax[i]= arrMin[i];
		}
		for (int i = k; i < n; i++) {
			arrMin[i]=-3;
			arrMax[i]=3;
		}
		double aws = 0;
		double awsMax = 0;

		for (int i = 0; i < n; i++) {
			aws+=arrMin[i];
			awsMax+=arrMax[i];
		}
		System.out.println((aws/arrMin.length)+" "+(awsMax/arrMax.length));
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
