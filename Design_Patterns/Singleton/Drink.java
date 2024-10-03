package Design_Patterns.Singleton;

public class Drink {

    // Thread Safe
    private static Drink drink;
    private Drink(){}
    public static Drink getDrink(){

        if(drink == null){
            synchronized (Drink.class){
                if(drink == null){
                    drink = new Drink();
                }
            }
        }
        return drink;
    }
}
