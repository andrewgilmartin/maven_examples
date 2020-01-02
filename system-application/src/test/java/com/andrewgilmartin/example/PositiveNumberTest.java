package com.andrewgilmartin.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class PositiveNumberTest {
    
    @Test
    public void testPositive() {
        PositiveNumber t1 = new PositiveNumber(1);
        PositiveNumber t2 = new PositiveNumber(1);        
        assertEquals(t1, t2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegative() {
        PositiveNumber t1 = new PositiveNumber(-1);
    }
    
    @Test
    public void testAdd() {
        PositiveNumber one = new PositiveNumber(1);
        PositiveNumber two = new PositiveNumber(2);
        PositiveNumber three = new PositiveNumber(3);
        
        PositiveNumber t1 = one.add(two);
        assertEquals(three,t1);
        
        PositiveNumber t2 = two.add(one);
        assertEquals(three,t2);
    }
    
    @Test
    public void testSub() {
        PositiveNumber one = new PositiveNumber(1);
        PositiveNumber two = new PositiveNumber(2);
        PositiveNumber three = new PositiveNumber(3);
        
        PositiveNumber t1 = three.sub(one);
        assertEquals(two,t1);
        
        PositiveNumber t2 = three.sub(two);
        assertEquals(one,t2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubNegative() {
        PositiveNumber one = new PositiveNumber(1);
        PositiveNumber two = new PositiveNumber(2);
        
        PositiveNumber t1 = one.sub(two);
    }
    
}
