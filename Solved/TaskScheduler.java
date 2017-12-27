import java.util.*;

//Input: tasks = ["A","A","A","B","B","B"], n = 2
//Output: 8
//Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.

public class TaskScheduler {
	public static void main(String[] args) {
		TaskScheduler tester = new TaskScheduler();
		tester.unitTest();
	}
	public void unitTest() {
        char[] tasks = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tasks, 2));
        return;
	}
    public int leastInterval(char[] tasks, int n) {
        int[] alpha = new int[26];
        for (char ch: tasks) alpha[ch - 'A']++;

        Arrays.sort(alpha);
        int num = 1;
        while (alpha[25 - num] == alpha[25]) num++;
        return Math.max(tasks.length, (n + 1) * (alpha[25] - 1) + num);
    }
}
