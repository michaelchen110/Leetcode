public class usefullibrary{
	public static void main(String[] args) {
	}
	public void tools(){

		int[] x = new int[10];//call by reference
		int[] y = {1,2,3};
		int[][] two = {{1,2},{1,4}};

		int[][] 2d = new int[a.length][];
		y.length == 3;
		print Arrays.toString(y);
		Arrays.fill(ids, -1);
		Arrays.sort(y);//primitive
		Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1]-b[1] : a[0]-b[0]); //2d primitive

		List a;
		a.size();
		List<int[]> list = new ArrayList<>();
		List<List<Integer>> l = new ArrayList<>();
		l.sort((a, b) -> a.get(0) == b.get(0) ? b.get(1) - a.get(1) : a.get(0) - b.get(0));
		l.toArray(new int[people.length][]);

		Stack<E> stack = new Stack<>();
		stack.push(e);
		stack.pop();// exception if empty
		stack.peek();
		stack.empty();

		Queue<E> queue = new LinkedList<>();
		queue.offer(E);
		queue.poll(); //null if empty
		queue.peek();
		queue.isEmpty();
		Queue<E> pq = new PriorityQueue<>();
		Queue<E> pqCom = new PriorityQueue<>((a,b) -> b - a);

		Map<K, V> map = new HashMap<>();
		Map<K, V> map = new TreeMap<>(); //AVL BST tree, iterate sorted key
		Map<K, V> map = new LinkedHashMap<>(); //iterate inserted order
		map.size(); map.isEmpty();
		map.get(k); //null if not found
		map.put(k, v);
		map.remove(k);
		for (K k : map.keySet());
		for (V v : map.values());
		map.containsKey(k);
		map.containsValue(v);

		StringBuilder sb = new StringBuilder(); //call by reference
		sb.append("adsfsafsd");
		sb.insert(0, "sdssds");
		sb.charAt(0);
		sb.indexOf(str);//not found -1
		sb.length();
		sb.toString();
		sb.setCharAt(0, 's');
		sb.reverse().toString()
		sb.delete(0,1);

		String s = "a" + "bcbc"; //immutable, call by value
		Strin x = new String(s.toCharArray());
		s.charAt(0);
		s.length();
		s.contains("ab");
		s.indexOf("bc");
		"\t\t\taaa".lastIndexOf("\t") // 2, -1 if none
		s.split("\\s+");
		"a".split(",") -> "a"
		"".split(",") -> size 1 array "" 
		",".split(",") -> size 0 array
		s.toLowerCase();
		s.toUpperCase();
		s.trim();//s = "   sf ", s.trim() == "sf"
		s.substring(int beginIndex, int endIndex)
		for (char ch : s.toCharArray())
		(char) 'B'-'A'+'a'; //'b'

		int a = Integer.parseInt(String s);
		String s = Integer.toString(int i);

		obj1 == obj2; //reference equality
		obj1.equals(obj2); //value equality
		String ab = new String("ab");
		"ab" == "ab";//true
		ab == "ab";//false
		"ab".equals("ab");//true
		Object a;
		System.out.println(a);//compile error
		Object b = null;
		System.out.println(b);//null
		int c;
		System.out.println(c);//0

		if (overflow = Integer.MAX_VALUE)
		if (underflow = Integer.MIN_VALUE)
		Integer.signum(-123);
		Math.max(a, b);
		Math.abs(a);
		Math.pow(a, 2);
		Math.sqrt(a);
	}
}
