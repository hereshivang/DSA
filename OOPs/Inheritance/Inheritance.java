package OOPs.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("------------------Inheritance------------------");
        Fish tuna = new Fish();
        tuna.skincolor("black"); // Derived from parent class
        tuna.swin();
    }
}

// Base Class / Super Class / Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
    void skincolor(String color){
        this.color = color;
        System.out.println(color);
    }
}

// Derived Class / Sub Class / Child Class
class Fish extends Animal{
    void swin(){
        System.out.println("Swims");
    }
}
