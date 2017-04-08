import java.util.*;
import java.io.*;

public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			int m = in.nextInt();
			int n = in.nextInt();
			int L, Lmin=0, Lmax=0;
			Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
			pq.offer(m);
			while (n-- > 0) {
				L = pq.poll();
				Lmin = (L-1)/2;
				Lmax = L-1-Lmin;
				pq.offer(Lmin);
				pq.offer(Lmax);
			}
			System.out.println("Case #" + i + ": " + Lmax + " " + Lmin);
		}
	}
}
