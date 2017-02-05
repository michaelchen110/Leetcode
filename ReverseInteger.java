public class ReverseInteger{
	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}
	public static int reverse(int x) {
		if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) return 0;
		String s = Integer.toString(x > 0 ? x : -x);	
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.insert(0, s.charAt(i));
		}
		int r;
		try {
			r = Integer.parseInt(sb.toString());
		} catch (Exception e) {
			return 0;
		}
		return x > 0 ? r : -r;
    }
	/* much better one */
	public int reverse(int x)
	{
		int result = 0;

		while (x != 0)
		{
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if ((newResult - tail) / 10 != result)
			{ return 0; }
			result = newResult;
			x = x / 10;
		}

		return result;
	}
}
