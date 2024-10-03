package Design_Patterns.Singleton;

public class Samosa {

    // Lazy Way of Creating Objects
    private static Samosa samosa;
    private Samosa(){} // Constructor Private
    public static Samosa getInstance(){

        // Samosa samosa = new Samosa();
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }
}
