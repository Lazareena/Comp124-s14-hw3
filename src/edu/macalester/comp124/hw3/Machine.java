package edu.macalester.comp124.hw3;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

/**
 */
public class Machine extends ConsoleProgram {
    /**
     * The main function for the entire program.
     *
     * You should create other helper methods inside Machine.
     * Some of them should create instances of the Wheel class.
     * Make sure to test your new methods in the TestMachine junit class.
     *
     */
 Wheel A, B, C;

        Wheel w1 = new Wheel();
        Wheel w2 = new Wheel();
        Wheel w3 = new Wheel();


    public void run(){
        String a = readLine("Would you like instructions?");
        if (a.equals("no")) {
        String b = readLine( "You have $50. Would you like to play?");

            int x = 50;
            int newx;

               while(b.equals("yes")) {
                   x--;
                   newx = x;

                   String row1 = w1.spin();
                   String row2 = w2.spin();
                   String row3 = w3.spin();

                   x = slotMachine(x, row1, row2, row3);
                   println( row1 + " " + row2 + " " + row3 );
                   if (newx == x) {
                    println("--You loose");
                   }
                   else if (x > newx) {
                   println("--You win");
                   }

                b =  readLine( "You have $" + x + "." + "Would you like to play?");
               }
           }
        }


    public int slotMachine(int a, String row1, String row2, String row3){



        if ((row1.equals("BAR") && row2.equals("BAR")) && row3.equals("BAR")) {
        a += 250;
        }

        else if ((row1.equals("BELL") && row2.equals("BELL") && (row3.equals("BELL") || row3.equals("BAR")))) {
         a += 20;
        }

        else if ((row1.equals("PLUM") && row2.equals("PLUM")) && (row3.equals("PLUM") || row3.equals("BAR"))) {
         a += 14;
        }

        else if ((row1.equals("ORANGE") && row2.equals("ORANGE")) && (row3.equals("ORANGE") || row3.equals("BAR"))) {
         a += 10;
        }

        else if ((row1.equals("CHERRY") && row2.equals("CHERRY")) && row3.equals("CHERRY")) {
        a += 7;
        }

        else if ((row1.equals("CHERRY") && row2.equals("CHERRY"))) {
        a += 5;
        }

        else if ((row1.equals("CHERRY"))) {
        a += 2;
    }


return a;

}

}





