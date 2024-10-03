public class Queen_Permut {
    public static void main(String[] args) {
        int n = 2;
        boolean arr[] = new boolean[4];
        placedQueen(arr,n,0,"");
    }
    public static void placedQueen(boolean arr[],int n, int qpsf, String ans){
        if(n==qpsf){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] == false){ //No Queen Placed
                arr[i] = true; // Queen Placed
                placedQueen(arr,n,qpsf+1,ans+"b"+i+"q"+i+" ");
                arr[i] = false; // Queen Unplaced : Undo > BT
            }

        }
    }
}
