package Design_Patterns.Factory;

public class Android implements Employee {
    public int salary(){
        System.out.println("Getting Android Developer");
        return 1000;
    }
}
