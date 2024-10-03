public class Uniquepaths {
    static int cnt = 0;
    public static void main(String[] args){
        int m = 4;
        int n = 6;
        printPaths(m-1,n-1,0,0,"");
        System.out.println(cnt);
    }
    public static void printPaths(int er, int ec, int cr,int cc,String ans){
        if(cc==ec && cr==er){
            cnt++;
            return;
        }
        if(cc>ec || cr>er) {
            return;
        }

        printPaths(er,ec,cr,cc+1,ans+"H");
        printPaths(er,ec,cr+1,cc,ans+"V");

    }
}
