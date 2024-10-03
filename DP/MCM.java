package DP;

public class MCM {
    public static int calMCM(int arr[], int i, int j) {
        //Base case
        if (i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for (int k = i; k <= j - 1; k++) {
            int cost1 = calMCM(arr, i, k);
            int cost2 = calMCM(arr, k + 1, j);
            int cost3 = arr[i - 1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int n = arr.length;
        int res = calMCM(arr, 1, n - 1);
        System.out.println(res);
    }
}
