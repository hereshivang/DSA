package OOPs.Abstraction;

public class Interface {
    public static void main(String[] args) {
        System.out.println("----------------Interface----------------");
        Queen q = new Queen();
        q.moves();
    }
}

interface chess{
    void moves();
}

class Queen implements chess{
    public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal");
    }
}

class Rook implements chess{
    public void moves() {
        System.out.println("Up, Down, Left, Right");
    }
}