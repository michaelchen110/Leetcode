import java.util.*;

public class LongestAbsoluteFilePath {
	public static void main(String[] args) {
		LongestAbsoluteFilePath tester = new LongestAbsoluteFilePath();
		tester.unitTest();
	}
	public void unitTest() {
		/* String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"; */
		String input ="dir\n\tfile.txt";
		int max = lengthLongestPath(input);
		System.out.println(max);
	}
    public int lengthLongestPath(String input) {
		Stack<Integer> path = new Stack<>();
		int max = 0;
		path.push(-1);
		for (String name : input.split("\n")) {
			int level = name.lastIndexOf("\t") + 1;
			while (level < path.size() - 1) path.pop();
			if (name.contains(".")) max = Math.max(max, path.peek() + 1 + name.length() - level);
			else path.push(path.peek() + 1 + name.length() - level);
		}
		return max;
    }
}
