package OOPs.Inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("------------Hierarchical Inheritance--------------");
        Hondacity h = new Hondacity();
        h.type();
        h.wheels();

        Urus u = new Urus();
        u.type();
        u.wheels();
    }
}

class Car{
    void wheels(){
        System.out.println("I have 4 Wheels");
    }
}

class Hondacity extends Car{
    void type(){
        System.out.println("Sedan");
    }
}

class Urus extends Car{
    void type(){
        System.out.println("XUV");
    }
    void wheels(){
        System.out.println("I have 5 Wheels");
    }
}