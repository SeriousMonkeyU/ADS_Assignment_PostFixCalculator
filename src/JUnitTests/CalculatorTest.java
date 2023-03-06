package JUnitTests;

import API.Calculator;
import Model.Operand;
import Model.Operator;
import Model.Token;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void constructor_z() {
        assertDoesNotThrow(() -> new Calculator());
    }

    @Test
    void evaluateExpression_m() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand("1"));
        tokens.add(new Operand("2"));
        assertDoesNotThrow(() -> calc.evaluateExpression(tokens));
    }

    @Test
    void evaluateExpression_m_f() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        tokens.add(new Operand("1"));
        tokens.add(new Operand("$"));
        assertThrows(Exception.class, () -> calc.evaluateExpression(tokens));
    }

    @Test
    void evaluateExpression_b() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < 100; i ++)
        {
            tokens.add(new Operand("1"));
        }
        assertDoesNotThrow(() -> calc.evaluateExpression(tokens));
    }

    @Test
    void evaluateExpression_b_f() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < 101; i ++)
        {
            tokens.add(new Operand("1"));
        }
        assertThrows(Exception.class, () -> calc.evaluateExpression(tokens));
    }

    @Test
    void evaluateExpression_i() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < 15; i ++)
        {
            tokens.add(new Operand("5"));
        }
        tokens.add(new Operator("%"));
        assertDoesNotThrow(() -> calc.evaluateExpression(tokens));
    }

    @Test
    void evaluateExpression_i_f() {
        Calculator calc = new Calculator();
        ArrayList<Token> tokens = new ArrayList<>();
        for (int i = 0; i < 15; i ++)
        {
            tokens.add(new Operand("5"));
        }
        tokens.add(new Operator("$"));
        assertThrows(Exception.class, () -> calc.evaluateExpression(tokens));
    }
}