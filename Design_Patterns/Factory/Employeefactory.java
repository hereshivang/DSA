package Design_Patterns.Factory;

public class Employeefactory {
    public static Employee getEmployee(String emp){
        if(emp.trim().equalsIgnoreCase("Android")){
            System.out.println("Sending Android Developer Salary");
            return new Android();
        }
        else if(emp.trim().equalsIgnoreCase("Web")){
            System.out.println("Sending Web Developer Salary");
            return new Webdeveloper();
        }
        else{
            return null;
        }
    }
}
