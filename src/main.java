import API.Calculator;
import API.ConsoleScanner;
import Addition.DramaticPause;
import Model.Token;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        // Classes --------------------------------------------
        DramaticPause drama = new DramaticPause();                              // Important
        Calculator start = new Calculator();                                    // Actual API
        ConsoleScanner readInput = new ConsoleScanner();                        // Input Reader

        // API Start --------------------------------------------
        ArrayList<Token> tempTokenList = readInput.fromConsole();               // Input expression to evaluate
        drama.turnOn();                                                         // You own the right to disable it
        System.out.println(start.evaluateExpression(tempTokenList));            // Print result to console
    }
}
