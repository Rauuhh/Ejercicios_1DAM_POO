package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculadoraRGDTest.class,
        OtraClaseDePruebas.class
})
public class SuitePruebasCalcRGD {
}
