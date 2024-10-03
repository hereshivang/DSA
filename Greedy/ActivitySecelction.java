package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class ActivitySecelction {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        int cnt = 1;
        int last = end[0];
        for(int i=0;i<start.length-1;i++){
            //last = end[i];
            if(start[i+1] >= last){
                cnt++;
            }
            last = end[i];
        }
        System.out.println("End Sorted Max : " + cnt );
        int start1[] = {0,1,3,5,5,8};
        int end2[] = {6,2,4,7,9,9};
        startSorted(start1, end2);
    }
    public static void startSorted(int[] start, int end[]){
        int activities[][] = new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activities[i][0] = i; // original index
            activities[i][1] = start[i]; // starting index
            activities[i][2] = end[i]; // ending index
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int max = 1;
        int last = activities[0][2];
        for(int i=1;i<start.length;i++){
            if(activities[i][1] >= last){
                max++;
                last = activities[i][2];
            }
        }
        System.out.println("Start Sorted Max : " + max);
    }
}
