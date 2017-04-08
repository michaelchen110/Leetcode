import java.util.*;
import java.io.*;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			String n = in.next();
			int m = in.nextInt();
			int num = 0;
			boolean[] pancake = new boolean[n.length()];
			for (int j = 0; j < n.length(); j++) pancake[j] = n.charAt(j) == '+' ? true : false;
			for (int j = 0; j < pancake.length-m+1; j++) {
				if (!pancake[j]) {
					for (int k = j; k < j+m; k++) pancake[k] = !pancake[k];
					num++;
				}
			}
			for (int j = pancake.length-1; j > pancake.length-1-m; j--) if (!pancake[j]) num = -1;
			if (num == -1) System.out.println("Case #"+i+": IMPOSSIBLE");
			else System.out.println("Case #"+i+": "+num);
		}
	}
}
