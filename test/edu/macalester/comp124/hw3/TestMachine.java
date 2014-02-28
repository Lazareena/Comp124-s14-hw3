package edu.macalester.comp124.hw3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class TestMachine {

    @Test
    public void myTest() {
    Machine m = new Machine();
    assertEquals(300, m.slotMachine(50, "BAR","BAR","BAR"));
    assertEquals(70, m.slotMachine(50, "BELL","BELL","BAR"));
    assertEquals(70, m.slotMachine(50, "BELL","BELL","BELL"));
    assertEquals(64, m.slotMachine(50, "PLUM","PLUM","PLUM"));
    assertEquals(64, m.slotMachine(50, "PLUM","PLUM","BAR"));
    assertEquals(60, m.slotMachine(50, "ORANGE","ORANGE","ORANGE"));
    assertEquals(60, m.slotMachine(50, "ORANGE","ORANGE","BAR"));
    assertEquals(57, m.slotMachine(50, "CHERRY","CHERRY","CHERRY"));
    assertEquals(55, m.slotMachine(50, "CHERRY","CHERRY", "BAR" ));
    assertEquals(52, m.slotMachine(50, "CHERRY","PLUM ", "BAR " ));
        // test that the machine behaves properly
    }
    }
