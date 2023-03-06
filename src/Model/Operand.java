package Model;

public class Operand implements Token{
    public String character;

    public Operand(String character) {
        this.character = character;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public boolean isOperand() {
        return true;
    }
}
