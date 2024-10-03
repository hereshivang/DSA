public class TOH {
    static int steps = 0;
    public static void printSteps(int n,String s,String h,String d){
        if(n==0){
            steps++;
            return;
        }
        printSteps(n-1,s,d,h);
        System.out.println("Move " + n + " From " + s +" to " + d );
        printSteps(n-1,h,s,d);
    }
    public static void main(String[] args) {

        int n = 3;
        printSteps(n,"A", "B","C");
        System.out.println(steps);
    }
}
