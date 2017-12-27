public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;
        int hamming = x^y;
        for (int i = 31; i >= 0; i--) {
            count += (hamming & (1<<i)) > 0 ? 1 : 0;
        }
        return count;
    }
}
