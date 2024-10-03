package OOPs.Polymorphism;

public class Runtime {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

// Method Overriding
class Animal{
    void eat(){
        System.out.println("Eats Everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}