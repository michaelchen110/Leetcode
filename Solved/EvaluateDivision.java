import java.util.*;

public class EvaluateDivision {
	public static void main(String[] args) {
		EvaluateDivision tester = new EvaluateDivision();
		tester.unitTest();
	}
	public void unitTest() {
		/* String[][] equations = { {"a", "b"}, {"b", "c"} }; */
		/* double[] values = {2.0, 3.0}; */
		/* String[][] queries = { {"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"} }; */
		/* String[][] equations ={{"a","e"},{"b","e"}} ; */
		/* double[] values = {4.0,3.0}; */
		/* String[][] queries = {{"a","b"},{"e","e"},{"x","x"}}; */

		String[][] equations =	{{"a","b"},{"e","f"},{"b","e"}};
		double[] values ={3.4,1.4,2.3};
		String[][] queries ={{"b","a"},{"a","f"},{"f","f"},{"e","e"},{"c","c"},{"a","c"},{"f","e"}};


		double[] res = calcEquation(equations, values, queries);
		System.out.println(Arrays.toString(res));
	}
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		Map<String, Double> map = new HashMap<>(); 
		Map<String, Integer> count = new HashMap<>();
		double[] result = new double[queries.length];
		String division, divisor;

		for (int i = 0; i < values.length; i++) {
			division = equations[i][0];
			divisor = equations[i][1];
			if (count.containsKey(division)) 
				count.put(division, count.get(division) + 1);
			else 
				count.put(division, 1);
			if (count.containsKey(divisor)) 
				count.put(divisor, count.get(divisor) + 1);
			else 
				count.put(divisor, 1);
		}
		Arrays.sort(equations, (a, b) -> count.get(a[0]) - count.get(b[0]));

		for (int i = 0; i < values.length; i++) {
			division = equations[i][0];
			divisor = equations[i][1];
			if (values[i] == 0) 
				map.put(division, 0.0);
			else if (map.containsKey(division)) 
				map.put(divisor, map.get(division)/values[i]);
			else if (map.containsKey(divisor))
				map.put(division, map.get(divisor)*values[i]);
			else {
				map.put(division, values[i]);
				map.put(divisor, 1.0);
			}
		}
		for (int i = 0; i < queries.length; i++) {
			division = queries[i][0];
			divisor = queries[i][1];
			if (map.containsKey(division) && map.containsKey(divisor) && !divisor.equals("0.0")) 
				result[i] = map.get(division)/map.get(divisor);
			else 
				result[i] = -1;
		}
		return result;
    }
}
