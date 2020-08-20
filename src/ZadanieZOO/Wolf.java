package ZadanieZOO;

public class Wolf extends Animal implements Canine{

    private Integer fangLength;

    public Wolf(Integer id, String name, Float weigh, Integer furLength, Integer fangLength) {
        super( id, name, weigh );
        this.fangLength = fangLength;
    }

    @Override
    public String toString() {
        return id+": I'm a wolf. My name is " +name+
                ". I weight "+weigh+" kg, my fur lenght is " + fangLength +
                " and my fang length is "+fangLength+".";
    }
    @Override
    public void bark(String bark) {
        System.out.println("My name is "+name+" and I am barking: BARK BARK BARK");
    }

    public Integer getFangLength() {
        return fangLength;
    }
    public void setFangLength(Integer fangLength) {
        this.fangLength = fangLength;
    }
}
