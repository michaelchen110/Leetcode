import java.util.*;

public class BestTimetoBuyandSellStockII {
	public static void main(String[] args) {
		BestTimetoBuyandSellStockII tester = new BestTimetoBuyandSellStockII();
		tester.unitTest();
	}
	public void unitTest() {

	}
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) 
                max += prices[i] - prices[i - 1];
        }
        return max;
    }
}
