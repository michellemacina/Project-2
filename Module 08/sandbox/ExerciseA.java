package sandbox;

class MusicalInstrument {
    void play() {
        System.out.println("music sound");
    }
}

class Guitar extends MusicalInstrument {
    @Override
    void play() {
        System.out.println("guitar sound");
    }
}

class Piano extends MusicalInstrument {
    @Override
    void play() {
        System.out.println("pinao sound");
    }
}

class Drums extends MusicalInstrument {
    @Override
    void play() {
        System.out.println("drum sound");
    }

}

public class ExerciseA {
public static void main(String[] args){
   MusicalInstrument[]  instruments = {
    new Guitar(),
    new Piano(),
    new Drums(),
   }
   // something more goes here 

}
}
