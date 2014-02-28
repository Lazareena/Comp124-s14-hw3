package edu.macalester.comp124.hw3;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * @author Shilad Sen
 */
public class TestWheel {

    @Test
    public void myTest() {
        Wheel w = new Wheel();
        String u;
        for(int i = 0; i<= 100; i++){
           u = w.spin();
          assertTrue(u.equals("BAR") || u.equals("BELL") || u.equals("PLUM") || u.equals("ORANGE") || u.equals("CHERRY") || u.equals("LEMON"));

        }

        // test that the wheel behaves properly
    }
}
