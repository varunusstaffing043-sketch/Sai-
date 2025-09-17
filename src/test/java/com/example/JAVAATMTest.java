package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class JAVAATMTest {

    @Test
    void happyPath() {
        JAVAATM atm = new JAVAATM(5000, 1234);
        assertTrue(atm.checkBalance(1234).contains("5000"));
        assertTrue(atm.deposit(1000, 1234).contains("deposited"));
        assertTrue(atm.withdraw(2000, 1234).contains("withdrawn"));
        assertTrue(atm.checkBalance(1234).contains("4000"));
    }

    @Test
    void wrongPinMessage() {
        JAVAATM atm = new JAVAATM(5000, 1234);
        assertEquals("Invalid PIN. Access denied.", atm.checkBalance(9999));
    }
}  
