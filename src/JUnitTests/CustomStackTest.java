package JUnitTests;

import Model.CustomStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CustomStackTest {

    @Test
    void pop_z() {
        CustomStack stack = new CustomStack(new LinkedList<Integer>());
        assertThrows(Exception.class, () -> stack.pop());
    }

    @Test
    void pop_o() {
        CustomStack stack = new CustomStack(new LinkedList<Integer>());
        stack.push(5);
        assertDoesNotThrow(() -> stack.pop());
    }

    @Test
    void peek_o() {
        CustomStack stack = new CustomStack(new LinkedList<Integer>());
        stack.peek();
        assertThrows(Exception.class, () -> stack.pop());
    }
}