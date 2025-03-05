package problem1;

public class Solution1 {
    public static void main(String[] args) {
        int[] prices = {7, 5, 2, 11};
        int[] ratings = {3, 4, 1, 3};
        int result = getSolution(prices, ratings);
        System.out.println(result);
    }

    private static int getSolution(int[] prices, int[] ratings) {
        int n = prices.length;
        int maxIndex = 0;
        double maxRatio = (double) ratings[0] / prices[0];

        for (int i = 1; i < n; i++) {
            double ratio = (double) ratings[i] / prices[i];
            if (ratio > maxRatio) {
                maxRatio = ratio;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
