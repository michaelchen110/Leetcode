import java.util.*;

public class BestTimetoBuyandSellStock {
	public static void main(String[] args) {
		BestTimetoBuyandSellStock tester = new BestTimetoBuyandSellStock();
		tester.unitTest();
	}
	public void unitTest() {
        //int[] p = new int[] {7, 1, 5, 3, 6, 4};
        int[] p = new int[] {7, 6, 4, 3, 1};
        System.out.println(maxProfit(p));
	}
    public int maxProfit(int[] prices) {
        int global = 0, local = 0;
        for (int i = 1; i < prices.length; i++) {
            local = Math.max(0, local += prices[i] - prices[i-1]);
            global = Math.max(local, global);
        }
        return global;
    }
}
