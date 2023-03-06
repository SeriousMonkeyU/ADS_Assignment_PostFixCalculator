package API;

import Model.CustomStack;
import Model.Token;

import java.util.ArrayList;
import java.util.LinkedList;

public class Calculator {

    public int evaluateExpression(ArrayList<Token> tokenList) throws Exception {
        if(tokenList.size() > 100) throw new StringIndexOutOfBoundsException();

        CustomStack stack = new CustomStack(new LinkedList<Integer>());

        if(!tokenList.get(0).isOperand() || !tokenList.get(1).isOperand()) throw new Exception("First two characters are not operators!!!");

        for(int i = 0; i < tokenList.size(); i ++)
        {
            try {
                if(tokenList.get(i).isOperand())Integer.parseInt(tokenList.get(i).getCharacter());
            }
            catch (NumberFormatException e) {
                throw new Exception(tokenList.get(i).getCharacter() + " is not a valid operator/operand");
            }

            if(tokenList.get(i).isOperand())stack.push(Integer.parseInt(tokenList.get(i).getCharacter()));
            else
            {
                int stackPop1 = stack.pop(), stackPop2 = stack.pop();
                stack.push(getResult(stackPop2, stackPop1, tokenList.get(i).getCharacter()));
            }
        }

        return stack.pop();
    }

    private static int getResult(int operand1, int operand2, String operator)
    {
        switch (operator)
        {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": return operand1 / operand2;
            case "%": return operand1 % operand2;
            default: throw new IllegalArgumentException();
        }
    }
}
