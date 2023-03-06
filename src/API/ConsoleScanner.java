package API;

import Model.Operand;
import Model.Operator;
import Model.Token;

import java.util.ArrayList;

public class ConsoleScanner {

    public ArrayList<Token> fromConsole()
    {
        ArrayList<Token> tokenList = new ArrayList<>();
        java.util.Scanner scanf = new java.util.Scanner(System.in);
        String lineOfTokens;

        // Scanners --------------------------------------------
        System.out.println("Input tokens split with spaces: ");
        lineOfTokens = scanf.nextLine();                                // Scan the line

        // Cast to ArrayList --------------------------------------------
        String[] tokenArray = lineOfTokens.split(" ", -2);   // Split line into array of tokens

        for(int i = 0; i < tokenArray.length; i++)                      // Decide on token type (Model.Operand/Model.Operator)
        {
            if(tokenArray[i].equals("+") || tokenArray[i].equals("-") || tokenArray[i].equals("*") || tokenArray[i].equals("/") || tokenArray[i].equals("%"))
                tokenList.add(new Operator(tokenArray[i]));
            else tokenList.add(new Operand(tokenArray[i]));
        }
        return tokenList;
    }
}
