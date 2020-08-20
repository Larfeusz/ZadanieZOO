package ZadanieZOO;

public class Dog extends Animal implements Canine{

    public Dog(Integer id, String name, Float weigh) {
        super( id, name, weigh );
    }

    void sitPretty(){
        System.out.println(name+" sits pretty");
    }

    @Override
    public String toString() {
        return id+": I'm a dog. My name is " +name+
                ". I weight "+weigh+" kg.";
    }
    @Override
    public void bark(String bark) {
        System.out.println("My name is "+name+" and I am barking: bark bark bark");
    }
}
