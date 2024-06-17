package org.example;

import org.example.ArmstrongNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AmstrongNumberTest {
    @Test
    public void testArmstrongNumber() {
        boolean isArmstrong = ArmstrongNumber.isArmstrong(153);
        assertTrue(isArmstrong, "153 should be an Armstrong number");

        if (isArmstrong) {
            System.out.println("Test case passed: 153 is an Armstrong number.");
        }
    }

    @Test
    public void testNotArmstrongNumber() {
        boolean isNotArmstrong = ArmstrongNumber.isArmstrong(230);
        assertFalse(isNotArmstrong, "230 should not be an Armstrong number");

        if (!isNotArmstrong) {
            System.out.println("Test case passed: 230 is not an Armstrong number.");
        }
    }
}
