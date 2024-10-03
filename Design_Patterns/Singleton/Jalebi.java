package Design_Patterns.Singleton;

public class Jalebi {

    // Eager way of creating Java Objects
    private static Jalebi jalebi = new Jalebi();
    private Jalebi(){};
    public static Jalebi getJalebi(){

        return jalebi;
    }
}
