public class UTF8Validation {
	public static void main(String[] args) {
		UTF8Validation tester = new UTF8Validation();
		tester.unitTest();
	}
	public void unitTest() {
		/* int[] data = {197, 130, 1}; */
		int[] data = {230, 136, 145};
		System.out.println(validUtf8(data));
	}
    public boolean validUtf8(int[] data) {
		int count = 0, head;
		for (int ch : data) {
			head = 0;
			for (int i = 7; i >= 0; i--) {
				if ((1<<i & ch) == 0) break;
				head++;
			}
			if (head == 0) {
				if (count > 0) return false;
			}
			else if (head == 1) {
				if (--count < 0) return false; 
			}
			else if (head > 4) {
				return false;
			}
			else {
				if (count > 0) return false;
				count = head-1;
			}
		}
		return count == 0;
    }
}
