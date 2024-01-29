package fr.hsabek.tondeuse.domain.entites;

public  enum InstructionTondeuse{
    DROITE('D', " droite"),
    GAUCHE('G', " gauche"),
    AVANCER('A', "Avancer");

    private String libelleInstruction;
    private char codeInstruction;

    private InstructionTondeuse(char codeInstruction, String libelleInstruction) {
        this.libelleInstruction = libelleInstruction;
        this.codeInstruction = codeInstruction;
    }

    public String getLibelleInstruction() {
        return libelleInstruction;
    }
    public char getCodeInstruction() {
        return codeInstruction;
    }

}