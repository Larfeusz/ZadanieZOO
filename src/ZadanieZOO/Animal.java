package ZadanieZOO;

import java.util.*;

public abstract class Animal {

    protected Integer id;
    public String name;
    public Float weigh;

    public Animal(Integer id, String name, Float weigh) {
        this.id = id;
        this.name = name;
        this.weigh = weigh;
    }

    void introduce(List<Animal> animalList){}
}
