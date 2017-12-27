import java.util.*;

public class ExcelSheetColumnNumber {
	public static void main(String[] args) {
		ExcelSheetColumnNumber tester = new ExcelSheetColumnNumber();
		tester.unitTest();
	}
	public void unitTest() {
        //String s = "ABC";
        String s = "ZZ";
        System.out.println(titleToNumber(s)); 
	}
    public int titleToNumber(String s) {
        int num = 0;
        int count = s.length() - 1;
        for (char ch: s.toCharArray()) {
            num = num + (ch - 'A' + 1) * (int) Math.pow(26, count--); 
        }
        return num;
    }
}
