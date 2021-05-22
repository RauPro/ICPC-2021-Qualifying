import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Magic {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		char[] s = fs.next().toCharArray();

		if (areDistinct(s))
			System.out.println("1");
		else
			System.out.println("0");
	}
	public static boolean areDistinct(char arr[])
	{
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == arr[i+1] ){
				return false;
			}
		}
		return true;
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