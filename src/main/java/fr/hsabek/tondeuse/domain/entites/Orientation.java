package fr.hsabek.tondeuse.domain.entites;




public  enum Orientation {
    NORTH('N', "Nord"),
    EAST('E', "est"),
    WEST('W', "ouest"),
    SOUTH('S', "sud");

    private char codeOrientation;
    private String libelleOrientation;

    private Orientation(char codeOrientation, String libelleOrientation){
        this.codeOrientation = codeOrientation;
        this.libelleOrientation = libelleOrientation;
    }
    public char getCodeOrientation() {
        return codeOrientation;
    }
    public String getLibelleOrientation() {
        return libelleOrientation;
    }
}
