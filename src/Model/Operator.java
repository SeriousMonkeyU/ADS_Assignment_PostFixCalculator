package Model;

public class Operator implements Token {
    public String character;

    public Operator(String character)
    {
        this.character = character;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public boolean isOperand() {
        return false;
    }
}
