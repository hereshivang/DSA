package Design_Patterns.Factory;

public class Webdeveloper implements Employee {
    public int salary(){
        System.out.println("Getting Web Developer Salary");
        return 500;
    }
}
