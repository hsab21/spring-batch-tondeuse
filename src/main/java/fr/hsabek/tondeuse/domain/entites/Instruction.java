package fr.hsabek.tondeuse.domain.entites;



public class Instruction {
    private int x;
    private int y;
    private char codeOrientation;
    private char codeInstruction;

    public Instruction(int x, int y, char codeOrientation, char codeInstruction) {
        this.x = x;
        this.y = y;
        this.codeOrientation = codeOrientation;
        this.codeInstruction = codeInstruction;
    }

    public Instruction() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getCodeOrientation() {
        return codeOrientation;
    }

    public void setCodeOrientation(char codeOrientation) {
        this.codeOrientation = codeOrientation;
    }

    public char getCodeInstruction() {
        return codeInstruction;
    }

    public void setCodeInstruction(char codeInstruction) {
        this.codeInstruction = codeInstruction;
    }
}
