package fr.hsabek.tondeuse.TraitementBatch;

import fr.hsabek.tondeuse.domain.entites.Coordonnees;
import fr.hsabek.tondeuse.domain.entites.InstructionTondeuse;
import fr.hsabek.tondeuse.domain.entites.Orientation;
import fr.hsabek.tondeuse.domain.entites.PositionTondeuse;

public class TraitementInstruction {

    private TraitementInstruction(){

    }


    public static Coordonnees avancerTondeuse(PositionTondeuse positionTondeuse, Coordonnees coordonnesMax) throws Exception{
        Coordonnees coordonneesSuivantes = null;
        int x = 0, y = 0;
        switch (positionTondeuse.getOrientationTondeuse()) {
            case NORTH:
                x = positionTondeuse.getCoordonneesTondeuse().getX();
                y = positionTondeuse.getCoordonneesTondeuse().getY() + 1;
                break;
            case EAST:
                x = positionTondeuse.getCoordonneesTondeuse().getX() + 1;
                y = positionTondeuse.getCoordonneesTondeuse().getY();
                break;
            case SOUTH:
                x = positionTondeuse.getCoordonneesTondeuse().getX();
                y = positionTondeuse.getCoordonneesTondeuse().getY() - 1;
                break;
            case WEST:
                x = positionTondeuse.getCoordonneesTondeuse().getX() - 1;
                y = positionTondeuse.getCoordonneesTondeuse().getY();
                break;

        }
        coordonneesSuivantes = new Coordonnees(x, y);
        // si les nouvelles coordonnées sont en dehors de la pelouse, on garde
        // la derniere position connue
        if (coordonneesSuivantes != null
                && coordonnesMax.positionHorsPelouse(coordonneesSuivantes)) {
            return coordonneesSuivantes;
        } else {
            return positionTondeuse.getCoordonneesTondeuse();
        }
    }


    public static Orientation pivoterDroite(Orientation orientation) throws Exception{
        Orientation orientationSuivante = null ;
        switch (orientation){
            case NORTH :
                orientationSuivante =  Orientation.EAST;
                break;
            case EAST :
                orientationSuivante =  Orientation.SOUTH;
                break;
            case SOUTH :
                orientationSuivante =  Orientation.WEST;
                break;
            case WEST :
                orientationSuivante =  Orientation.NORTH;
                break;

        }
        return orientationSuivante;
    }


    public static Orientation pivoterGauche(Orientation orientation) throws Exception{
        Orientation orientationSuivante = null ;
        switch (orientation){
            case NORTH :
                orientationSuivante =  Orientation.WEST;
                break;
            case EAST :
                orientationSuivante =  Orientation.NORTH;
                break;
            case SOUTH :
                orientationSuivante =  Orientation.EAST;
                break;
            case WEST :
                orientationSuivante =  Orientation.SOUTH;
                break;

        }
        return orientationSuivante;
    }


    public static void executerInstruction(PositionTondeuse positionTondeuse, InstructionTondeuse instruction, Coordonnees coordonnesMax) throws Exception{

        switch (instruction){
            case AVANCER :
                positionTondeuse.setCoordonneesTondeuse(TraitementInstruction.avancerTondeuse(positionTondeuse, coordonnesMax));
                break;
            case DROITE :
                positionTondeuse.setOrientationTondeuse(TraitementInstruction.pivoterDroite(positionTondeuse.getOrientationTondeuse()));
                break;
            case GAUCHE :
                positionTondeuse.setOrientationTondeuse(TraitementInstruction.pivoterGauche(positionTondeuse.getOrientationTondeuse()));
                break;

        }
    }
}
