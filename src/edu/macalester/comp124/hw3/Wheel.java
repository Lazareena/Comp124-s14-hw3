package edu.macalester.comp124.hw3;

import acm.util.RandomGenerator;

/**
 *
 */
public class Wheel {
    private String fruit1, fruit2, fruit3, fruit4, fruit5, fruit6;

    public Wheel() {
        this.fruit1= "CHERRY";
        this.fruit2= "LEMON";
        this.fruit3= "ORANGE";
        this.fruit4= "PLUM";
        this.fruit5= "BELL";
        this.fruit6= "BAR";
    }

    public String spin() {
     RandomGenerator rgen = RandomGenerator.getInstance();
     int a =  rgen.nextInt(5);
        if (a == 0) {
            return fruit1;
        } else if (a == 1) {
            return fruit2;
        } else if (a == 2) {
            return fruit3;
        } else if (a == 3) {
            return fruit4;
        } else if (a == 4) {
            return fruit5;
        } else if (a == 5) {
            return fruit6;
        }
     return fruit1;
    }
}
