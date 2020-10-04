package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {

    @Test
    void add() {
        Multi multi=new Multi();
        int expected=2;
        int actual=multi.add(1,1);
        assertEquals(expected,actual,"Dfae adr");

    }
}