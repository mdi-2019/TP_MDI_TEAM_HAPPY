package org.esir.mdi_tp1_GLTPQ;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceNormaleTest {

    CalculatriceNormale calc = new CalculatriceNormale();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addition() {
        assert(calc.addition(1,1) == 2);
    }

    @Test
    void addition1() {
        assert(calc.addition(1, 1) == 2);
    }

    @Test
    void addition2() {
        assert(calc.addition(1.0, 1.0) == 2.0);
    }

    @Test
    void soustraction() {
        assert(calc.soustraction(1.0, 1.0) == 0.0);
    }

    @Test
    void soustraction1() {
        assert(calc.soustraction(1, 1) == 0);
    }
}