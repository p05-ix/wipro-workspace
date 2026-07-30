interface Playable {
    void play();
}

// Veena class
class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Veena...");
    }
}

// Saxophone class
class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the Saxophone...");
    }
}

// Test class
public class MusicTest {
    public static void main(String[] args) {
        // a. Create an instance of Veena and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create an instance of Saxophone and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Place the above instances in a variable of type Playable and then call play()
        Playable p;

        p = veena;
        p.play();

        p = saxophone;
        p.play();
    }
}
