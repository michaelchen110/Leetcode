import java.util.*;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MergeIntervals {
	public static void main(String[] args) {
		MergeIntervals tester = new MergeIntervals();
		tester.unitTest();
	}
	public void unitTest() {
		List<Interval> list = new ArrayList<>();
		list.add(0, new Interval(1,4));
		list.add(1, new Interval(2,3));
		list.add(2, new Interval(8,10));
		list.add(3, new Interval(15,18));
		list = merge(list);
		System.out.println(list.get(0).start + ", " +list.get(0).end);
	}
    public List<Interval> merge(List<Interval> intervals) {
		intervals.sort((a,b) -> a.start - b.start);
		for (int pos = 0; pos < intervals.size()-1; pos++) {
			Interval first = intervals.get(pos);
			Interval second = intervals.get(pos+1);
			if (first.start <= second.end && first.end >= second.start) {
				intervals.set(pos, new Interval(first.start, Math.max(first.end, second.end)));
				intervals.remove(pos+1);
				pos--;
			}
		}
		return intervals;
    }
}


