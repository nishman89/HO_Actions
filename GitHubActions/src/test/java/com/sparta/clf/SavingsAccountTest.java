package com.sparta.clf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class SavingsAccountTest {
    @Test
    public void testAddInterest() {
        SavingsAccount myAccount = new SavingsAccount(1000, 5);
        myAccount.addInterest();
        assertEquals(1050, myAccount.getBalance(), 0.001);
    }
    @Test
    public void filaingTest(){
        assertFalse(true);
    }
}

