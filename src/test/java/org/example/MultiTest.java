package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MultiTest {
    Multi multi;
    @BeforeEach
    void init(){
        multi=new Multi();
    }
    @Test
    void add() {

        int expected=2;
        int actual=multi.add(1,1);
        assertEquals(expected,actual,"Dfae adr");
    }
    @AfterEach
    void clanup(){
        System.out.println("Cleaning Up...");
    }
    @BeforeAll
    static void beforeall(){
        System.out.println("Test Started");
    }
    @AfterAll
    static void afterall(){
        System.out.println("Test Completed");
    }
    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class,()->Multi.divide(1,0),"divide by zero should throw");
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793,multi.computeCircleArea(10),"should return right circle");
    }
}