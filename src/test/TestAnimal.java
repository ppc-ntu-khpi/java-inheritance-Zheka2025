package test;

import domain.Pantera;

public class TestAnimal {

    public static void main(String[] args) {
        Pantera pantera = new Pantera("Thomas");
        System.out.println(pantera);
        pantera.hunt();
        pantera.eat();
        pantera.speak();
       pantera.play();
    }
}
