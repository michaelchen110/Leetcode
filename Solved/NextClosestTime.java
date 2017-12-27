import java.util.*;

public class NextClosestTime {
	public static void main(String[] args) {
		NextClosestTime tester = new NextClosestTime();
		tester.unitTest();
	}
	public void unitTest() {
        //String t = "23:59";
        String t = "19:34";
        System.out.println(nextClosestTime(t));
	}
    public String nextClosestTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        Set<Character> set = new HashSet<>();
        for (char ch: sb.toString().toCharArray()) {
            if (ch != ':') set.add(ch);
        }

        StringBuilder orderSb = new StringBuilder();
        for (char ch: set) orderSb.append(ch);
        char[] o = orderSb.toString().toCharArray();
        Arrays.sort(o);
        StringBuilder or = new StringBuilder();
        for (char ch: o) or.append(ch);
        String order = or.toString();

        char[] bound = {'2', '9', ':', '5', '9'};
        if (time.charAt(0) == '2') bound[1] = '4';

        for (int i = 4; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (ch != ':') {
                int idx = order.indexOf(ch) + 1;
                if (idx < order.length() && order.charAt(idx) <= bound[i]) {
                    sb.setCharAt(i, order.charAt(idx));
                    break;
                }
                sb.setCharAt(i, order.charAt(0));
            }
        }
        return sb.toString();
    }
}
