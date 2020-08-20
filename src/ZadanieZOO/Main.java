package ZadanieZOO;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalsList = new ArrayList<>();
        Bear bear = new Bear(1, "YOGI",200.0F,40);
        animalsList.add( bear );
        Tiger tiger = new Tiger( 2,"Jataka",150F,25 );
        animalsList.add( tiger );

        List<Animal>howlers = new ArrayList<>();
        Wolf wolf = new Wolf( 3,"Howler", 70F,40 , 6 );
        howlers.add( wolf );
        Dog dog = new Dog(4,"Scooby",30F);
        howlers.add( dog );

        for (Animal animals : howlers) {
            animalsList.add( animals );

        }
        bear.introduce( animalsList );

        for (Animal howler : howlers) {
            if (howler == dog){
                dog.bark( howler.name );
                dog.sitPretty();
            }
            if (howler == wolf){
                wolf.bark( howler.name );
            }
        }
    }
}
