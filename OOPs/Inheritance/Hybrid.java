package OOPs.Inheritance;

public class Hybrid {
    public static void main(String[] args) {
        System.out.println("----------------Hybrid Inheritance-------------");
        // Fish Object
        Fishes f = new Fishes();
        f.swim();

        // Fishes Derived Class
        Tuna t = new Tuna();
        t.type();
        t.swim();
    }
}


// Base Class
class Animalss{
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

// Derived from Base Class
class Fishes extends Animals{
    void swim(){
        System.out.println("Swims");
    }
}

// Derived from Base Class
class Mammal extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}

// Derived from Base Class
class Bird extends Animals{
    void fly(){
        System.out.println("Flys");
    }
}

// Derived from Fish Class
class Tuna extends Fishes{
    void type(){
        System.out.println("I am a small fish");
    }
}

class Shark extends Fishes{
    void type(){
        System.out.println("I am a Largest Water Animal");
    }
}

// Derived from Mammal Class
class Human extends Mammal{
    void legs(){
        System.out.println("I have two legs");
    }
}

class Dog extends Mammal{
    void legs(){
        System.out.println("I have 4 Legs");
    }
}

// Derived from Bird Class
class Peacock extends Bird{
    void fact(){
        System.out.println("National Bird");
    }
}
