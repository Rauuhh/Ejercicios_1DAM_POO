package org.example;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraRGDTest {

    private Calculadora calc;

    @BeforeEach
    public void inicioPruebas(){
        calc = new Calculadora(30,10);
    }

    @AfterEach
    public void finPruebas(){
        calc=null;
    }

    @Test
    public void suma() {

        int valorEsperado = 40;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado,valorDevuelto);
    }
    @Test
    public void resta() {

        int valorEsperado = 20;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado,valorDevuelto);
    }

    @Test
    public void multiplica() {

        int valorEsperado = 300;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado,valorDevuelto);
    }

    @Test
    public void divide() {

        int valorEsperado = 3;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado,valorDevuelto);
    }

    @Test
    public void testDivideException(){
        Calculadora calc = new Calculadora(30, 0);
        String valorEsperado = "División por 0";
        String valorDevuelto = "";
        try{
            calc.divide();
        }catch (ArithmeticException error){
            valorDevuelto = error.getMessage();
        }
        assertEquals(valorEsperado,valorDevuelto);
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testSumaConValueSource(int num){
        Calculadora calc = new Calculadora(num,5);
        int valorEsperado = num + 5;
        int valorDevuelto = calc.suma();
        assertEquals(valorEsperado,valorDevuelto);
    }
    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    public void testRestaConValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5); // Segundo operando fijo en 5
        int valorEsperado = num - 5;
        int valorDevuelto = calc.resta();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void testMultiplicaConValueSource(int num) {
        Calculadora calc = new Calculadora(num, 10); // Segundo operando fijo en 10
        int valorEsperado = num * 10;
        int valorDevuelto = calc.multiplica();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30, 40, 50})
    public void testDivideConValueSource(int num) {
        Calculadora calc = new Calculadora(num, 5); // Segundo operando fijo en 5
        int valorEsperado = num / 5;
        int valorDevuelto = calc.divide();
        assertEquals(valorEsperado, valorDevuelto);
    }

    @ParameterizedTest
    @CsvSource({
            "30, 10, 40",
            "20, 5, 25",
            "15, 10, 25",
            "50, 25, 75"
    })
    public void testSumaConCsvSource(int num1, int num2, int resultadoEsperado) {
        Calculadora calc = new Calculadora(num1, num2);
        int valorDevuelto = calc.suma();
        assertEquals(resultadoEsperado, valorDevuelto);
    }
    @ParameterizedTest
    @CsvSource({
            "30, 10, 20",
            "20, 5, 15",
            "50, 20, 30"
    })
    public void testRestaConCsvSource(int num1, int num2, int resultadoEsperado) {
        Calculadora calc = new Calculadora(num1, num2);
        int valorDevuelto = calc.resta();
        assertEquals(resultadoEsperado, valorDevuelto);
    }
    @ParameterizedTest
    @CsvSource({
            "5, 2, 10",
            "7, 3, 21",
            "10, 10, 100"
    })
    public void testMultiplicaConCsvSource(int num1, int num2, int resultadoEsperado) {
        Calculadora calc = new Calculadora(num1, num2);
        int valorDevuelto = calc.multiplica();
        assertEquals(resultadoEsperado, valorDevuelto);
    }
    @ParameterizedTest
    @CsvSource({
            "30, 10, 3",
            "20, 5, 4",
            "50, 25, 2"
    })
    public void testDivideConCsvSource(int num1, int num2, int resultadoEsperado) {
        Calculadora calc = new Calculadora(num1, num2);
        int valorDevuelto = calc.divide();
        assertEquals(resultadoEsperado, valorDevuelto);
    }


}