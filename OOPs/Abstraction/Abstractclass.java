package OOPs.Abstraction;

public class Abstractclass {
    public static void main(String[] args) {
        System.out.println("--------------Abstract Class-----------------");
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}

abstract class  Animal{
    void eat(){
        System.out.println("Eats Everything");
    }
    abstract void walk(); // idea
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse Runs Faster");
    }
}