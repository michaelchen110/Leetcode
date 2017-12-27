import java.util.*;

public class ExcelSheetColumnTitle {
	public static void main(String[] args) {
		ExcelSheetColumnTitle tester = new ExcelSheetColumnTitle();
		tester.unitTest();
	}
	public void unitTest() {
        int n = 28;
        System.out.println(convertToTitle(n));
	}
    public String convertToTitle(int n) {
        return n == 0 ? "" : convertToTitle((n-1) / 26) + (char) ((n-1) % 26 + 'A');
    }
}
