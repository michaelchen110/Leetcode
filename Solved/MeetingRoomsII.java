import java.util.*;

//Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

//For example,
//Given [[0, 30],[5, 10],[15, 20]],
//return 2.

public class MeetingRoomsII {
	public static void main(String[] args) {
		MeetingRoomsII tester = new MeetingRoomsII();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public int minMeetingRooms(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> a.start == b.start ? a.end - b.end : a.start - b.start);
        Queue<Integer> queue = new PriorityQueue<>();
        int room = 0;
        for (Interval interval: intervals) {
            if (!queue.isEmpty() && interval.start >= queue.peek()) queue.poll();
            queue.offer(interval.end);
            room = Math.max(room, queue.size());
        }
        return room;
    }
}
