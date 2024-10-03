import java.util.*;

public class subArray {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int n = scn.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) arr[i]=scn.nextInt();
            System.out.println(subarraysDivByK(arr, n));
        }
    }
    public static long subarraysDivByK(int[] nums, int k) {
        int[] counting = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) nums[i] += nums[i - 1];
            counting[(nums[i] % k + k) % k]++;
        }
        long result = counting[0];
        for (int frequency : counting)
            result += (long)frequency * (long)(frequency - 1) / 2;
        return result;
    }
}

