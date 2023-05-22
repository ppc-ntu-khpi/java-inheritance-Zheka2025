package domain;

public class Pantera extends Predator {

    private String kind;

    public Pantera(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Pantera() {
        this("Fluffy",4,"just a pantera");
    }

    public Pantera(String name) {
        this(name,4,"just a pantera");
    }
        

    public void play() {
        System.out.println("pantera is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Pantera hunting for a cat...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Pantera!";
    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Pantera eats meat...");
    }
    
    
}
