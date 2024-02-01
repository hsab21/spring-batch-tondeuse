package fr.hsabek.tondeuse.domain.entites;



public class Instruction {
    private int x;
    private int y;
    private char codeOrientation;
    private String codeInstruction;
    private int xmax;
    private int ymax ;

    public Instruction(int x, int y, char codeOrientation, String codeInstruction, int xmax, int ymax) {
        this.x = x;
        this.y = y;
        this.codeOrientation = codeOrientation;
        this.codeInstruction = codeInstruction;
        this.xmax = xmax;
        this.ymax = ymax;
    }

    public int getXmax() {
        return xmax;
    }

    public void setXmax(int xmax) {
        this.xmax = xmax;
    }

    public int getYmax() {
        return ymax;
    }

    public void setYmax(int ymax) {
        this.ymax = ymax;
    }

    public String getCodeInstruction() {
        return codeInstruction;
    }

    public void setCodeInstruction(String codeInstruction) {
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


}
