public class FindComplement{
	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
	public static int findComplement(int num) {
        int res = ~num;
		for (int i = 31; (res&(1<<i)) != 0; i--) res = res^(1<<i);
		return res;
    }
}
