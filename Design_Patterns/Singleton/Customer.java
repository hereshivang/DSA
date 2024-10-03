package Design_Patterns.Singleton;

public class Customer {
    public static void main(String[] args) {
       // Lazy way of Creating Object
       Samosa s = Samosa.getInstance();
       System.out.println("Samosa 1 Object Hashcode - " + s.hashCode());
       Samosa s1 = Samosa.getInstance();
       System.out.println("Samosa 2 Object Hashcode - " + s1.hashCode());

       // Eager Way of Creating Object
       System.out.println("Jalebi 1 Object Hashcode - " + Jalebi.getJalebi().hashCode());
       System.out.println("Jalebi 2 Object Hashcode - " + Jalebi.getJalebi().hashCode());

       // Thread Safe Object Creation
        System.out.println("Drink Object 1 Hashcode - " + Drink.getDrink());
        System.out.println("Drink Object 1 Hashcode - " + Drink.getDrink());

    }
}
