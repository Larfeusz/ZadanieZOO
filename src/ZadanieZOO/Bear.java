package ZadanieZOO;

import java.util.List;

public class Bear extends Animal{

    private Integer furLenght;

    public Bear(Integer id, String name, Float weigh, Integer furLenght) {
        super( id, name, weigh );
        this.furLenght = furLenght;
    }

    @Override
    void introduce(List<Animal> animalList) {
        for (Animal animal : animalList) {
            super.introduce( animalList );
            System.out.println(animal);
        }
    }
    @Override
    public String toString() {
        return id+": I'm a bear. My name is " +name+
                ". I weight "+weigh+" kg and my fur lenght is " + furLenght +
                ".";
    }

    public Integer getFurLenght() {
        return furLenght;
    }

    public void setFurLenght(Integer furLenght) {
        this.furLenght = furLenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
