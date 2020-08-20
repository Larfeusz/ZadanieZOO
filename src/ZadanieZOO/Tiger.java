package ZadanieZOO;

public class Tiger extends Animal{

    private Integer clawLength;

    public Tiger(Integer id, String name, Float weigh, Integer clawLength) {
        super( id, name, weigh );
    }

    @Override
    public String toString() {
        return id+": I'm a tiger. My name is " +name+
                ". I weight "+weigh+" kg and my claw lenght is " + clawLength +
                ".";
    }
}
