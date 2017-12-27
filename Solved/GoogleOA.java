public class GoogleOA{
	public static void main(String[] args) {
		/* String s = "2-4A0r7-4k"; */
		/* int k = 2; */
		/* System.out.println(solution(s, k)); */
		/* System.out.println(t); */
		/* System.out.println(solution_file(s)); */
		String s = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
	}
	public static String password(String S, int K) {
		StringBuilder s = new StringBuilder();
		for (int i = S.length()-1; i >= 0; i--) {
			if (s.length()%(K+1) == K && K > 0) 
				s.insert(0, '-');
			if (S.charAt(i) == '-') 
				continue;
			else if (S.charAt(i) >= 'a') 
				s.insert(0, (char)(S.charAt(i) + 'A'-'a'));
			else
				s.insert(0, S.charAt(i));
		}
		return s.toString();
	}
	public int lengthLongestPath(String input) {
		int res = 0;
		Map<Integer, Integer> m = new HashMap<>();
		m.put(0, 0);
		for (String s : input.split("\n")) {
			int level = s.lastIndexOf("\t") + 1;
			int len = s.substring(level).length();
			if (s.contains(".")) {
				res = Math.max(res, m.get(level) + len);
			} else {
				m.put(level + 1, m.get(level) + len + 1);
			}
		}
		return res;
	}
	public static int binaryMax(int A, int B, TreeNode T) {
		/* postOrder	 */
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {val = x;}
}
