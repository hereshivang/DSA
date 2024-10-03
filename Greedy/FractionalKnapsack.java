package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int w[] = {10,20,30};
        int val[] = {60,100,120};
        int W = 30;

        double ratio[][] = new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/w[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int cap = W;
        int finalVal = 0;
        for(int i=val.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(cap >=  w[i]){
                finalVal += val[idx];
                cap -= w[idx];
            }else{
                finalVal += (ratio[i][1] * cap);
                cap = 0;
                break;
            }
        }
        System.out.println(finalVal);

    }
}
