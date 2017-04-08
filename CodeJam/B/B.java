import java.util.*;
import java.io.*;

public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			String n = in.next();
			int idx = 0;
			StringBuilder sb = new StringBuilder();
			for (; idx < n.length()-1; idx++) {
				if (n.charAt(idx) > n.charAt(idx+1)) {
					while (idx > 0 && n.charAt(idx) - 1 < n.charAt(idx-1)) idx--; 
					break;
				}
			}
			sb.append(n.substring(0, idx));
			if (idx == n.length()-1) sb.append(n.charAt(idx));
			else if (n.charAt(idx) != '1') sb.append(n.charAt(idx)-'1');
			for (idx = idx+1; idx < n.length(); idx++) sb.append('9');
			System.out.println("Case #"+i+": "+sb.toString());
		}
	}
}
