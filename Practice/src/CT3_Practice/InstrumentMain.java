package CT3_Practice;

public class InstrumentMain {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[2];
        instruments[0] = new Piano();
        instruments[1] = new Guitar();

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the piano.");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the guitar.");
    }
}
