package LevelUP;

import java.util.ArrayList;

public class Rabibkarp {
    public static void main(String[] args) {
        String txt = "birthdayboy";
        String pat = "birth";
        search(pat, txt);

    }
    public static void search(String pat, String txt){
        ArrayList<Integer> list = new ArrayList<>();
        int q = 101; // Prime Number for mod
        int b = 26; // base for calculating hash value

        int m = pat.length(); // length 0f pattern
        int n = txt.length(); // length of text

        int i,j; // indexes

        int p = 0; // hash value of pattern
        int t = 0; // hash value of text
        int h = 1; // calculating hash value of pattern

        // Hash value
        for (i=0;i<m-1;i++){
            h = (h*b) % q;
        }

        for(i=0;i<m;i++){
            p = (b*p + pat.charAt(i)) % q; // hash value of pattern
            t = (b*t + txt.charAt(i)) % q; // hash value of first window
        }

        // Checking hash values for every window
        for(i=0;i<=n-m;i++){
            // if hash value of pattern and text matches
            if(p==t){
                // checking character after hash value matches
                for(j=0;j<m;j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        break;
                    }
                }
                // all characters matched with text
                if(j==m){
                    //System.out.println("Pattern found at " + i);
                    list.add(i);
                }
            }

            // calculating hash value of text for next window
            if(i<n-m){
                t = (b * (t - txt.charAt(i) * h) + txt.charAt(i+m)) % q;

                // if hash value of text gets negative
                if(t < 0) {
                    t = (t+q);
                }
            }
        }
        System.out.println(list);

    }
}
