import java.util.Arrays;

class LeetCode121 {
    public static int maxProfit(int[] prices) {
        // find smallest element and its index
        // find largest element after smallest and its index
        // if largest element is before smallest element
        // find the next largest element
        // record index of that element
        //
        int[] sorted = copyArray(prices);
        Arrays.sort(sorted);
        int largest = sorted[sorted.length - 1];
        int smallest = sorted[0];
        int smallestIndex = 0;
        int largestIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == largest) {
                largestIndex = i;
            }
            if (prices[i] == smallest && i > largestIndex) {
                smallestIndex = i;
            }
        }

        
        return smallestIndex;
    }
    public static void main(String[] args) {
        int[] testCase = {7,1,5,3,6,4};
        int profit = maxProfit(testCase);
    }
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }
}