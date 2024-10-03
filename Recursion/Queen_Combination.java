public class Queen_Combination {
    public static void main(String[] args) {
        int n = 2;
        boolean arr[] = new boolean[4];
        placedQueen(arr,n,0,"",-1);
    }
    public static void placedQueen(boolean arr[],int n, int qpsf, String ans,int idx){
        if(n==qpsf){
            System.out.println(ans);
            return;
        }

        for(int i=idx+1;i<arr.length;i++){
            if(arr[i] == false){ //No Queen Placed
                arr[i] = true; // Queen Placed
                placedQueen(arr,n,qpsf+1,ans+"b"+i+"q"+i+" ",i);
                arr[i] = false; // Queen Unplaced : Undo > BT
            }

        }
    }
}
