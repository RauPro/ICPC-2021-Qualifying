import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Methodic {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
		char[] s1 = fs.next().toCharArray();
		char[] s2 = fs.next().toCharArray();
		if (s1.length==1 || s2.length==1){
			System.out.println(0);
		}
		else{
			int a =0;
			int b = 0;
			for (int i = 0; i < s1.length; i++) {
				if (s1[i]=='S'){
					a++;
				}
			}
			for (int i = 0; i < s2.length; i++) {
				if (s2[i]=='S'){
					b++;
				}
			}
			for (int i = 0; i < a*b; i++) {
				System.out.print("S(");
			}
			System.out.print("0");
			for (int i = 0; i < a*b; i++) {
				System.out.print(")");
			}
			System.out.println();
		}
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
