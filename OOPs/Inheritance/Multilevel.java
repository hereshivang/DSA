package OOPs.Inheritance;

public class Multilevel {
    public static void main(String[] args) {
        System.out.println("---------------Multilevel Inheritance------------------");

        // Fish Class Object

        Fishh f = new Fishh();
        f.swims(true);
        f.skincolor("Grey and Black");
        f.fact();

        // Aquarium object

        Aquarium a = new Aquarium();
        a.fishes(10);
        a.fact();

    }
}

// Base Class
class Animals{
    int legs;
    String color;

    boolean swims;
    void legs(int legs){
        this.legs = legs;
        System.out.println("Legs - " + legs);
    }
    void skincolor(String color){
        this.color = color;
        System.out.println("Skin Color - " + color);
    }
    void swims(boolean swims){
        this.swims = swims;
        System.out.println("Swins - " + swims);
    }
}

// First Derived Class
class Fishh extends Animals{
    void fact(){
        System.out.println("Shark - Largest Animal in Water");
    }
}

// Second Derived Class
class Aquarium extends Fishh{
    int n;
    void fishes(int n){
        this.n = n;
        System.out.println("Number of fishes - " + n );
    }
}
