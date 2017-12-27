import java.util.*;

//For example,
//Given [1,3],[2,6],[8,10],[15,18],
//return [1,6],[8,10],[15,18].

public class MergeIntervals {
	public static void main(String[] args) {
		MergeIntervals tester = new MergeIntervals();
		tester.unitTest();
	}
	public void unitTest() {
        int[][] i = {{1,3},{8,10},{2,6},{15,18}};
        List<Interval> ii = new LinkedList<>();
        for (int j = 0; j < i.length; j++) {
            ii.add(new Interval(i[j][0], i[j][1]));
        }
        List<Interval> l = merge(ii);
	}
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;

        intervals.sort((a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
        List<Interval> merged = new LinkedList<>();
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int idx = 1; idx < intervals.size(); idx++) {
            Interval inter = intervals.get(idx);
            if (idx == intervals.size() - 1 || inter.start > end) {
                merged.add(new Interval(start, end));
                start = inter.start;
            }
            end = Math.max(inter.end, end);
        }
        return merged;
    }
}

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
