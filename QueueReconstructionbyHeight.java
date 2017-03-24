import java.util.*;

public class QueueReconstructionbyHeight {
	public static void main(String[] args) {
		QueueReconstructionbyHeight tester = new QueueReconstructionbyHeight();
		tester.unitTest();
	}
	public void unitTest() {
		int[][] p = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		for (int[] i : reconstructQueue(p)) 
			System.out.println(Arrays.toString(i));
	}
    public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a,b) -> b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]);
		List<int[]> queue = new ArrayList<>();
		for (int[] person : people) {
			queue.add(person[1], person);	
		}
		return queue.toArray(new int[people.length][]);
    }
}
