package Design_Patterns.Factory;

public class Client {
    public static void main(String[] args) {
        Employee e = Employeefactory.getEmployee("Android");
        System.out.println(e.salary());
        Employee e1 = Employeefactory.getEmployee("Web");
        System.out.println(e1.salary());
    }
}
