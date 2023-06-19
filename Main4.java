class Instrument {
    public void play() {
        System.out.println("Playing the instrument");
    }
}

class Piano extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

class Guitar extends Instrument {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Instrument instrument1 = new Piano();
        Instrument instrument2 = new Guitar();
        instrument1.play();
        instrument2.play();
    }
}

