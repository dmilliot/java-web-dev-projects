package org.launchcode;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void checkIfTrueWhenOneSet() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void checkTrueIfNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void checkThatBracketsAreBalanced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }
    @Test
    public void checkTrueIfBracketsInWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[code]"));
    }
    @Test
    public void checkThatBracketsAreNotBalanced() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode"));
    }
    @Test
    public void checkFalseIfBackwardsInWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]code["));
    }
    @Test
    public void checkFalseIfMultipleClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void checkFalseIfBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void checkFalseIfMultipleSets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Here][[[[]]] is a ]test]["));
    }
    @Test
    public void checkMoreStuff() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[Ev]}er[ything{] is [fine]["));
    }
    @Test
    public void testNumberTwelve() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

}

