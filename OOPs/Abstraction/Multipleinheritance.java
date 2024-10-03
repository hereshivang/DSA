package OOPs.Abstraction;

public class Multipleinheritance {
    public static void main(String[] args) {
        System.out.println("---------------------Multiple Inheritance-----------------");
        Beer b = new Beer();
        b.veg();
        b.nonveg();
    }
}

interface Herbivore{
    void veg();
}

interface Carnivore{
    void nonveg();
}

class Beer implements Herbivore , Carnivore{
    public void veg(){
        System.out.println("Eats Veges");
    }
    public void nonveg(){
        System.out.println("Eats Non-Veges");
    }
}
